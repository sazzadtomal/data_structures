package org.dataStructures.Queue;

import java.util.LinkedList;

public class QueueUsingLinkedList {


    LinkedList<Integer> linkedList=new LinkedList<>();



    public void enque(int num){
        linkedList.add(num);
    }

    public int deque(){
        return linkedList.removeFirst();
    }

    public int peek(){
        return linkedList.getFirst();
    }

    public int size(){
        return linkedList.size();
    }

    public Boolean isEmpty(){
        return linkedList.isEmpty();
    }



}
