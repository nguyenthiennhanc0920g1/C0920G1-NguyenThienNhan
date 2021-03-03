package _15_xu_ly_ngoai_le_va_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    public static void checkTriangle(float a, float b, float c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Tam giác không chứa cạnh mang giá trị âm");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Tổng 2 cạnh bất kì phải lớn hơn cạnh còn lại");
        }
        System.out.println("a = " + a + "\n" +
                "b = " + b + "\n" +
                "c = " + c + "\n" +
                "Là 1 tam giác");
    }

    public static void main(String[] args) throws IllegalTriangleException {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Nhap a: ");
            float a = input.nextFloat();
            System.out.println("Nhap b: ");
            float b = input.nextFloat();
            System.out.println("Nhap c: ");
            float c = input.nextFloat();
            Triangle.checkTriangle(a, b, c);
        } catch (Exception e) {
            System.out.println("loi");
        } finally {
            System.out.println("abc");
        }


    }
}
