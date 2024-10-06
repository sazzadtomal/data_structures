package org.example.Stacks;

import java.util.Arrays;

public class CustomStack {

    int[] stack;

    int count;

    public CustomStack(){
        stack=new int[5];
    }




    public void push(int num){
        if(count==stack.length){
            int[] newStack=new int[stack.length*2];
            for(int i=0;i<stack.length;i++){
                newStack[i]=stack[i];
            }
            newStack[count]=num;
            stack=newStack;
        }
        else stack[count]=num;
        count++;
    }

    public int pop(){
        if(count==0){
            throw new IllegalArgumentException();
        }
      return stack[--count];
    }







    public void print(){
        System.out.println(Arrays.toString(stack));
    }



}
