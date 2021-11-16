package collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("Oklahoma");
        queue.offer("Indiana");
        queue.offer("Georgia");
        queue.offer("Texas");

        //queue.remove();
        System.out.println("Priority queue using Comparable : ");
        while (queue.size() > 0) {
            System.out.print(queue.remove() + " ");

        }

        Queue<String> queue2 = new PriorityQueue(4, Collections.reverseOrder());
        queue2.offer("Oklahoma");
        queue2.offer("Indiana");
        queue2.offer("Georgia");
        queue2.offer("Texas");

        //queue.remove();
        System.out.println("\nPriority queue using Comparable : ");
        while (queue2.size() > 0) {
            System.out.print(queue2.remove() + " ");

        }
    }
}
