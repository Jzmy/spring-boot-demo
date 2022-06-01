package com.duing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
@Controller
public class FreeMarkerTest {
    @RequestMapping("/ftl")
    public String testFreeMarker(Model model){
        model.addAttribute("now",new Date());
        return "index.ftl";
    }
}
