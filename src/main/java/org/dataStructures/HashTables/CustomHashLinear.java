package org.dataStructures.HashTables;

import java.util.Arrays;

public class CustomHashLinear {

    Object[][] hashtable=new Object[5][2];
    int count=0;

    private int hash(int key){
        return  key%hashtable.length;
    }



    public  void print2DArray() {
        for (int i = 0; i < hashtable.length; i++) { // Loop through rows
            for (int j = 0; j < hashtable[i].length; j++) { // Loop through columns
                System.out.print(hashtable[i][j] + " ");
            }
            System.out.println(); // Newline after each row
        }
    }



    public void put(int key, String value){

        int hash=hash(key);

        for(int i=hash;i<hashtable.length;i=(i%hashtable.length)+1) {
            if (hashtable[i][0] != null && (int) hashtable[i][0] == key) {
                hashtable[i][1] = value;
                return;
            }
        }

        if(count==hashtable.length) throw new IllegalArgumentException("hashmap is full");

        for(int i=hash;i<hashtable.length;i=(i%hashtable.length)+1){
            if(hashtable[i][0]==null){
                hashtable[i][0]=key;
                hashtable[i][1]=value;
                break;
            }

        }
        count++;
    }


    public String get(int key) {

        int hash = hash(key);
        for (int i = hash; i < hashtable.length; i = (i % hashtable.length) + 1) {
            if (hashtable[i][0] != null && (int) hashtable[i][0] == key) {
                return (String)hashtable[i][1];
            }
        }
        throw new IllegalArgumentException("key not present");
    }

    public void remove(int key) {

        int hash = hash(key);
        for (int i = hash; i < hashtable.length; i = (i % hashtable.length) + 1) {
            if (hashtable[i][0] != null && (int) hashtable[i][0] == key) {
                hashtable[i][0]=null;
                hashtable[i][1]=null;
                count--;
                return;
            }
        }
        throw new IllegalArgumentException("key not present");
    }








    public int size(){
        return count;
    }






}
