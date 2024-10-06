package org.dataStructures.HashTables;

import java.util.LinkedList;

public class CustomHash {


    LinkedList<Entry>[] list=new LinkedList[5];

    private class Entry{
        int key;
        String value;


        private Entry(int key,String value){
            this.key=key;
            this.value=value;
        }
    }


    private int hash(int key){
        return  key%list.length;
    }


    public void put(int key,String value){
        int index=hash(key);
        if(list[index]==null){
            list[index]=new LinkedList<>();
        }
        else{
            for(Entry check :list[index]){
                if(check.key==key){
                    check.value=value;
                    return;
                }
            }
        }
        Entry entry=new Entry(key,value);
        list[index].add(entry);
    }


    public String get(int key) {
        int index = hash(key);
        if (list[index] != null) {
            for (Entry check : list[index]) {
                if (check.key == key) {
                    return check.value;
                }
            }
        }
        throw new IllegalArgumentException("item not found");
    }

    public void delete(int key) {
        int index = hash(key);
        if (list[index] != null) {
            for (Entry check : list[index]) {
                if (check.key == key) {
                    list[index].remove(check);
                    return;
                }
            }
        }
        throw new IllegalArgumentException("item not found");
    }














}
