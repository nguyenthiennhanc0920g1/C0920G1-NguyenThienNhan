package _11_stack_and_queue.bai_tap;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String str = new String("Able was I ere I saw Elba");
        System.out.println(checkPalindrome(str));
    }

    private static boolean checkPalindrome(String str) {
        str = str.toLowerCase();
        Stack<Character> arrChar = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            arrChar.add(str.charAt(i));
        }
        Stack<Character> arrCharRevert = new Stack<>();
        Stack<Character> arrCharRevertHive = new Stack<>();
        for (char value : arrChar) {
            arrCharRevertHive.push(value);
        }
        for (int i = 0; i < arrChar.size(); i++) {
            arrCharRevert.push(arrCharRevertHive.pop());
        }
        return arrChar.equals(arrCharRevert);
    }
}
