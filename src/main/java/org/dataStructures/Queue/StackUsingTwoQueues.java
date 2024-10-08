package org.dataStructures.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingTwoQueues {

    Queue<Integer> queue=new ArrayDeque<>();



    public void push(int num){
        queue.add(num);
    }

    public int pop(){

        if (queue.isEmpty()) throw  new IllegalArgumentException();

        Queue<Integer> newQueue = new ArrayDeque<>();
        int size = 1;
        int till=queue.size();
        while (size < till) {
                newQueue.add(queue.remove());
                size++;
        }

        int value = queue.remove();
        queue = newQueue;
        return value;
    }



}
