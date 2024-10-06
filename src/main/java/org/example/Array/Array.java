package org.example.Array;

import java.util.*;

public class Array {

    private int[] array;
    private int count;

    public Array(int size){
      array=new int[size];
    }


    public void insert(int num){
        if(count==array.length){
            int[] newArray=new int [array.length*2];

            for (int i=0;i<array.length;i++){
               newArray[i]=array[i];
            }
            array=newArray;
            array[count++]=num;
        }
        else{
           array[count++]=num;
        }
    }






    public void insertAtWithBacktracking(int index,int num){

        if(count==array.length){
            int[] newArray=new int [array.length*2];

            for (int i=0;i<array.length;i++){
                newArray[i]=array[i];
            }
            array=newArray;
        }

        if(index>count){
            throw  new IllegalArgumentException();
        }
        if(index==count){
            array[count++]=num;
        }else{
            for(int i=count-1;i>=index;i--){
                array[i+1]=array[i];
            }
            array[index]=num;
            count++;
        }
    }







    public void insertAt(int index,int num){
        if(count==array.length){
            int[] newArray=new int [array.length*2];

            for (int i=0;i<array.length;i++){
                newArray[i]=array[i];
            }
            array=newArray;
        }


        if(index>count){
            throw  new IllegalArgumentException();
        }

        if(index==count){
            array[count++]=num;
        }else if(index==count-1){
            array[count]=array[count-1];
            array[index]=num;
            count++;}
        else{
            int iter=1;
            int temp1=array[index+1];
            array[index+1]=array[index];
            int temp2=0;

            for(int i=index+2;i<=count;i++){
                if(iter%2!=0){
                    temp2=array[i];
                    array[i]=temp1;
                }else {
                    temp1=array[i];
                    array[i]=temp2;
                }
                iter++;
            }
            array[index]=num;
        }

    }




    public void removeAt(int index){
        if(index>=count){
            System.out.println("This index do not exist");
        }

        int i;
        for(i=index;i<count;i++){
            array[i]=array[i+1];
        }

        array[i]=0;
        count--;

    }

    public int maxNumber(){
       if(count==0) throw  new IllegalArgumentException();
       int max=array[0];
       for(int i=1;i<array.length;i++){
           if(array[i]>max){
               max=array[i];
           }
       }
       return max;
    }


    public static void pushToMAp(int[] array,Map<Integer,Boolean> map){
        for(int value:array){
            map.put(value,false);
        }

    }






    public static List<Integer> intersect(int[] array1, int[] array2){

        Map<Integer,Boolean> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();

        pushToMAp(array1,map);

        for(int value:array2){
            if(map.containsKey(value)){
                map.replace(value,true);
            }
        }

        for(Integer key: map.keySet()){
            if(map.get(key)){
                list.add(key);
            }
        }


        return list;
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













    public void print(){
        System.out.println(Arrays.toString(array));
    }
}
