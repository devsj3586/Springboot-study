package com.example.formtest.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/goSignUp")
    public String goSignUp () {
        return "signup";
    }

    @GetMapping("/goLogin")
    public String goLogin () {
        return "login";
    }

}
