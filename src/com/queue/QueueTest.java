package com.queue;

public class QueueTest {

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        System.out.println("Size: " + queue.getSize());

        System.out.println(queue.dequeue());
        queue.enqueue("Rohit");
        queue.enqueue("Shweta");
        queue.enqueue("Aaru");
        queue.enqueue("priya");
        queue.enqueue("gaurav");
        queue.enqueue("vishu");
        queue.enqueue("shalini");
        System.out.println("Size: " + queue.getSize());

        printQueue(queue);
        System.out.println("-----");
        System.out.println(queue.dequeue());
        System.out.println("-----");
        System.out.println("Size: " + queue.getSize());
        printQueue(queue);
        System.out.println("-----");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println("-----");
        System.out.println("Size: " + queue.getSize());
        printQueue(queue);
        System.out.println("-----");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println("-----");
        System.out.println("Size: " + queue.getSize());
        printQueue(queue);
    }

    private static void printQueue(Queue queue) {
        QueueNode rootNode = queue.getPointerToFirstElement();
        if (rootNode != null) {
            while (rootNode.getNextElement() != null) {
                System.out.println(rootNode.getNextElement());
                rootNode = rootNode.getNextElement();
            }
        }
    }

}
