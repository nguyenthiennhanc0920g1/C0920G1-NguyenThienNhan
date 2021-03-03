package case_study.controllers;

import java.util.Scanner;

public class MainController {
    public void displayMainMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Add New Services.");
        System.out.println("2. Show Services.");
        System.out.println("3. Add New Customer.");
        System.out.println("4. Show Information of Customer.");
        System.out.println("5. Add New Booking.");
        System.out.println("6. Show Information of Employee.");
        System.out.println("7. Exit.");
        System.out.println("");
        System.out.println("Enter your choice: ");

        int choice = input.nextInt();
        switch (choice) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
        }

    }
}
