package com.aK103.spring6.iocxml.diTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDept {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("diList.xml");
        Department department = (Department) context.getBean("dept", Department.class);
        department.info();
    }
}
