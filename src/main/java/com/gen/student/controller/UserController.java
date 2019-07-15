package com.gen.student.controller;

import com.gen.student.domain.User;
import com.gen.student.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService service;

/*    @RequestMapping("index")
    public String login2(){

    }*/
    //登陆
    @RequestMapping("index")
    public String login_html(){

/*        if (service.login(user)){
            return "success";
        }*/
        System.out.println("fffffffffffffffff");
            return "index";
    }
}
