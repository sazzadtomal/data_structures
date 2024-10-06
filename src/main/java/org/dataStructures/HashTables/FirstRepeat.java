package org.dataStructures.HashTables;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeat {


    static Set<Character> set=new HashSet<>();



    public static char firstRepeat(String input){

        char[] array=input.toCharArray();
        for(int i=0;i<array.length;i++){
              if(set.contains(array[i])){
                 return array[i];
              }
              else set.add(array[i]);
          }

        return 0;
    }
}
