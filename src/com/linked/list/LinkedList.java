package com.linked.list;

public class LinkedList<T> {

    private LNode<T> head;
    private LNode<T> tail;

    public void addFirst(T data) {
        LNode newNode = new LNode(data);
        newNode.setNext(head);
        head = newNode;
        if (null == tail) {
            tail = head;
        }

    }

    public void addLast(T data) {
        if (null != tail) {
            LNode newNode = new LNode(data);
            tail.setNext(newNode);
            tail = newNode;
        } else {
            addFirst(data);
        }
    }

    public void addAfter(T data, T after) {
        if (null == after) {
            throw new RuntimeException("Given node can not be null");
        }

        LNode newNode = new LNode(data);
//        LNode temp = node.getNext();
//        node.setNext(newNode);
//        newNode.setNext(temp);
        LNode temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public void printList() {
        LNode temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

}
