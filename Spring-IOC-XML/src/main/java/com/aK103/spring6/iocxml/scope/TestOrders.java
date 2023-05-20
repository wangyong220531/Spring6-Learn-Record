package com.aK103.spring6.iocxml.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOrders {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("scope.xml");
        Orders orders = (Orders) context.getBean("orders", Orders.class);
        System.out.println(orders);
        Orders orders1 = (Orders) context.getBean("orders", Orders.class);
        System.out.println(orders1);
    }
}
