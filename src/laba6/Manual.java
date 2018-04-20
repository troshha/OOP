package laba6;

public class Manual extends Book{

    public Manual(String name, String author, int year) {
        super(name, author, year);
    }

    @Override
    public String toString() {
        return "Manual Title: "+name+" Author:"+author+" Year:"+year;
    }
}
