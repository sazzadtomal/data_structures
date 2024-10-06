package org.example.Queue;

import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Reversing {

    public static Queue<Integer> reverse(Queue<Integer> list) {
        Stack<Integer> stack = new Stack<>();
        while (!list.isEmpty()) {
            stack.push(list.remove());
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }
}
