package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import service.UserService;

/**
 * @author dqs
 * @description TODO
 * @dateTime 2021/9/17 15:53
 **/
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    /**
     * 通过有参构造方法来注入userDao
     * @param userDao userDao
     */
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * 通过内置方法注入userDao
     * @param userDao userDao
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("service层的save方法");
        userDao.save();
    }
}