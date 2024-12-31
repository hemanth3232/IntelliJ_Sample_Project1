package com.eazybytes.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @GetMapping("/hello")
    public String sayHello(){
        System.out.println("hi");
        return "Hello Hemanth From SpringBoot";
    }
}
