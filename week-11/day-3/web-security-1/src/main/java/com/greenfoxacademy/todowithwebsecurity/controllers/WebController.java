package com.greenfoxacademy.todowithwebsecurity.controllers;

import com.greenfoxacademy.todowithwebsecurity.models.SiteUser;
import com.greenfoxacademy.todowithwebsecurity.services.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
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
    if (!(siteUser.getUserName().equals("")) && !(siteUser.getPassword().equals(""))) {
      if (webService.ifSiteUserAttributesCorrect(siteUser)) {
        Cookie userCookie = new Cookie("userName", siteUser.getUserName());
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
    if (webService.isCorrectCookie(userNameFromCookie)) {
      model.addAttribute("repoList", webService.fullTodoList());
      return "main";
    } else {
      return "redirect:/login";
    }
  }
}
