package com.stack;

public class SNode<T> {

    private T data;
    private SNode<T> nextNode;

    public SNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public SNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(SNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "SNode{" +
                "data=" + data +
                '}';
    }
}
