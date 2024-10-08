package org.dataStructures.Queue;

public class Main {
    public static void main(String[] args) {
        ReversingAQueueTillK queue=new ReversingAQueueTillK();

        queue.enque(5);
        queue.enque(84);
        queue.enque(29);
        queue.enque(23);
        queue.enque(45);
        queue.enque(621);
        System.out.println(queue.queue);
        queue.reverseTillKOP(3);
        System.out.println(queue.queue);

    }
}
