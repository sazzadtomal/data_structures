package org.dataStructures.Stacks;

import java.util.Arrays;

public class TwoInOne {


    int[] stack;

    int stack1;
    int stack2;

    public TwoInOne(){
        stack=new int[5];
        stack1=0;
        stack2=stack.length-1;
    }

    public Boolean isFull(){
        return stack1>stack2;
    }


    public Boolean isEmpty1(){
        return stack1==0;
    }

    public Boolean isEmpty2(){
        return stack2==stack.length-1;
    }



    public void push1(int value){
        if(!isFull()){
            stack[stack1++]=value;
        }
        else throw  new IllegalArgumentException();
    }

    public void push2(int value){
        if(!isFull()){
            stack[stack2--]=value;
        }
        else throw new IllegalArgumentException();
    }

    public int pop1(){
        if(!isEmpty1()){
            return stack[--stack1];
        }
        else throw  new IllegalArgumentException();
    }

    public int pop2(){
        if(!isEmpty2()){
            return stack[++stack2];
        }
        else throw  new IllegalArgumentException();
    }



    public void print(){
        System.out.println(Arrays.toString(stack));
    }






}
