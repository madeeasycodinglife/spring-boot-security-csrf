package com.madeeasy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CsrfController {

    @GetMapping("/demo")
    public String welcome(){
        return "welcome";
    }
    @PostMapping("/demo")
    public String csrfWorking(){
        return "csrf is working";
    }
}
