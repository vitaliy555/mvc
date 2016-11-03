package com.mkyong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("security")
public class SecurityController {

    @RequestMapping("login")
    public String login() {
        return "login";
    }

    @RequestMapping("userPermit")
    public String userPermit() {
        return "Access user";
    }

    @RequestMapping("adminPermit")
    public String adminPermit() {
        return "Access admin";
    }

    @RequestMapping("allWithoutRole")
    public String allWithoutRole() {
        return "Access";
    }
}
