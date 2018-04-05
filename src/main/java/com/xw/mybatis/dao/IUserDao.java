package com.xw.mybatis.dao;


import com.xw.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao {

    User login(User user);

    User selectByPrimaryKey(@Param("id") Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectByRange(@Param("low") Integer low, @Param("high") Integer high);
}