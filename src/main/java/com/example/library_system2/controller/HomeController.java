package com.example.library_system2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /**
     * 이름 등록 페이지로 이동
     * @return
     */
    @GetMapping("/")    //localhost8080 시작 화면 지정
    public String home(){
        return "home";
    }

}
