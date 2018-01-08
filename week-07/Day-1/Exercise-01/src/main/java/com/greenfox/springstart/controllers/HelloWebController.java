package com.greenfox.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  AtomicLong counter = new AtomicLong(0);

  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  String[] colour = {"red", "blue", "yellow", "green", "grey"};

  String[] size = {"5", "20", "40", "60", "80"};

  @RequestMapping(value = "/web/greeting")
  public String greeting(Model model) {
    model.addAttribute("hello", hellos[(int)(Math.random() * hellos.length)]);
    model.addAttribute("counter", counter.getAndAdd(1));
    model.addAttribute("colour", colour[(int)(Math.random() * colour.length)]);
    model.addAttribute("fsize", size[(int)(Math.random() * size.length)]);
    return "greeting";
  }
}
