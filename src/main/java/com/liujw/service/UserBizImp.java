package com.liujw.service;

import com.liujw.model.Users;
import org.springframework.stereotype.Service;

@Service
public class UserBizImp implements UsersBiz{

    @Override
    public boolean check(Users us) {
        if(us!=null&&us.getUsername()!=null&&!us.getUsername().trim().equals("")
                &&us.getUserpass()!=null&&!us.getUserpass().trim().equals("")){
            return true;
        }
        return false;
    }
}
