package com.raisetech.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@RestController
public class HelloworldController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello,World!";
    }

    @GetMapping("/timeStamp")
    public String timeStamp() {
        LocalDateTime now = LocalDateTime.now();
        String nowTime = now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        return nowTime;

    }
}




