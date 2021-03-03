package _02_loop.bai_tap;

import java.util.Scanner;


public class Display100PrimeNumber {


    public static void main(String[] args) {
        int num = 2;
        while (num < 100) {
            if (DisplayPrimeNumber.isPrime(num)) {
                System.out.println(num);
            }
            num++;
        }
    }
}