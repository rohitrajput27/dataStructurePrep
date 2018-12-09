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
            System.out.println("after node can not be null");
            return;
        }

        LNode newNode = new LNode(data);
//        LNode temp = node.getNext();
//        node.setNext(newNode);
//        newNode.setNext(temp);
        LNode temp = head;
        LNode afterNode = null;
        while (temp != null) {
            if (temp.getData().equals(after)) {
                afterNode = temp;
                break;
            }
            temp = temp.getNext();
        }

        if (afterNode == null) {
            System.out.println("node not found with: " + after);
        } else {
            temp = afterNode.getNext();
            newNode.setNext(temp);
            afterNode.setNext(newNode);
        }
    }

    public void printList() {
        LNode temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public T findMiddle() {
        LNode<T> fist = head;
        LNode<T> second = head;
        while (true) {

            if (second != null && second.getNext() != null) {
                second = second.getNext().getNext();
            } else {
                break;
            }
            fist = fist.getNext();
        }
        return fist.getData();
    }


}
