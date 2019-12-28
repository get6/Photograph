package kr.co.dreamers.photograph.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping ("/")
//상단 Mapping은 Request로

public class WelcomeContoroller {

    @GetMapping
    public String wellcome(HttpServletRequest req, HttpServletResponse res) {
        return "Wellcome!!";
    }

    @GetMapping ("hello")
    public String hello() {
        return "Hello, world!!";
    }
}
