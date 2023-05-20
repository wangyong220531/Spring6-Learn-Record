package com.aK103.spring6.iocxml.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("life.xml");
        User user = (User)context.getBean("life",User.class);
        System.out.println("6.bean对象创建完成了，可以使用了！");
        System.out.println(user);
        context.close();
    }
}
