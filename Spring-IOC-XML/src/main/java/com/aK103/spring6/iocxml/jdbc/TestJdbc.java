package com.aK103.spring6.iocxml.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbc {
    public void demo1() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring?schema=spring6");
        dataSource.setUsername("root");
        dataSource.setPassword("220531");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    }

    public void demo2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
        DruidDataSource dataSource = (DruidDataSource)context.getBean(DruidDataSource.class);
        System.out.println(dataSource.getUrl());
    }
}
