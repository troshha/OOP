package laba4;
import java.util.Random;

public class Newtone {
    public static void main(String[] args) {
        double x = new Random().nextDouble()*26 + 25;
        double r1 = sqrtNewton(x, 0.0001, 100);
        double r2 = Math.sqrt(x);
        String msg = "x=%.4f, sqrt(x)=%.4f, etalon=%.4f\n";
        System.out.printf(msg, x, r1, r2);
    }
    public static double sqrtNewton
            (double x, double eps, int maxCount) {
        double r1, r2 = 0.001;
        int count = 0;
        do {

            r1 = r2;
            r2 = (r1*r1 + x)/2/r1;
        }while (
                Math.abs(r2 - r1) >= eps && ++count <= maxCount
                );
        return (r1 + r2)/2;
    }
}

