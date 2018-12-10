package com.linked.list.flattening;

public class FLinkedList<T> {

//    private FNode<T> head;
//
//    private FNode<T> rightTail;
//    private FNode<T> downTail;
//
//    public void addRight(T data)
//    {
//        FNode<T> newNode = new FNode<>(data);
//        if(head == null)
//        {
//            head =newNode;
//            rightTail = newNode;
//        }
//        else {
//            rightTail.setRight(newNode);
//        }
//
//    }
//
//    public void addDown(T data) {
//
//        FNode<T> newNode  = new FNode<>(data);
//        if
//    }

    public static void main(String[] args) {

        FNode<Integer> node5 = new FNode<>(5);
        FNode<Integer> node7 = new FNode<>(7);
        node5.setDown(node7);
        FNode<Integer> node8 = new FNode<>(8);
        node7.setDown(node8);
        FNode<Integer> node30 = new FNode<>(30);
        node8.setDown(node30);

        FNode<Integer> node10 = new FNode<>(10);
        node5.setRight(node10);
        FNode<Integer> node20 = new FNode<>(20);
        node10.setDown(node20);
        FNode<Integer> node19 = new FNode<>(19);
        node10.setRight(node19);
        FNode<Integer> node22 = new FNode<>(22);
        node19.setDown(node22);
        FNode<Integer> node50 = new FNode<>(50);
        node22.setDown(node50);
        FNode<Integer> node28 = new FNode<>(28);
        node19.setRight(node28);
        FNode<Integer> node35 = new FNode<>(35);
        node28.setDown(node35);
        FNode<Integer> node40 = new FNode<>(40);
        node35.setDown(node40);
        FNode<Integer> node45 = new FNode<>(45);
        node40.setDown(node45);

        print(node5);
    }

    public static void print(FNode headNode) {
        FNode temp = headNode;
        while (temp != null) {
            System.out.print(temp + "-->");
            temp = temp.getRight();
        }

        temp = headNode;
        while (temp != null) {
            if (temp.getDown() != null) {
                System.out.println();
                System.out.println("-------");
                printDown(temp);
                temp = temp.getRight();
            }
        }
    }

    public static void printDown(FNode headNode) {
        FNode temp = headNode;
        while (temp != null) {
            System.out.println(temp);
            System.out.println("|");
            System.out.println("\\/");
            temp = temp.getDown();
        }
    }

}
