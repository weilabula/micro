package aaa.microfinance.controller;

import aaa.microfinance.bean.UserBean;
import aaa.microfinance.service.UserRegirestService;
import aaa.microfinance.utils.ReturnModel;

import aaa.microfinance.utils.SessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserRegisterController {
    @Autowired
    HttpServletRequest request;
    @Autowired
    private UserRegirestService userRegirestService;
    @Autowired
    private ReturnModel returnModel;
    /*用户注册*/
    @RequestMapping("/userregister")
    public String userregister(UserBean userBean){

        String provinceold = userBean.getProvinceold ();
        String cityold = userBean.getCityold ();
        String districtold = userBean.getDistrictold ();
        String detailaddressold = userBean.getDetailaddressold ();
        /*原地址拼接*/
        String addressold=provinceold+cityold+districtold+detailaddressold;
        System.out.println (addressold);
        userBean.setAddressold (addressold);

        String provincenew = userBean.getProvincenew ();
        String citynew = userBean.getCitynew ();
        String districtnew = userBean.getDistrictnew ();
        String detailaddressnew = userBean.getDetailaddressnew ();
        /*现地址拼接*/
        String addressnew=provincenew+citynew+districtnew+detailaddressnew;
        userBean.setAddressnew (addressnew);
        System.out.println (addressnew);
        System.out.println (userBean);
        Integer result = userRegirestService.userregirest (userBean);
        if (result==1){
            String info="注册成功";
            return info;
        }else{
            String info="注册失败";
            return info;
        }

    }
    /*用户登录*/
    @RequestMapping("/userlogin")
    public ReturnModel userlogin(String username,String password){
        System.out.println (username);
        System.out.println (password);
        returnModel = userRegirestService.userlogin (username, password);
        /*String userinfo = SessionUtils.getsession (request).getAttribute ("userinfo").toString ();
        System.out.println (userinfo);*/
        return returnModel;
    }

    @RequestMapping("/loginresult")
    public UserBean loginresult(){
        UserBean userinfo = (UserBean) SessionUtils.getsession (request).getAttribute ("userinfo");
        System.out.println (userinfo);
        return userinfo;
    }
}
