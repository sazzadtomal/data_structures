package org.example.Queue;

import java.util.Arrays;

public class ArrayQueue {

    int[] queue;
    int tail;
    int head;
    public int count;



    public ArrayQueue(){
        queue=new int[5];
    }




    public void enqueue(int item){
        if(count==queue.length){
            throw new IllegalArgumentException("Stack is full");
        }
        tail=tail%queue.length;
        queue[tail++]=item;
        count++;
    }


    public int deque(){
        if(count==0){
            throw new IllegalArgumentException("Stack is empty");
        }
        count--;
        int value=queue[head%queue.length];
        head++;
        return value;
    }


    public int peek(){
        if(count==0){
            throw new IllegalArgumentException("Stack is empty");
        }

        int value=queue[head%queue.length];
        head++;
        return value;
    }




    public void print(){
        System.out.println(Arrays.toString(queue));
    }





}
