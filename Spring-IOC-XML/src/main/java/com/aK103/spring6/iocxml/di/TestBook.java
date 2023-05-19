package com.aK103.spring6.iocxml.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("di.xml");
        Book book = (Book) context.getBean("book", Book.class);
        System.out.println(book);
    }
}
