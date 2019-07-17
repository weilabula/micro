package aaa.microfinance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AboutusController {
    @RequestMapping("/aboutus")
    @ResponseBody
    public String aboutus(){
        return "我们是贷款公司";
    }
}
