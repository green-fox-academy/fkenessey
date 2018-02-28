package com.greenfoxacademy.todowithwebsecurity.controllers;

import com.greenfoxacademy.todowithwebsecurity.models.SiteUser;
import com.greenfoxacademy.todowithwebsecurity.services.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class WebController extends HttpServlet {

  @Autowired
  WebService webService;

  @GetMapping("/login")
  public String showLogin(Model model) {
    model.addAttribute("siteUser", new SiteUser());
    return "login";
  }

  @PostMapping("/login")
  public String postLogin(@ModelAttribute(value = "siteUser") SiteUser siteUser, HttpServletResponse response) {
    if (!(siteUser.getUsername().equals("")) && !(siteUser.getPassword().equals(""))) {
      if (webService.ifSiteUserAttributesCorrect(siteUser)) {
        Cookie userCookie = new Cookie("username", siteUser.getUsername());
        userCookie.setPath("/");
        userCookie.setMaxAge(60);
        response.addCookie(userCookie);
        return "redirect:/";
      } else {
        return "redirect:/login";
      }
    } else {
      return "redirect:/login";
    }
  }

  @GetMapping("/")
  public String howMain(@CookieValue(value = "userName", defaultValue = "NotValid") String userNameFromCookie, Model model) {
    /*if (webService.isCorrectCookie(userNameFromCookie)) {
      model.addAttribute("repoList", webService.fullTodoListByUserName(userNameFromCookie));
      return "main";
    } else {
      return "redirect:/login";
    }*/
    model.addAttribute("repoList", webService.fullTodoListByUserName(userNameFromCookie));
    return "main";
  }

  /*@GetMapping("/logout")
  public String logOutUser(@CookieValue(value = "userName", defaultValue = "NotValid") String userNameFromCookie
          , HttpServletResponse response, HttpServletRequest request) {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    Cookie userCookie = new Cookie("userName", userNameFromCookie);
    userCookie.setPath("/");
    userCookie.setMaxAge(0);
    response.addCookie(userCookie);

    if (auth != null) {
      new SecurityContextLogoutHandler().logout(request, response, auth);
    }
    return "redirect:/loggedout";
  }*/
}
