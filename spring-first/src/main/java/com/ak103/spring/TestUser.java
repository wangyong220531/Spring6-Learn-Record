package com.ak103.spring;

import org.junit.jupiter.api.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class TestUser {
    @Test
    public void testUserObject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User) context.getBean("user");
        System.out.print(user);
        user.add();
    }

    @Test
    public void testUserObject1() throws Exception {
        Class clazz = Class.forName("com.ak103.spring");
        User user = (User) Class.getDeclaredConstructor().newInstance();
        System.out.print(user);
    }
}
