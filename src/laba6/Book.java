package laba6;

public class Book {
    protected String  name;
    protected String  author;
    protected int  year;

    public Book() {
        this.name = "";
        this.author = "";
        this.year = 0;
    }

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }


    @Override
    public String toString() {
        return "Book Title:"+name+" Author:"+author+" Year:"+year;
    }
}
