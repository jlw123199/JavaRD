package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("video")
public class VideoController {

    @RequestMapping("/")
    public String videoJumpPage() {
        return "video";
    }
}
