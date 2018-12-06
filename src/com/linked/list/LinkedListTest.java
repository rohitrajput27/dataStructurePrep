package com.linked.list;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.printList();
        System.out.println("--------------");
        linkedList.addLast("f");
        linkedList.addFirst("b");
        linkedList.addFirst("a");
        linkedList.printList();
        System.out.println("--------------");
    }
}
