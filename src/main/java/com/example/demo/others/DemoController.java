package com.example.demo.others;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @RequestMapping("/")
    public String a(){
        return "abc";
    }


}
