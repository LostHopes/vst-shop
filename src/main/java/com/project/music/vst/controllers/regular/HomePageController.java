package com.project.music.vst.controllers.regular;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomePageController {

    @Autowired
    private ResourceLoader resourceLoader;

    @GetMapping("/")
    @ResponseBody
    public String home() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:templates/index.html");
        InputStream inputStream = resource.getInputStream();
        String html = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
        return html;
    }
}
