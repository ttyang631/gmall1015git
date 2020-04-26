package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {

    @ResponseBody
    @RequestMapping("index")
    public String demo(){
        int b = 2;
        return "helloABccdd";
    }

}
