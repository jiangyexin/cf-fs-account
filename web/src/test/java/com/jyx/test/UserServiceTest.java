package com.jyx.test;

import com.heitian.ssm.model.User;
import com.heitian.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author: jiangyexin
 * @Description:
 * @Date: 2018-03-23 9:59
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring-mybatis.xml"})
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testGetAllUsers() {
        List<User> users = null;
        users = userService.getAllUsers();
        System.out.println(users.toString());
        String str = "";
        for (User user : users) {
            str += user.getUserName() + "   " + user.getUserPwd() + "\n";
        }
        System.out.println(str);
    }
}
