package com.mkyong.web.controller;

import com.mkyong.web.exception.RandomException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("handling")
public class ThrowableController {

    @RequestMapping("npe")
    public void throwNPE(){
        throw new NullPointerException("This is NPE :)");
    }

    @RequestMapping("randomException")
    public void throwRandomException(){
        throw new RandomException();
    }
}
