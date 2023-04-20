package com.project.music.vst.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class About {
    @GetMapping("/about")
    public String aboutPage(){
        return "about";
    }
}
    