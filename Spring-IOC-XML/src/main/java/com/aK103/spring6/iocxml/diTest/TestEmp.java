package com.aK103.spring6.iocxml.diTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("diArrayTest.xml");
        Employee emp = (Employee) context.getBean("emp", Employee.class);
        emp.work();
        System.out.println(emp);
    }
}
