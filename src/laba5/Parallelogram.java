package laba5;

import java.util.Objects;

public class Parallelogram {
   private double a;
    private double b;
    private double h;


    public Parallelogram(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double perimetr(){
        double p = 2*a*b;
        return p;
    }
    public double area(){
        double s = a*h;
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelogram that = (Parallelogram) o;
        return Double.compare(that.a, a) == 0 &&
                    Double.compare(that.b, b) == 0 &&
                Double.compare(that.h, h) == 0;
    }


}

