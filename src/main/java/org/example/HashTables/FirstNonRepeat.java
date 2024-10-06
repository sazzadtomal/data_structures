package org.example.HashTables;

import java.util.HashMap;
public class FirstNonRepeat {

    HashMap<Character,Boolean> map=new HashMap<>();


    public char firstNonRepeat(String data){

        char[] charArray=data.toCharArray();

        for(char ch:charArray){
            if(map.get(ch)==null) map.put(ch,true);
            else {
                map.put(ch,false);
            }
        }

        for(char ch:charArray){
            if(map.get(ch)) return ch;
        }

        return 0;

    }
}
