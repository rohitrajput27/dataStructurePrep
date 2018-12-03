package com.linked.list;

public class LinedList<T> {

    private LNode<T> head;
    private LNode<T> tail;

    private void addFirst(T data) {
        LNode newNode = new LNode(data);
        newNode.setNext(head);
        head = newNode;

    }

    private void addLast(T data) {

    }

    private void addAfter(T data, LNode<T> node) {

    }
}
