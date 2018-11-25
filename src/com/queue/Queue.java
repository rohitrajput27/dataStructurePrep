package com.queue;

public class Queue<T> {

    private QueueNode<T> firstNode;
    private QueueNode<T> lastNode;
    private int count = 0;

    public void enqueue(T data) {
        QueueNode<T> temp = new QueueNode<>(data);
        if (null == firstNode) {
            firstNode = temp;
            lastNode = temp;
        } else {
            lastNode.setNextElement(temp);
            lastNode = temp;
        }
        count++;
    }

    public QueueNode<T> dequeue() {
        QueueNode<T> returnNode = null;
        if (null != firstNode) {
            returnNode = firstNode;
            firstNode = firstNode.getNextElement();
            count--;
        }

        return returnNode;
    }

    public int getSize() {
        return count;
    }
    public QueueNode<T> getFirstElement() {
        return firstNode;
    }

    public QueueNode<T> getPointerToFirstElement() {
        QueueNode<T> temp = new QueueNode<T>(null);
        temp.setNextElement(firstNode);
        return temp;
    }
}
