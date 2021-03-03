package _04_class_object.bai_tap.QuadraticEquation;

import java.lang.reflect.Array;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void giai() {
        double delta = this.b * this.b - 4 * this.a * this.c;
        double x1;
        double x2;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            x1 = (-this.b) / (2 * this.a);
            System.out.println("Phuong trinh co nghiem kep: x1 = x2 =  " + x1);
        } else {
            x1 = ((-this.b) + Math.sqrt(delta)) / (2 * this.a);
            x2 = ((-this.b) - Math.sqrt(delta)) / (2 * this.a);
            System.out.println("Phuong trinh co 2 nghiem phan biet:\nx1 = " + x1 + "\n" + "x2 = " + x2);
        }
    }
}
