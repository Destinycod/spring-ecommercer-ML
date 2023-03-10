package com.curso.ecommerce.app.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin("*")
@Controller
@RequestMapping(value = "/managers", produces = MediaType.APPLICATION_JSON_VALUE)
public class ManagerController {

    @GetMapping("")
    public String home(){
        return "manager/home";
    }
}
