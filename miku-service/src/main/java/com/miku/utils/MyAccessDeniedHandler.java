package com.miku.utils;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: Utopiamiku
 * @date: 2020/9/17 20:39
 * @description:
 */
@Component
public class MyAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
        httpServletResponse.setStatus(403);
//        httpServletResponse.setHeader("content-type", "text/html;charset=UTF-8");
//        httpServletResponse.setCharacterEncoding("UTF-8");
//        httpServletResponse.getWriter().println("没有访问权限");

        httpServletResponse.getWriter().println("msg:"+e.getMessage());
    }
}
