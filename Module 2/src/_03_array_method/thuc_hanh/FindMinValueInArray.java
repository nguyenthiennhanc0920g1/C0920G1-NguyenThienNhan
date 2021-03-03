package _03_array_method.thuc_hanh;

public class FindMinValueInArray {
    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 10, 6, 9};
        int min = minValue(arr);
        System.out.println("The smallest element in the array is: " + min);

    }
}

