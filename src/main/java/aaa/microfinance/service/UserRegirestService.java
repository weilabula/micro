package aaa.microfinance.service;

import aaa.microfinance.bean.UserBean;
import aaa.microfinance.utils.ReturnModel;

public interface UserRegirestService {
    Integer userregirest(UserBean userBean);
    ReturnModel userlogin(String username, String password);
}
