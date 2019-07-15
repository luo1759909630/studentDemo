package com.gen.student.controller;

import com.gen.student.domain.User;
import com.gen.student.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {
    @Autowired
    UserService service;

/*    @RequestMapping("index")
    public String login2(){

    }*/
    //登陆
    @RequestMapping("/userLogin")
    public String login(){

/*        if (service.login(user)){
            return "success";
        }*/
        System.out.println("fffffffffffffffff");
        return "login";
    }
    @RequestMapping("/success")
    public String success(User user){
         if (service.login(user)){
            return "index";
        }
         return "login";
    }
    @RequestMapping()
    @ResponseBody
    public String userList(){
        //return service.findAll();
        return "";
    }
}
