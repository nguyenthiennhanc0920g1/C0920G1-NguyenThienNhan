package _01_introduction_to_java.thuc_hanh;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class tinh_so_ngay_trong_thang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month: ");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.println("28/29");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            default:
                System.out.println("Wrong");

        }
    }
}
