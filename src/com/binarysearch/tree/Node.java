package com.binarysearch.tree;

public class Node<T extends Comparable<T>> {

    private T data;
    private Node<T> leftNode;
    private Node<T> rightNode;

    public Node<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node<T> leftNode) {
        this.leftNode = leftNode;
    }

    public Node<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node<T> rightNode) {
        this.rightNode = rightNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "data: " + data.toString() + " leftNode: " + leftNode + " rightNode: " + rightNode;
    }
}
