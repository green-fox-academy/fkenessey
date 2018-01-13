package com.greenfoxacademy.usefulutilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

  @Autowired
  UtilityService u;

  @GetMapping(value = "/")
  public ModelAndView initial(Model model){
    u.initialiseEmailAddress();
    return new ModelAndView("redirect:/useful");
  }

  @GetMapping(value = "/useful")
  public String home(Model model){
    model.addAttribute("colour", u.getbColour());
    model.addAttribute("inputLink", u.getEmailAddress());
    model.addAttribute("valid", u.isValidEmail());
    model.addAttribute("ctext", u.getCeasarText());
    model.addAttribute("cnum", u.getCeasarNum());
    model.addAttribute("caesarCoded",u.getCaesarCoded());
    return "homepage";
  }

  @RequestMapping(value = "/useful/colored", method = RequestMethod.POST)
  public ModelAndView colored(Model model){
    u.bColourRandomizer();
    model.addAttribute("colour", u.getbColour());
    return new ModelAndView("redirect:/useful");
  }

  @RequestMapping(value = "/useful/email", method = RequestMethod.POST)
  public ModelAndView email(@ModelAttribute(value = "inputLink") String inputLink, Model model){
    u.validateEmail(inputLink);
    return new ModelAndView("redirect:/useful");
  }

  @RequestMapping(value = "/useful/encoding", method = RequestMethod.POST)
  public ModelAndView encode(@RequestParam(value = "ctexte") String ctexte, @RequestParam(value = "cnume") int cnume, Model model){
    u.caesar(ctexte, cnume);
    return new ModelAndView("redirect:/useful");
  }

  @RequestMapping(value = "/useful/decoding", method = RequestMethod.POST)
  public ModelAndView decode(@RequestParam(value = "ctextd") String ctextd, @RequestParam(value = "cnumd") int cnumd, Model model){
    u.caesar(ctextd, -cnumd);
    return new ModelAndView("redirect:/useful");
  }
}
