package com.heitian.ssm.service;

import com.heitian.ssm.dao.UserDao;
import com.heitian.ssm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: jiangyexin
 * @Description:
 * @Date: 2018-03-21 19:03
 **/
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> getAllUsers() {
        return userDao.selectAllUser();
    }
}
