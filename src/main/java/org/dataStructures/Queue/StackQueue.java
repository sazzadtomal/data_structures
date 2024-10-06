package org.dataStructures.Queue;
import java.util.Stack;
public class StackQueue {

    Stack<Integer> push;
    Stack<Integer> pop;



    public StackQueue(){
        push=new Stack<>();
        pop=new Stack<>();
    }


    public void enque(int num){
        push.push(num);
    }

    public int deque(){
        if (pop.isEmpty()) {
            if (push.isEmpty()) throw new IllegalAccessError("Stack is empty");
            else {
                while(!push.isEmpty()) {
                    pop.push(push.pop());
                }
            }
        }
        return pop.pop();
    }

    public int peek(){
        if (pop.isEmpty()) {
            if (push.isEmpty()) throw new IllegalAccessError("Stack is empty");
            else {
                while(!push.isEmpty()) {
                    pop.push(push.pop());
                }
            }
        }
        return pop.peek();
    }


    public Boolean isEmpty(){
        return pop.isEmpty() && push.isEmpty();
    }






}
