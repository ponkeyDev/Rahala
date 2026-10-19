
package com.rahala.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/")
    public String index(){
        return "Life starts here, I can do it any where!!!";
    }

} 