package com.codestates.githubtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String helloWorld(){
        return "To-do Application !";
    }

    @GetMapping("/to-do")
    public String toTo(){
        return "take a rest";
    }
}
