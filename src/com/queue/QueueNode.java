package com.queue;

public class QueueNode<T> {

    private T data;
    private QueueNode<T> nextElement;

    public QueueNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public QueueNode<T> getNextElement() {
        return nextElement;
    }

    public void setNextElement(QueueNode<T> nextElement) {
        this.nextElement = nextElement;
    }

    @Override
    public String toString() {
        return "QueueNode{" +
                "data=" + data +
                '}';
    }
}
