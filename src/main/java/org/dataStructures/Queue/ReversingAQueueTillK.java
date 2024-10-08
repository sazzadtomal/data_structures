package org.dataStructures.Queue;

import java.util.*;

public class ReversingAQueueTillK {

     Queue<Integer> queue=new ArrayDeque<>();








     public void enque(int num){
         queue.add(num);
     }

     public int deque(){
         if(!queue.isEmpty()) return queue.remove();
         else throw new IllegalArgumentException();
     }

    public int peek(){
        if(!queue.isEmpty()) return queue.peek();
        else throw new IllegalArgumentException();
    }


    public static int[] reverse(int[] array){
        int pointerStart =0;
        int pointerEnd=array.length-1;

        while(pointerEnd>pointerStart){
            int temp=array[pointerStart];
            array[pointerStart]=array[pointerEnd];
            array[pointerEnd]=temp;
            pointerStart++;
            pointerEnd--;
        }

        return array;


    }






    public void reverseTillK(int k){
         int[] array=new int[k];
         Queue<Integer> queueNew=new ArrayDeque<>();

         for(int i=0;i<array.length;i++){
             array[i]=queue.remove();
         }

         for(Integer value:reverse(array)){
             queueNew.add(value);
         }

         while (!queue.isEmpty()){
             queueNew.add(queue.remove());
         }

         queue=queueNew;

     }

    public void reverseTillKOP(int k){
        Stack<Integer> stack = new Stack<>();

        // Push first k elements onto the stack (this reverses their order)
        for(int i = 0; i < k && !queue.isEmpty(); i++){
            stack.push(queue.remove());
        }

        // Pop from the stack and add back to the queue (reversed first k elements)
        while(!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        for(int i=queue.size()-k;i>0;i--){
            queue.add(queue.remove());
        }




    }












//    int[] queue;
//    int tail;
//    int head;
//    public int count;
//
//
//
//    public ReversingAQueueTillK(){
//        queue=new int[5];
//    }
//
//
//
//
//    public void reverseK(int k){
//        if(k>tail) throw new IllegalArgumentException();
//    }
//
//
//
//
//
//
//    public void enqueue(int item){
//        if(count==queue.length){
//            throw new IllegalArgumentException("Stack is full");
//        }
//        queue[tail++]=item;
//        count++;
//    }
//
//
//    public int deque(){
//        if(count==0){
//            throw new IllegalArgumentException("Stack is empty");
//        }
//        count--;
//        return queue[head++];
//    }
//
//
//    public int peek(){
//        if(count==0){
//            throw new IllegalArgumentException("Stack is empty");
//        }
//
//
//        return queue[head++];
//    }





}
