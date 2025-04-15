package com.nhnacademy.hello.auth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {

    private static final Logger log = LoggerFactory.getLogger(AuthController.class);


    @GetMapping("/login")
    public String loginPage() {
        log.info("test");
        return "auth/login";
    }

    @GetMapping("/register")
    public String registerPage(){
        return "auth/register";
    }
}
