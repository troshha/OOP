package laba6;

public class laba6 {
    public static void main(String[] args) {
    Book b = new Book("War and Peace\n","Leo Tolstoy\n",1869+'\n' );
        System.out.println(b);
        System.out.println();
        TextBook tb = new TextBook("Physics\n","V.G.Baryakhtar\n",2016+'\n');
        System.out.println(tb);
        System.out.println();
        Manual m = new Manual("A chemistry guide\n","Khomchenko G.P.\n",2014+'\n');
        System.out.println(m);
    }
}
