package kr.co.dreamers.photograph.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/")
//상단 Mapping은 Request로

public class WelcomeContoroller {


    @GetMapping
    public String wellcome() {
        return "Wellcome!!";
    }

    @GetMapping ("hello")
    public String hello() {
        return "Hello, world!!";
    }
}
