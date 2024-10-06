package org.dataStructures.Stacks;

import java.util.Stack;

public class ReversingString {

    public static String reverseString(String str){

        Stack<Character> stack=new Stack<>();

        for(char ch:str.toCharArray()){
            stack.push(ch);
        }

        StringBuffer reverse=new StringBuffer();
        while(!stack.isEmpty()){
            reverse.append(stack.pop());
        }

        return  reverse.toString();
    }
}
