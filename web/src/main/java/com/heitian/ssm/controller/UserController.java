package com.heitian.ssm.controller;

import com.heitian.ssm.model.User;
import com.heitian.ssm.service.UserService;
import jdk.nashorn.internal.ir.debug.JSONWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: jiangyexin
 * @Description:
 * @Date: 2018-03-22 15:01
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/all")
    @ResponseBody
    public String getAllUsers() {
        List<User> users = userService.getAllUsers();
        System.out.println(users.toString());
        String str = "";
        for (User user : users) {
            str += user.getUserName() + "   " + user.getUserPwd() + "\n";
        }
        return str;
    }
}
