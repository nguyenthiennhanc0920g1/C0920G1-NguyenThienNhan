package _02_loop.thuc_hanh;

import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {

        double money = 1.0;
        int month = 1;
        double intersRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        System.out.println("Enter number of months: ");
        month = input.nextInt();
        double total_interset = 0;
        for (int i = 0; i < month; i++) {
            total_interset += money * (intersRate / 100) / 12 * month;
            System.out.println("Total of \n" + "interest: " + total_interset);
        }
    }
}