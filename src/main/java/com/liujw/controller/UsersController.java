package com.liujw.controller;

import com.liujw.model.Users;
import com.liujw.service.UsersBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UsersController {

    @Autowired
    private UsersBiz usersBiz;

    public UsersBiz getUsersBiz() {
        return usersBiz;
    }

    public void setUsersBiz(UsersBiz usersBiz) {
        this.usersBiz = usersBiz;
    }

    @RequestMapping(value = "check_Users.do")
//    public String check(Users us){
//        boolean flag = usersBiz.check(us);
//        if (flag){
//            return "ok";
//        }
//        return "fail";
//    }
    public ModelAndView check(HttpServletRequest request,Users us){
        boolean flag = usersBiz.check(us);
        ModelAndView mv = new ModelAndView();
        if(flag){
            request.setAttribute("us",us);
            mv.setViewName("loginok.jsp");
            return mv;
        }
        mv.setViewName("fail.jsp");
        return mv;
    }
}
