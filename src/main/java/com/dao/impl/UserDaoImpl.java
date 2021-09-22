package com.dao.impl;

import com.dao.UserDao;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author dqs
 * @description TODO
 * @dateTime 2021/9/17 14:48
 **/
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("dao的save方法");
    }

    @PostConstruct
    public void init() {
        System.out.println("dao的初始化方法");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("dao的销毁方法");
    }
}
