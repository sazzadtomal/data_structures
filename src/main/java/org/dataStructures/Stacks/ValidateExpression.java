package org.dataStructures.Stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ValidateExpression {

    public static Boolean isBalancedSingle(String input){

        Stack<Character> stack=new Stack<>();
        for(Character ch:input.toCharArray()){

            if(ch=='('){
                stack.push(ch);
            }

            if(ch==')'){
                if(!stack.isEmpty()){
                    Character open =stack.pop();
                }
                else{
                    return  false;
                }
            }
        }

        return stack.isEmpty();
    }


    public static Boolean isBalancedMultiple(String input){

        Stack<Character> stack=new Stack<>();
        for(Character ch:input.toCharArray()){

            List<Character> leftBrackets= Arrays.asList('(','{','[');
            List<Character> rightBrackets= Arrays.asList(')','}',']');

            if(leftBrackets.contains(ch)){
                stack.push(ch);
            }

            else if(rightBrackets.contains(ch)){

                if(!stack.isEmpty()){
                    Character open =stack.pop();
                    if(rightBrackets.indexOf(ch)!=leftBrackets.indexOf(open)){
                        return false;
                    }
                }
                else return false;
            }
        }
        return stack.isEmpty();
    }


}

