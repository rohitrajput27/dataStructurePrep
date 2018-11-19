package com.binarysearch.tree;

public class Tree<T extends Comparable<T>> {

    private Node rootNode = null;

    public void insert(T data) {
        Node<T> newNode = new Node();
        newNode.setData(data);

        if (rootNode == null) {
            rootNode = newNode;
        } else {
            insertNode(getRootNode(), newNode);
        }
    }

    private Node<T> insertNode(Node<T> rootNode, Node<T> node) {
        if (rootNode == null) {
            rootNode = node;
            return rootNode;
        }
        if (rootNode.getData().compareTo(node.getData()) > 0) {
            rootNode.setLeftNode(insertNode(rootNode.getLeftNode(), node));
        } else {
            rootNode.setRightNode(insertNode(rootNode.getRightNode(), node));
        }
        return rootNode;
    }

    public Node getRootNode() {
        return rootNode;
    }

    public void printTree(Node<T> rootNode) {
        if (rootNode != null) {
            System.out.println(rootNode.getData());
            printTree(rootNode.getLeftNode());
            printTree(rootNode.getRightNode());
        }
    }

    public void printInOrder(Node<T> rootNode) {
        if (rootNode != null) {
            printInOrder(rootNode.getLeftNode());
            System.out.println(rootNode.getData());
            printInOrder(rootNode.getRightNode());
        }
    }

    public void printPreOrder(Node<T> rootNode) {
        if (rootNode != null) {
            System.out.println(rootNode.getData());
            printPreOrder(rootNode.getLeftNode());
            printPreOrder(rootNode.getRightNode());
        }
    }

    public void printPostOrder(Node<T> rootNode) {
        if (rootNode != null) {
            printPostOrder(rootNode.getLeftNode());
            printPostOrder(rootNode.getRightNode());
            System.out.println(rootNode.getData());
        }
    }
}
