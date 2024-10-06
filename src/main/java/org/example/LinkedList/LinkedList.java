package org.example.LinkedList;

public class LinkedList {


    private class Node {
        private int value;
        private Node next;

        private Node(int value){
            this.value=value;
        }

    }



    private Node first;
    private Node last;
    private int count;


    public LinkedList(){
    }


    public void insert(int value){
        Node node=new Node(value);

        if(first ==null && count==0){
            first = last =node;
            count++;
        }else{

            Node traverse= first;
            for(int i=1;i<count;i++){
              traverse=traverse.next;
           }

            traverse.next=node;
            last =node;
            count++;

        }
    }




    public void addFirst(int value){
        Node node=new Node(value);

        if(first!=null && last!=null){
            node.next=first;
            first=node;

        }
        else {
            first=last=node;
        }
        count++;
    }

    public void addLast(int value,Node cycle){
        Node node=new Node(value);

        node.next=cycle;

        if(first!=null && last!=null){
            last.next=node;
            last=node;
        }
        else {
            first=last=node;
        }
        count++;

    }



    public void addCycle(){

        for(int i=0;i<=100;i++){
           insert(i);
        }
        last.next=containsNode(101);
    }


    public Boolean haveCycle(){
        Node pointer1=first;
        Node pointer2=first;

        while(pointer2.next!=null){

            pointer2=pointer2.next;
            if(pointer2.next==null){
                return false;
            }
            else{
                pointer2=pointer2.next;
                if(pointer1==pointer2){
                    return true;
                }
                pointer1=pointer1.next;

                if(pointer1==pointer2){
                    return true;
                }
            }}

     return false;
    }


    public Boolean haveCycleGPT() {
        Node slow = first;
        Node fast = first;

        // Loop as long as the fast pointer and its next are not null
        while (fast != null && fast.next != null) {
            // Move slow pointer by one step
            slow = slow.next;
            // Move fast pointer by two steps
            fast = fast.next.next;

            // If slow and fast pointers meet, there's a cycle
            if (slow == fast) {
                return true;
            }
        }

        // If we exit the loop, there's no cycle
        return false;
    }









    public int indexOf(int num){

        if(first!=null && last!=null){
            Node traverse= first;

            for(int i=1;i<=count;i++){
                if(traverse.value==num){
                    return i;
                }
                else{
                    traverse=traverse.next;
                }
            }

        }
        return -1;
    }


    public boolean contains(int num){

        if(first!=null && last!=null){
            Node traverse= first;

            for(int i=1;i<=count;i++){
                if(traverse.value==num){
                    return true;
                }
                else{
                    traverse=traverse.next;
                }
            }

        }
        return false;
    }


    public Node containsNode(int num){

        if(first!=null && last!=null){
            Node traverse= first;

            for(int i=1;i<=count;i++){
                if(traverse.value==num){
                    return traverse;
                }
                else{
                    traverse=traverse.next;
                }
            }

        }
        return null;
    }








    public void removeFirst(){

        if(first!=null && last!=null){

            if(first==last){
                first=last=null;
            }
            else{
                Node second=first.next;
                first.next=null;
                first=second;
            }
            count--;
        }

   }

    public void removeLast(){

        if(first!=null && last!=null){

            if(first==last){
                first=last=null;

            }else{

                Node traverse=first;

                while(traverse.next!=last){
                    traverse=traverse.next;
                }

                traverse.next=null;
                last=traverse;
            }
            count--;

        }

    }



    public int[] convertToArray(){
        int[] array=new int[count];

        if(first!=null && last!=null){
            Node traverse=first;
            int index=0;
            while(traverse!=null){
                array[index++]=traverse.value;
                traverse=traverse.next;
            }
        }
        return array;
    }


    public void reverse(){
        Node p1=first;
        Node p2=first.next;
        Node temp=p2.next;
        p2.next=p1;
        last=p1;
        p1.next=null;

        while (temp!=null){
            p1=p2;
            p2=temp;
            temp=p2.next;
            p2.next=p1;
        }
        first=p2;
    }

    public void reverseMosh(){


        if(first!=null && last!=null){
            Node previous=first;
            Node current=first.next;

            while (current!=null){
                Node next=current.next;
                current.next=previous;
                previous=current;
                current=next;
            }
            last=first;
            last.next=null;
            first=previous;

        }

    }



    public void findMiddle(){
        Node pointer1=first;
        Node pointer2=first;


        while (pointer2!=last && pointer2.next!=last){
            pointer2=pointer2.next.next;
            pointer1=pointer1.next;
        }

        if (pointer2 == last) {
            System.out.println("middle is "+pointer1.value);
        }else{
            System.out.println("there is two middle "+ pointer1.value+" and "+ pointer2.value);
        }


    }




    public int kthElement(int k){
        Node pointer1,pointer2;
        pointer1=pointer2=first;

        for(int i=1;i<k;i++){
            if(pointer2.next!=null){
                pointer2=pointer2.next;
            }
            else return -1;
        }

        while(pointer2.next!=null){
            pointer1=pointer1.next;
            pointer2=pointer2.next;
        }

        return pointer1.value;

    }





    public void delete(int index){
        Node pointer1=first;
        Node pointer2=first.next;
        for(int i=0;i<=index;i++){
            if(pointer2.next!=null){
                pointer1=pointer1.next;
                pointer2=pointer2.next;
            }
        }

    }

















    public void print(){
        Node traverse= first;

        for(int i=1;i<=count;i++){
            System.out.println(traverse.value);
            traverse=traverse.next;
        }
    }
}
