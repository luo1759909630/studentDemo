package com.gen.student.service;

import com.gen.student.dao.UserDao;
import com.gen.student.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserServiceImpl implements UserService{


    @Autowired
    UserDao dao;

    @Override
    public boolean login(User user) {
        boolean result=false;
        if (dao.login(user)>0){
            result=true;
        }
        return result;
    }

}
