package com.linked.list.flattening;

public class FNode<T> {

    private T data;
    private FNode<T> right;
    private FNode<T> down;

    public FNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public FNode<T> getRight() {
        return right;
    }

    public void setRight(FNode<T> right) {
        this.right = right;
    }

    public FNode<T> getDown() {
        return down;
    }

    public void setDown(FNode<T> down) {
        this.down = down;
    }

    @Override
    public String toString() {
        return "FNode{" +
                "data=" + data +
                '}';
    }
}
