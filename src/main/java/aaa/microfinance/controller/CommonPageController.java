package aaa.microfinance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonPageController {
    @RequestMapping("/toppage")
    public String toppage(){
        return "top";
    }
}
