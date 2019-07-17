package aaa.microfinance.utils;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
/*获取Session对象封装类*/
public final class SessionUtils {
    public static HttpSession getsession(HttpServletRequest request){
        HttpSession session = request.getSession ();
        return session;
    }
}
