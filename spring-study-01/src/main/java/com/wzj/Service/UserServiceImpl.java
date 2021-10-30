package com.wzj.Service;

import com.wzj.dao.UserDao;
import com.wzj.dao.UserDaoImpl;
import com.wzj.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService{
//    private UserDao userDao = new UserDaoImpl();
//    @Override
//    public void getUser() {
//        userDao.getUser();
//    }

//    private UserDao userDao = new UserDaoMysqlImpl();
//
//    @Override
//    public void getUser() {
//        userDao.getUser();
//    }

//    利用set实现
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
