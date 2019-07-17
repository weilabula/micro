package aaa.microfinance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println ("hello world");
        return "hello world";
    }
}
