package com.queue;

public class QueueTest {

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();

        System.out.println(queue.pop());
        queue.add(new QueueNode<String>("Rohit"));
        queue.add(new QueueNode<String>("Shweta"));
        queue.add(new QueueNode<String>("Aaru"));
        queue.add(new QueueNode<String>("priya"));
        queue.add(new QueueNode<String>("gaurav"));
        queue.add(new QueueNode<String>("vishu"));
        queue.add(new QueueNode<String>("shalini"));

        printQueue(queue);
        System.out.println("-----");
        System.out.println(queue.pop());
        System.out.println("-----");
        printQueue(queue);
        System.out.println("-----");
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println("-----");
        printQueue(queue);
        System.out.println("-----");
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println("-----");
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
