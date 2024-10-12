package org.dataStructures.HashTables;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

//        int[] array={1,4,3,4,5,6,9,11,11,11};
//        System.out.println(MostFrequentOccurrence.mostFrequentInt(array));

//        int[] array={1, 7, 9,9,9};
//        System.out.println(MostFrequentOccurrence.pairDifferenceIsK(array,2));

//         int[] array={3,3,2,4};
//         MostFrequentOccurrence.twoSum(array,6);

        CustomHashLinear hashmap=new CustomHashLinear();

        hashmap.put(5,"lala");
        System.out.println(hashmap.isEmpty());
        System.out.println(hashmap.get(5));
        hashmap.remove(5);
        System.out.println(hashmap.isEmpty());










        hashmap.print2DArray();





    }
}
