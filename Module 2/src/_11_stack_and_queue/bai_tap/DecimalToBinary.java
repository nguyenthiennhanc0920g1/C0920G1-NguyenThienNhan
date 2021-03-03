package _11_stack_and_queue.bai_tap;

import java.util.Stack;

public class DecimalToBinary {

    public static void changeDecimalToBinary(int number) {
        final int divisorNumber = 2;
        int surplusNumber;
        Stack<Integer> arrayBinary = new Stack<>();
        while (number != 0) {
            surplusNumber = number % divisorNumber;
            number /= divisorNumber;
            arrayBinary.push(surplusNumber);
        }
        int size = arrayBinary.size();
        for (int i = 0; i < size; i++) {
            System.out.print(arrayBinary.pop());
        }
    }
}
