package com.aK103.spring6.iocxml.di;

public class Book {
    private String bname;
    private String author;

    public Book() {

    }

    public Book(String bname, String author) {
        this.bname = bname;
        this.author = author;
    }

    public String getName() {
        return bname;
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
