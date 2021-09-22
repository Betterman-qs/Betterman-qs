package com.service.impl;

import com.dao.UserDao;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author dqs
 * @description TODO
 * @dateTime 2021/9/17 15:53
 **/
@Service("userService")
public class UserServiceImpl implements UserService {

    //@Resource(name = "userDao")
    private UserDao userDao;

    /**
     * 通过有参构造函数来注入userDao
     * @param userDao userDao
     */
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
        System.out.println("构造依赖注入");
    }

    /**
     * 通过set方法注入userDao
     * @param userDao userDao
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
        System.out.println("set方法注入");
    }

    @Override
    public void save() {
        System.out.println("service层的save方法");
        userDao.save();
    }
}
