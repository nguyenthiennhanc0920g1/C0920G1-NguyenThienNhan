package _01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class giai_phuong_trinh_bac_nhat {
    public static void main(String[] args) {
        float a;
        float b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scanner.nextFloat();
        System.out.println("Enter b: ");
        b = scanner.nextFloat();
        if (a == 0 && b == 0) {
            System.out.println("Phuong trinh co vo so nghiem");
        } else if (a == 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            float x;
            x = (-b) / a;
            System.out.println("Phuong trinh co nghiem x = " + x);
        }
    }
}
