package dao.impl;

import dao.UserDao;

/**
 * @author dqs
 * @description TODO
 * @dateTime 2021/9/17 14:48
 **/
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("dao的save方法");
    }

    public void init() {
        System.out.println("dao的初始化方法");
    }

    public void destroy() {
        System.out.println("dao的销毁方法");
    }
}
