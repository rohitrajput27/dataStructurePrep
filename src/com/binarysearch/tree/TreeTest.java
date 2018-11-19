package com.binarysearch.tree;

public class TreeTest {


    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();

        tree.insert(3);
        tree.insert(1);
        tree.insert(4);
        tree.insert(2);
        tree.insert(10);
        tree.insert(6);

        tree.printTree(tree.getRootNode());
        System.out.println(tree.getRootNode());

        tree.printInOrder(tree.getRootNode());
        System.out.println("----");
        tree.printPreOrder(tree.getRootNode());
        System.out.println("----");
        tree.printPostOrder(tree.getRootNode());
    }
}
