package com.sl.springoauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/all")
    public String home() {
        return "Hello Keyclock , secured end point";
    }

    @GetMapping("/admin")
    public String adminhome() {
        return "Hello Keyclock-admin, secured end point";
    }


    @GetMapping("/user")
    public String userhome() {
        return "Hello Keyclock-user, secured end point";
    }
}
