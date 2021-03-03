package _11_stack_and_queue.bai_tap;

import java.util.Arrays;
import java.util.Stack;

public class StackRevert {
    public static void main(String[] args) {
        Stack<Integer> arr = new Stack<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i);
        }
        System.out.println(arr);
        revertArray(arr);
        System.out.println(arr);
    }

    public static void revertArray(Stack<Integer> arr) {
        Stack<Integer> stack = new Stack<>();
        for (int value : arr) {
            stack.push(value);
        }
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, stack.pop());
        }
    }
}

