package com.bootapp.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UIController {

    @RequestMapping("/login")
    public ModelAndView loginpage(){
        return new ModelAndView("login");
    }
}
