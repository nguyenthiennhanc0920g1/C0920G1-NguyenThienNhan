package _02_loop.thuc_hanh;

import java.util.Scanner;

import _02_loop.bai_tap.DisplayPrimeNumber;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (DisplayPrimeNumber.isPrime(num)) {
            System.out.println(num + " this is Prime number");
        } else {
            System.out.println(num + " this is NOT Prime number");
        }
    }
}
