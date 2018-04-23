package laba5;

import java.awt.geom.Area;
import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class laba5 {
    public static void main(String[] args) {
        OneLinkedList oneLinkedList=new OneLinkedList(10);

        List<Integer> list= new ArrayList<>();

        System.out.println(oneLinkedList);
        oneLinkedList.invert();
        System.out.println(oneLinkedList);
        oneLinkedList.removeLast();
        System.out.println(oneLinkedList);
        oneLinkedList.sort();
        System.out.println(oneLinkedList);

        Parallelogram p= new Parallelogram(1,2,3);
        Parallelogram p2= new Parallelogram(5,6,7);
        System.out.println("P1 = "+p.perimetr());
        System.out.println("S1 = "+p.area());
        System.out.println("P2 = "+p2.perimetr());
        System.out.println("S2 = "+p2.area());
        System.out.println("Equals = "+p.equals(p2));

    }
}
