package _01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (0 > number || number > 100) {
            System.out.println("Enter wrong");
            number = scanner.nextInt();
        }
        //System.out.println(number);
        int ones = number % 10;
        int tens = number / 10;
        String readNumber = "";
        if (number < 10) {
            switch (number) {
                case 0:
                    readNumber = "zero";
                    break;
                case 1:
                    readNumber = "one";
                    break;
                case 2:
                    readNumber = "two";
                    break;
                case 3:
                    readNumber = "three";
                    break;
                case 4:
                    readNumber = "four";
                    break;
                case 5:
                    readNumber = "five";
                    break;
                case 6:
                    readNumber = "six";
                    break;
                case 7:
                    readNumber = "seven";
                    break;
                case 8:
                    readNumber = "eight";
                    break;
                case 9:
                    readNumber = "nine";
                    break;
            }
            System.out.println(readNumber);
        } else if (number < 20) {
            switch (number) {
                case 10:
                    readNumber = "ten";
                    break;
                case 11:
                    readNumber = "eleven";
                    break;
                case 12:
                    readNumber = "twelve";
                    break;
                case 13:
                    readNumber = "thirteen";
                    break;
                case 14:
                    readNumber = "fourteen";
                    break;
                case 15:
                    readNumber = "fifteen";
                    break;
                case 16:
                    readNumber = "sixteen";
                    break;
                case 17:
                    readNumber = "seventeen";
                    break;
                case 18:
                    readNumber = "eighteen";
                    break;
                case 19:
                    readNumber = "nineteen";
                    break;
            }
            System.out.println(readNumber);
        } else {
            String a = "";
            String b = "";
            switch (tens) {
                case 2:
                    a = "twenty";
                    break;
                case 3:
                    a = "thirty";
                    break;
                case 4:
                    a = "forty";
                    break;
                case 5:
                    a = "fifty";
                    break;
                case 6:
                    a = "sixty";
                    break;
                case 7:
                    a = "seventy";
                    break;
                case 8:
                    a = "eighty";
                    break;
                case 9:
                    a = "ninety";
                    break;
            }
            switch (ones) {
                case 0:
                    b = "";
                    break;
                case 1:
                    b = "one";
                    break;
                case 2:
                    b = "two";
                    break;
                case 3:
                    b = "three";
                    break;
                case 4:
                    b = "four";
                    break;
                case 5:
                    b = "five";
                    break;
                case 6:
                    b = "six";
                    break;
                case 7:
                    b = "seven";
                    break;
                case 8:
                    b = "eight";
                    break;
                case 9:
                    b = "nine";
                    break;
            }
            readNumber = a + ' ' + b;
            System.out.println(readNumber);
        }
    }
}