package _11_stack_and_queue.bai_tap;

import java.util.Arrays;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        String str = "– b + (b^2 – 4*a*c)^(0.5/ 2*a)";

        System.out.println(checkBracket(str));
    }

    private static boolean checkBracket(String str) {
        char[] charSym = new char[str.length()];
        Stack<Character> arrayBracket = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            charSym[i] = str.charAt(i);
        }
        for (char c : charSym) {
            if (c == '(' || c == ')') {
                arrayBracket.push(c);
            }
        }
        if (arrayBracket.size() % 2 != 0 || arrayBracket.get(0) == ')' || arrayBracket.get(arrayBracket.size() - 1) == '(') {
            return false;
        }
        arrayBracket.removeAllElements();
        for (char c : charSym) {
            if (c == '(') {
                arrayBracket.push(c);
            }
        }
        //System.out.println(arrayBracket);
        for (char c : charSym) {
            if (c == ')') {
                arrayBracket.pop();
            }
        }
        //System.out.println(arrayBracket);
        return arrayBracket.isEmpty();
    }
}
