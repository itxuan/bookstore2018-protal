package com.xzl.bookstore.interceptor;

import com.xzl.bookstore.pojo.po.User;
import com.xzl.bookstore.util.MyUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 *  用户登录拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);
    @Override
    public boolean preHandle(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o) throws Exception {


        String method = httpServletRequest.getMethod();
        //获取请求的url
        String clientIp = MyUtil.getClientIp(httpServletRequest);
        String url = httpServletRequest.getRequestURI();
        logger.info("来自"  + clientIp + "的"+ url +"请求"+"method:"+method);
        //获取请求的url
        //判断url是否是公开 地址（实际使用时将公开 地址配置配置文件中）
        //这里公开地址是登陆提交的地址
        if(url.indexOf("home") >= 0){
            //如果首页、登录、注册、搜索等等 就放行
            return true;
        }

        //判断session中是否存在登录的User
        HttpSession session  = httpServletRequest.getSession();
        //从session中取出用户身份信息
        User session_user = (User) session.getAttribute("session_user");
        String name = null;
        if(session_user!=null) {
            //todo
            name = session_user.getNickname();
        }else {
            httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/home/login.jsp").forward(httpServletRequest, httpServletResponse);
            return false;
        }
        if(name != null){
            //身份存在，放行
            return true;
        }
        //执行这里表示用户身份需要认证，跳转登陆页面
        httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/home/login.jsp").forward(httpServletRequest, httpServletResponse);
        return false;
    }

    @Override
    public void postHandle(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }


}
