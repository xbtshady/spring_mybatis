package com.xw.mybatis.service.impl;



import com.xw.mybatis.dao.IUserDao;
import com.xw.mybatis.entity.User;
import com.xw.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class IUserService implements UserService {

  @Autowired
  private IUserDao userDao;


  public User login(User user) {
    return userDao.login(user);
  }

  public User getUserById(String id) {
    return userDao.selectByPrimaryKey(Integer.parseInt(id));
  }

  public void add(User user) {
    userDao.insert(user);
  }

  public void update(User user) {}


  public List<User> findByRange(int low, int high) {
    return userDao.selectByRange(Integer.valueOf(low), Integer.valueOf(high));
  }

}
