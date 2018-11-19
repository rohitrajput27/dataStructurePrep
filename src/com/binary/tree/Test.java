package com.binary.tree;

public class Test {

    public static void main(String[] args) {
//        System.out.println("test start");
        Test.reversOrder(26);
    }

    private static void reversOrder(int index) {
//        System.out.println("reverse order called");
        if (index > 1) {
//            System.out.println("inside recursion");
            reversOrder(index / 2);
            System.out.print(index / 2);
            System.out.print(index % 2 == 1 ? " right" : " left");
            System.out.println();
        }
    }
}
