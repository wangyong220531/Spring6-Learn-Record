package com.aK103.spring6.iocxml.diTest;

import java.util.List;

//部门类
public class Department {

    private List<Employee> empList;

    private String dname;

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void info() {
        System.out.println("部门的名称是：" + dname);
        for (Employee employee : empList) {
            System.out.println(employee.getEname());
        }
    }
}
