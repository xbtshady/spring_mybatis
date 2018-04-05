package com.xw.mybatis.service;



import com.xw.mybatis.entity.User;

import java.util.List;

public interface UserService {

  User login(User user);

  User getUserById(String id);

  void add(User user);

  void update(User user);

  List<User> findByRange(int low, int high);
}
