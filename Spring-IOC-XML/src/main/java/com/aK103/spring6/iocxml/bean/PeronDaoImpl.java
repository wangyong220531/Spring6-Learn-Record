package com.aK103.spring6.iocxml.bean;

public class PeronDaoImpl implements UserDao {
    @Override
    public void run() {
        System.out.println("Person run ...");
    }
}
