package com.codurance.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

  @RequestMapping("/hello")
  public @ResponseBody String greeting() {
    return "hello";
  }

  @RequestMapping("/hello2")
  public @ResponseBody String greeting2() {
    return "hello new deployment";
  }
}
