package com.miku.utils;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: Utopiamiku
 * @date: 2020/9/17 20:19
 * @description:
 */
@Component
public class MyAuthenticationFailureHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        /*验证失败*/
        httpServletResponse.setStatus(401);
//        httpServletResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//i18n
        httpServletResponse.setHeader("content-type", "text/html;charset=UTF-8");
        httpServletResponse.setCharacterEncoding("UTF-8");
//        httpServletResponse.getWriter().println("验证失败");

        httpServletResponse.getWriter().println("msg:"+e.getMessage());
    }
}
