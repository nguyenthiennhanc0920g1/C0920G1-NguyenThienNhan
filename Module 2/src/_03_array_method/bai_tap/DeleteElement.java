package _03_array_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        array = ArrayUtils.CreateArray(array, size);
        System.out.println(Arrays.toString(array));
        System.out.println("Enter element want to delete:");
        int k = scanner.nextInt();
        array = ArrayUtils.DeleteElement(array, k);
        System.out.println(Arrays.toString(array));
    }
}

