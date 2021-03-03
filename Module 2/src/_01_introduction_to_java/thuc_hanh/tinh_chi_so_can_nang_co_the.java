package _01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class tinh_chi_so_can_nang_co_the {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height");
        float height = scanner.nextFloat();
        System.out.println("Enter your weight ");
        float weight = scanner.nextFloat();
        float bmi = weight / height * height;
        System.out.println("Your bmi = " + bmi);

        if (bmi <= 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else if (bmi <= 30) {
            System.out.println("Obese");
        }
    }
}
