package laba6;

public class TextBook extends Book {

    public TextBook(String name, String author, int year) {
        super(name, author, year);
    }
    @Override
    public String toString() {
        return "TextBook Title: "+name+" Author:"+author+" Year:"+year;
    }
}
