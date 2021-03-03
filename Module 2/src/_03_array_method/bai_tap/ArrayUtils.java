package _03_array_method.bai_tap;

import java.util.Scanner;

public class ArrayUtils {
    public static int[] CreateArray(int[] arr, int size) {
        Scanner scanner = new Scanner(System.in);
        do {
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        return arr;
    }

    public static int[] DeleteElement(int[] array, int k) {
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == k) {
                count++;
            }
        }
        System.out.println(count);
        int[] newArray = new int[array.length - count];
        int m = 0;
        for (int l = 0; l < array.length; l++) {
            if (array[l] != k) {
                newArray[m] = array[l];
                m++;
            }
        }
        return newArray;
    }

    public static int[] AddElementIntoArray(int[] arr, int x, int k) {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i == k) {
                newArray[i] = x;
            } else if (i > k) {
                newArray[i] = arr[i - 1];
            } else {
                newArray[i] = arr[i];
            }
        }
        return newArray;
    }

    public static int[] ConcatArray(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = a.length; i < c.length; i++) {
            c[i] = b[i - a.length];
        }
        return c;
    }

    public static void show(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}