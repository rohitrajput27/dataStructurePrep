package com.stack;

public class Stack<T> {

    private SNode<T> firstNode;
    private SNode<T> lastNode;

    private int count = 0;

    public void push(T data) {
        SNode<T> temp = new SNode<>(data);
        if (null == lastNode) {
            firstNode = temp;
            lastNode = temp;
        } else {
            temp.setNextNode(lastNode);
            lastNode = temp;
        }
        count++;
    }

    public SNode<T> pop() {
        SNode<T> temp = null;
        if (lastNode != null) {
            temp = lastNode;
            lastNode = lastNode.getNextNode();
            count--;
        }
        return temp;
    }

    public int getSize() {
        return count;
    }
}
