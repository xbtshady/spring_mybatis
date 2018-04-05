package com.xw.mybatis;


import com.xw.mybatis.entity.User;
//import com.com.xw.mybatis.page.pageEntity;
import com.xw.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/4/2.
 */
public class test implements TestAPI{

    @Autowired
    private UserService userService;

    public User login(User user){
        return userService.login(user);
    }


    public User findById(String id) {
        return userService.getUserById(id);
    }


    public void Insert(User user) {
        userService.add(user);
    }


//    public pageEntity<User> Paging(pageEntity<User> pageEntity) {
//        pageEntity.setList(userService.findByRange(pageEntity.getLow(),pageEntity.getHigh()));
//        System.out.println(pageEntity.getLow());
//        System.out.println(pageEntity.getHigh());
//        return pageEntity;
//    }

    public static void main(String[] args){


        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        TestAPI test =(TestAPI) context.getBean("test");

//        TestAPI test = (TestAPI) SpringBeanUtil.getContext().getBean("test");

        User user = new User(1,"xx.com","123456","xx");
        User user2 = test.findById("0");
        User user3 = test.login(user);
        System.out.println(user2.getUsername());
        System.out.println(user3.getUsername());


//        for(int i = 1; i < 20; i++){
//            User user = new User(i,"xx.com","123456","user"+i);
//            test.Insert(user);
//        }

//        pageEntity<User> pageEntity = new pageEntity<User>();
//        pageEntity.setLimit(5);
//        pageEntity.setPageNumber(2);
//        pageEntity = test.Paging(pageEntity);
//
//        for (User user: pageEntity.getList()){
//            System.out.println(user.getUsername());
//        }
    }
}
