package com.aK103.spring6.iocxml.diTest;

//员工类
public class Employee {
    //员工属于某个部门
    private Department department;

    private String ename;
    private Integer age;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department=" + department +
                ", ename='" + ename + '\'' +
                ", age=" + age +
                '}';
    }

    public void work() {
        System.out.println("员工" + ename + "正在工作！他的年龄是：" + age);
        department.info();
    }
}
