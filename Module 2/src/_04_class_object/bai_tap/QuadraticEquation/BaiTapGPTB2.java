package _04_class_object.bai_tap.QuadraticEquation;


import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Scanner;

public class BaiTapGPTB2 {
    public static void chay() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = input.nextFloat();
        System.out.println("Enter b: ");
        double b = input.nextFloat();
        System.out.println("Enter c: ");
        double c = input.nextFloat();
        QuadraticEquation pt1 = new QuadraticEquation(a, b, c);
        pt1.giai();
    }
}
