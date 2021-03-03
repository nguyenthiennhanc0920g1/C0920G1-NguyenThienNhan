package _01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class tinh_nam_nhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        if (year % 400 == 0) {
            System.out.println(year + " is leaf");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is leaf");
        } else {
            System.out.println(year + " is NOT leaf");
        }
    }
}
