package org.dataStructures.Queue;

import java.util.Arrays;

public class PriorityQueue {

    int[] queue;
    int head;
    int tail;
    int pointer;

    public PriorityQueue(){
        queue=new int[5];
    }


    public void enque(int num){
        int i;
            for(i=tail;i>head;i--){
                if(num<queue[i-1]){
                    queue[i]=queue[i-1];
                }
                else break;
            }
            queue[i]=num;
        tail++;
    }

    public void print(){
        System.out.println(Arrays.toString(queue));
    }
}
