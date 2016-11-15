package com.mkyong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
@RequestMapping("security")
public class SecurityController {
    private final String ERROR_OBJECT_JSP = "error";

    @RequestMapping("welcome")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping("login")
    public ModelAndView login(@RequestParam(required = false) String error) {
        ModelAndView modelAndView = new ModelAndView("login");
        if (error != null) {
            modelAndView.addObject(ERROR_OBJECT_JSP, "Invalid user or password");
        }
        return modelAndView;
    }

    @RequestMapping("userPermit")
    @ResponseBody
    public String userPermit() {
        return "Access user";
    }

    @RequestMapping("adminPermit")
    @ResponseBody
    public String adminPermit() {
        return "Access admin";
    }

    @RequestMapping("accessDenied")
    public ModelAndView accessDenied(Principal user) {
        ModelAndView modelAndView = new ModelAndView("accessDenied");
        if (user != null) {
            modelAndView.addObject(ERROR_OBJECT_JSP, "You have not permissions !");
        } else {
            modelAndView.addObject(ERROR_OBJECT_JSP, user.getName() + " you have not permissions !");
        }
        return modelAndView;
    }
}
