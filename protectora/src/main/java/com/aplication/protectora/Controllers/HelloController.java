package com.aplication.protectora.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    
    @GetMapping("/hello")
    public String hello() {
        //return "Hello, world! cambiado 16 Abril 2023";
    
        return "main";
    }

}
