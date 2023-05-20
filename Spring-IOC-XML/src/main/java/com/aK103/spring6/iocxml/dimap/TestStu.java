package com.aK103.spring6.iocxml.dimap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStu {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("diRef.xml");
        Student student = (Student) context.getBean("stup", Student.class);
        student.run();
    }
}
