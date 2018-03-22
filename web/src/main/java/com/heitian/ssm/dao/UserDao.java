package com.heitian.ssm.dao;

import com.heitian.ssm.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: jiangyexin
 * @Description:
 * @Date: 2018-03-21 18:59
 **/
public interface UserDao {
    User selectUserById(@Param("userId") Long userId);

    User selectUserByPhoneOrEmail(@Param("emailOrPhone") String emailOrPhone, @Param("state") Short state);

    List<User> selectAllUser();
}
