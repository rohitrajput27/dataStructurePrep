package com.linked.list;

public class LNode<T> {

    private T data;
    private LNode<T> next;

    public LNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LNode<T> getNext() {
        return next;
    }

    public void setNext(LNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "LNode{" +
                "data=" + data +
                '}';
    }
}
