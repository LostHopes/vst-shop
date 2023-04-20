package com.project.music.vst.pages;

import org.springframework.stereotype.Controller;

@Controller
public class Home {
    public String homePage(){
        return "index";
    }
}
