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

        int i=hash;
        do {
            if (hashtable[i][0] != null && (int) hashtable[i][0] == key) {
                hashtable[i][1] = value;
                return;
            }
            i=(i+1)%hashtable.length;
        }while (i!=hash);


        if(count==hashtable.length) throw new IllegalArgumentException("hashmap is full");
        else do {
            if(hashtable[i][0]==null){
                hashtable[i][0]=key;
                hashtable[i][1]=value;
                count++;
                break;
            }
            i=(i+1)%hashtable.length;
        }while (i!=hash);

    }


    public String get(int key) {
        if(isEmpty()) throw new IllegalArgumentException("Map is empty");
        int hash = hash(key);
        int i=hash;
        do {
            if (hashtable[i][0] != null && (int) hashtable[i][0] == key) {
                return (String)hashtable[i][1];
            }
            i=(i+1)%hashtable.length;
        }while (i!=hash);

        throw new IllegalArgumentException("key not present");
    }

    public void remove(int key) {
        if(isEmpty()) throw new IllegalArgumentException("Map is empty");

        int hash = hash(key);
        int i=hash;
        do {
            if (hashtable[i][0] != null && (int) hashtable[i][0] == key) {
                hashtable[i][0]=null;
                hashtable[i][1]=null;
                count--;
                return;
            }
            i=(i+1)%hashtable.length;
        }while (i!=hash);


        throw new IllegalArgumentException("key not present");
    }



    public Boolean isEmpty(){
        return count==0;
    }








    public int size(){
        return count;
    }






}
