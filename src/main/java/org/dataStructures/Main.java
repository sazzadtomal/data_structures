package org.dataStructures;

import org.dataStructures.Stacks.TwoInOne;

public class Main {
    public static void main(String[] args) {
//
//        Array array=new Array(2);
//        array.insert(1);
//        array.insert(2);
//        array.insert(3);
//        array.insert(4);
//        array.insert(5);
//        array.insert(6);
//        array.insert(7);
//        array.insert(8);
//
//        array.insertAtWithBacktracking(3,17);
//        array.print();


//        array.print();
//
//        System.out.println(Arrays.toString(Array.reverse(new int[]{1,2,3,4,5,6})));

//        System.out.println(Array.intersect(new int[]{5, 6, 9, 47},new int[]{35,65,47,5,477,123,9}));

//        LinkedList list=new LinkedList();
////        list.insert(5);
////        list.insert(8);
////        list.insert(15);
////        list.insert(52);
////        list.insert(82);
////        list.insert(45);
////        list.insert(48);
////        list.insert(115);
////        list.insert(125);
//
////        list.findMiddle();
//
//        list.addCycle();
//        System.out.println(list.haveCycle());
//        list.print();



//
//
//
//        System.out.println("retured "+ list.kthElement(5));
//
//        int[] array=list.convertToArray();
//        System.out.println(Arrays.toString(array
//        ));




//        CustomStack stack=new CustomStack();
//
//        stack.push(5);
//        stack.push(6);
//        stack.push(65);
//        stack.push(544);
//        stack.push(544);
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.print();
        //System.out.println(ReversingString.reverseString("Tomal"));


        TwoInOne stack=new TwoInOne();
        stack.push1(1);
        stack.push1(2);
        stack.push1(5);
        stack.push2(6);
        stack.push2(7);
        System.out.println(stack.pop1());
        System.out.println(stack.pop1());
        System.out.println(stack.pop1());
        stack.push2(11);
        stack.push2(12);
        stack.push2(13);
        System.out.println(stack.pop2());
        System.out.println(stack.pop2());
        System.out.println(stack.pop2());
        System.out.println(stack.pop2());
        System.out.println(stack.pop2());


        stack.print();







//        Queue<Integer> queue=new ArrayDeque<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//
//        System.out.println(Reversing.reverse(queue));
//        ArrayQueue queue=new ArrayQueue();
//
//        queue.enqueue(5);
//        queue.enqueue(6);
//        queue.enqueue(8);
//        queue.enqueue(9);
//        queue.enqueue(10);
//
//        System.out.println(queue.deque());
//        System.out.println(queue.deque());
//        System.out.println("count="+queue.count);
//        queue.enqueue(1);
//        queue.enqueue(2);
//        System.out.println(queue.deque());
//        queue.enqueue(3);
//        System.out.println("count="+queue.count);
//        queue.print();
//        StackQueue queue=new StackQueue();
//
//        queue.enque(5);
//        queue.enque(15);
//        queue.enque(25);
//        queue.enque(26);
//
//        System.out.println(queue.peek());
//        System.out.println(queue.deque());
//        System.out.println(queue.peek());
//        System.out.println(queue.deque());
//        System.out.println(queue.peek());
//        System.out.println(queue.deque());
//        System.out.println(queue.peek());
//        System.out.println(queue.deque());
//        PriorityQueue queue=new PriorityQueue();
//
//        queue.enque(5);
//        queue.enque(6);
//        queue.enque(3);
//        queue.enque(2);
//        queue.enque(4);
//
//        queue.print();
//        HashMap<Integer, String> map=new HashMap<>();
//        map.put(1,"Tomal");
//        map.put(2,"Tulee");
//        map.put(3,"Tanveer");
//        map.put(4,"Mifta");

//        FirstNonRepeat repeat=new FirstNonRepeat();
//
//        char first=repeat.firstNonRepeat("amar nam tomal");
//
//        System.out.println(first);

//        CustomHash hash=new CustomHash();
//
//        hash.put(1,"tomal");
//        hash.put(3,"Mifta");
//        hash.put(5,"muaz");
//        hash.put(11,"Tuleee");
//        hash.put(11,"yoyo");
//        System.out.println(hash.get(11));
//        System.out.println(hash.get(1));
//        System.out.println(hash.get(3));
//        System.out.println(hash.get(5));
//        System.out.println(FirstRepeat.firstRepeat("abcdeeffgg"));

    }
}