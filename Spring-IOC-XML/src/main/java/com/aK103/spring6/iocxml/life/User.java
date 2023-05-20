package com.aK103.spring6.iocxml.life;

public class User {
    private String name;

    public User() {
        System.out.println("1.bean对象创建，调用无参数构造！");
    }

    public void initMethod(){
        System.out.println("4.bean对象的初始化，调用指定的初始化方法！");
    }

    public void destroy(){
        System.out.println("5.bean对象销毁，调用指定的销毁方法！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2.给bean对象设置属性值！");
        this.name = name;
    }
}
