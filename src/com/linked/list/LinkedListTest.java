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
        linkedList.addAfter("c", "b");
        linkedList.addAfter("d", "c");
        linkedList.addAfter("e", "d");
        linkedList.addLast("g");
        linkedList.addLast("h");
        linkedList.addLast("i");
        linkedList.addLast("j");
        linkedList.printList();
        System.out.println("--------------");

        System.out.println("getting middle");
        System.out.println(linkedList.findMiddle());
    }
}
