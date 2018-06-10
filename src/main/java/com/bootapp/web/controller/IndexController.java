package com.bootapp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {
    @RequestMapping(value = {"/","index"})
    public ModelAndView getIndexPage() {
        return new ModelAndView("index");
    }
/*
    @RequestMapping(value = "/error")
    public ModelAndView getErrorPage() {
        return new ModelAndView("index");
    }*/
}
