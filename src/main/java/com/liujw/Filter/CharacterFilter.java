package com.liujw.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "CharacterFilter",urlPatterns = "/*")
public class CharacterFilter implements Filter {
    @Override
    public void destroy() {
        System.out.println("正在销毁过滤器....");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("正在过滤用户的请求与响应....");
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        chain.doFilter(req,resp);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("正在初始化过滤器....");
    }

}


