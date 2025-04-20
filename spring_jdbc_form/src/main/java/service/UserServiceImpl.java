package service;

import dao.UserDao;
import entity.User;

public class UserServiceImpl implements UserService{

    private UserDao userDao;
    @Override
    public int registerUser(User user) {
       int i =  userDao.saveUser(user);
        return i;
    }
}
