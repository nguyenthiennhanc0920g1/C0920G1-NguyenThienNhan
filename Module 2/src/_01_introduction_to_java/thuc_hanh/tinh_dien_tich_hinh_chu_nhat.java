package _01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class tinh_dien_tich_hinh_chu_nhat {
    public static void main(String[] args) {
        float length;
        float width;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length: ");
        length = scanner.nextFloat();
        System.out.println("Input width: ");
        width = scanner.nextFloat();
        float area = length * width;
        System.out.println("Area: " + area);
    }
}
