package com.ak103.spring;

public class User {

    private Person person;

    public User() {
        System.out.print("无参数执行了！");
    }

    public void add() {
        System.out.println("add...");
    }

    public static void main(String[] args) {
        User user = new User();
        user.add();
    }
}
