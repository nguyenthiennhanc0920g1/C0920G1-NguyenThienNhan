package _03_array_method.bai_tap;

import java.util.Scanner;

public class FindMaxInArray2Dimension {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row: ");
        int n = input.nextInt();
        System.out.println("Enter column: ");
        int m = input.nextInt();
        int[][] array = new int[n][m];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("a[%d][%d] = ", i, j);
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("Array 2 dimension:");
        ArrayUtils.show(array);
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Max = " + max);
    }
}
