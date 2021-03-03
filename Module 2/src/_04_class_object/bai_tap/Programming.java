package _04_class_object.bai_tap;

import _04_class_object.bai_tap.Fan.BaiTapFan;
import _04_class_object.bai_tap.QuadraticEquation.BaiTapGPTB2;
import _04_class_object.bai_tap.StopWatch.BaiTapStopWatch;

import java.util.Scanner;


public class Programming {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Phuong trinh bac 2.");
        System.out.println("2. Stop Watch.");
        System.out.println("3. Fan.");
        System.out.println("Enter your choice:");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                BaiTapGPTB2.chay();
                break;
            case 2:
                BaiTapStopWatch.runTime();
                break;
            case 3:
                BaiTapFan.useFan();
        }
    }
}
