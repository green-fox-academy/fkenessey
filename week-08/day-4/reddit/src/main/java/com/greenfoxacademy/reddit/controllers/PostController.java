package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/posts")
public class PostController {

  @Autowired
  PostService postService;

  @GetMapping("/")
  public String listPosts(Model model) {
    model.addAttribute("posts", postService.listAllPosts());
    return "home";
  }

  @GetMapping("/add")
  public String addPostGet(Model model) {
    model.addAttribute("post", postService.createEmptyPost());
    return "addpost";
  }

  @PostMapping("/add")
  public String addPostPost(@ModelAttribute("post") Post providedPost) {
    postService.addPostToRepository(providedPost);
    return "redirect:/posts/";
  }

  @GetMapping("/actionplus/{id}")
  public String plusOneAction(@PathVariable("id") Long id) {
    postService.increaseScorePerClick(id);
    return "redirect:/posts/";
  }

  @GetMapping("/actionminus/{id}")
  public String minusOneAction(@PathVariable("id")Long id) {
    postService.decreaseScorePerClick(id);
    return "redirect:/posts/";
  }
}
