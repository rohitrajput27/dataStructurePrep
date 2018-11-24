package com.queue;

public class Queue<T> {

    private QueueNode<T> firstNode;
    private QueueNode<T> lastNode;

    public void add(QueueNode<T> node) {
        if (null == firstNode) {
            firstNode = node;
            lastNode = node;
        } else {
            lastNode.setNextElement(node);
            lastNode = node;
        }
    }

    public QueueNode<T> pop() {
        QueueNode<T> returnNode = null;
        if (null != firstNode) {
            returnNode = firstNode;
            firstNode = firstNode.getNextElement();

        }
        return returnNode;
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
