package _03_array_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size:");
        int sizeArray1 = scanner.nextInt();
        int[] a = new int[sizeArray1];
        a = ArrayUtils.CreateArray(a, sizeArray1);
        System.out.print("Enter size:");
        int sizeArray2 = scanner.nextInt();
        int[] b = new int[sizeArray2];
        b = ArrayUtils.CreateArray(b, sizeArray2);
        int[] c = new int[0];
        c = ArrayUtils.ConcatArray(a, b);
        System.out.println(Arrays.toString(c));
    }
}
