package _14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {5, -10, 7, 4, 0, 6};
        InsertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void InsertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int indexCurrent = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (indexCurrent < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = indexCurrent;
        }
    }
}

