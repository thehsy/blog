package cn.blog.service.Impl;

import cn.blog.dao.UserDao;
import cn.blog.pojo.User;
import cn.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String username) {
        User user = userDao.queryByUsernameAndPassword(username);
        return user;
    }
}
