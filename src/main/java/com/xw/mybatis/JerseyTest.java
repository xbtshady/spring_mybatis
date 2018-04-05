package com.xw.mybatis;


//import com.com.xw.framework.utils.SpringBeanUtil;
import com.xw.mybatis.entity.User;
//import com.com.xw.mybatis.page.pageEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * Created by Administrator on 2018/4/4.
 */
@Path("hello")
public class JerseyTest {


    @GET
    @Produces("text/plain")
    public String getString(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        TestAPI test =(TestAPI) context.getBean("test");
        StringBuffer s = new StringBuffer();
        s.append("username");
        s.append("  " + "email ");
        s.append("  " + "password");
        s.append("  " + "id");
        for (int i = 0; i < 10; i++){
            User user = test.findById(Integer.toString(i));
            s.append("\n" + user.getUsername());
            s.append("  " + user.getEmail());
            s.append("  " + user.getPassword());
            s.append("  " + user.getId());
        }
//    public String getString(@QueryParam("page") int page, @QueryParam("limit") int limit){
//        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
//        TestAPI test =(TestAPI) context.getBean("test");
//
//        pageEntity<User> pageEntity = new pageEntity<User>();
//        pageEntity.setLimit(limit);
//        pageEntity.setPageNumber(page);
//        pageEntity = test.Paging(pageEntity);
//        StringBuilder stringBuilder=new StringBuilder();
//        for(User user:pageEntity.getList()){
//            stringBuilder.append(" ");
//            stringBuilder.append(user.getUsername());
//        }
//        return stringBuilder.toString();
        return s.toString();
    }
}
