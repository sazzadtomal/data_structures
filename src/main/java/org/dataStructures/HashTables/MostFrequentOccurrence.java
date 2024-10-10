package org.dataStructures.HashTables;

import java.util.*;

public class MostFrequentOccurrence {






    public static int mostFrequentInt(int[] nums){

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }

        int maxValue=-1;
        int maxNumber=-1;

        for(Map.Entry<Integer,Integer> pair: map.entrySet()){
            if(pair.getValue()>maxValue){
                maxValue= pair.getValue();
                maxNumber=pair.getKey();
            }

        }

        return maxNumber;
    }


    public static int mostFrequentIntOptimized(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int maxValue = 0;
        int maxNumber = nums[0]; // Initialize with the first element to avoid -1 for an empty array

        for (int num : nums) {
            // Use getOrDefault to simplify the counting
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);

            // Update the max number and value directly inside the loop
            if (count > maxValue) {
                maxValue = count;
                maxNumber = num;
            }
        }

        return maxNumber;
    }


    public static int pairDifferenceIsK(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for(int num:nums){
            set.add(num);
        }

        int count=0;

        for(Integer num:set){
            if(set.contains(num+k)){
                count++;
            }
        }

        return count;

    }

    public static void twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int value1=-1;
        int value2=-1;

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i]) && target-nums[i]!=nums[i]){

                value2=i;
                value1=map.get(target-nums[i]);
                break;
            }
            map.put(nums[i],i);
        }

        System.out.println(Arrays.asList(value1,value2));


    }

    public static int[] twoSumGPTWrong(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement is already in the map
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Store the current number's index in the map
            map.put(nums[i], i);
        }

        // Return an empty array if no valid pair is found
        return new int[]{};
    }





}








