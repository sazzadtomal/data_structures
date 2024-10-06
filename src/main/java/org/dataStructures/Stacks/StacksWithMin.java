package org.dataStructures.Stacks;

import java.util.Stack;

public class StacksWithMin {

    Stack<Integer> mainStack;
    Stack<Integer> minStack;


    public StacksWithMin(){
        mainStack=new Stack<>();
        minStack=new Stack<>();
    }


    public void push(int num) {
        mainStack.push(num);
        if (minStack.isEmpty() || num <= minStack.peek()) {
            minStack.push(num);
        } else {
            minStack.push(minStack.peek());
        }
    }


    public int pop() {

        if(minStack.isEmpty() || mainStack.isEmpty()) {
            throw new IllegalArgumentException();
        }
        minStack.pop();
        return mainStack.pop();

    }


    public int min() {

        if(minStack.isEmpty()) {
            throw new IllegalArgumentException();
        }

        return minStack.peek();

    }







}
