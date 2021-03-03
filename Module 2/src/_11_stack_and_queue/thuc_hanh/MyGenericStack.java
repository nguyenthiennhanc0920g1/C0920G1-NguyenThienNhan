package _11_stack_and_queue.thuc_hanh;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<Object> {
    private LinkedList<Object> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

    public void push(Object e) {
        stack.push(e);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }
}
