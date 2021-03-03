package _02_loop.bai_tap;

import java.util.Scanner;

public class DisplayGeometry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 5;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Hinh Chu Nhat");
            System.out.println("2. Tam Giac Vuong");
            System.out.println("3. Tam Giac Vuong Nguoc");
            System.out.println("4. Tam Giac Can");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 10; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
//                case 4:
//                    for (int i = 1;i<=7;i++){
//                        for (int j =i;j>=0;j++){
//                            System.out.print("");
//                        }
//                            for (int k =1;k<=i;k++){
//                                System.out.print("*");
//                            }
//
//                        System.out.println();
//                    }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
