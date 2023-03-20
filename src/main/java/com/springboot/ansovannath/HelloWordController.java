package com.springboot.ansovannath;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @GetMapping("/hello-word")
    public String hellWord(){
        return "Hello Word!";
    }
}
