package com.xw.mybatis;


import com.xw.mybatis.entity.User;
//import com.com.xw.mybatis.page.pageEntity;

/**
 * Created by Administrator on 2018/4/4.
 */
public interface TestAPI {

    User login(User user);

    User findById(String id);

    void Insert(User user);

//    pageEntity<User> Paging(pageEntity<User> pageEntity);
}
