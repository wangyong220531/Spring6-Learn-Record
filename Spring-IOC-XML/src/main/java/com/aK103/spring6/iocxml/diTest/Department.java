package com.aK103.spring6.iocxml.diTest;

//部门类
public class Department {
    private String dname;

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void info() {
        System.out.println("部门的名称是：" + dname);
    }
}
