package kr.co.dreamers.photograph.interfaces;

import kr.co.dreamers.photograph.main.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping ("/")
//상단 Mapping은 Request로

public class WelcomeContoroller {

    @Autowired
    private MainService main;

    @GetMapping
    public String wellcome(HttpServletRequest req, HttpServletResponse res) {
        main.test();
        return "Wellcome!!";
    }

    @GetMapping ("hello")
    public String hello() {
        return "Hello, world!!";
    }
}
