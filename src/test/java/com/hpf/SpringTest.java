package com.hpf;

import com.hpf.pojo.User;
import com.hpf.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        List<User> user = userService.findAllUser();
        for (User user1 : user) {
            System.out.println("user1 = " + user1);
        }
    }
}
