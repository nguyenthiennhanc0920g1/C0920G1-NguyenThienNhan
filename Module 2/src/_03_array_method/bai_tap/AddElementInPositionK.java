package _03_array_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementInPositionK {
    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        array = ArrayUtils.CreateArray(array, size);
        System.out.println(Arrays.toString(array));
        System.out.println("Enter value x want to add:");
        int x = scanner.nextInt();
        System.out.println("Enter position k:");
        int k = scanner.nextInt();
        array = ArrayUtils.AddElementIntoArray(array, x, k);
        System.out.println(Arrays.toString(array));
    }
}
