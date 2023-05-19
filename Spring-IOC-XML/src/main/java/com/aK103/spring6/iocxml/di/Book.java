package com.aK103.spring6.iocxml.di;

public class Book {
    private String bname;
    private String author;
    private String others;

    public Book() {

    }

    //有参数构造方法
    public Book(String bname, String author) {
        System.out.println("有参数构造执行了...");
        this.bname = bname;
        this.author = author;
    }

    public String getBName() {
        return bname;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", others='" + others + '\'' +
                '}';
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setBname("Spring6源码深入研究");
        book.setAuthor("AK103");
    }
}
