package com.aK103.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //根据id获取bean
        User user = (User) context.getBean("user");
        System.out.print("根据id获取bean:" + user);
    }
}