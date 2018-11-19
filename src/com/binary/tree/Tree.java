package com.binary.tree;

public class Tree {

    private Integer numberOfElements;
    private Node rootNode;
    private int index = 0;
    private int[] dataElements = null;

    {
        dataElements = new int[numberOfElements];
    }

    public Tree(Integer numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public Node getRootNode() {
        return rootNode;
    }

    public void setRootNode(Node rootNode) {
        this.rootNode = rootNode;
    }

    public void insert(Integer data) {
        if (rootNode == null) {
            Node node = new Node(data);
            rootNode = node;
        } else {
            insertInto(rootNode, data);
        }
    }

    private void insertInto(Node node, Integer data) {
        if (node.getLeftNode() == null) {
            node.setLeftNode(new Node(data));
        } else if (node.getRightNode() == null) {
            node.setRightNode(new Node(data));
        } else {
            insertInto(node.getLeftNode(), data);
        }
        index++;
    }

    public void printInOrder(Node rootNode) {
        if (rootNode != null) {
            printInOrder(rootNode.getLeftNode());
            System.out.println(rootNode.getData());
            printInOrder(rootNode.getRightNode());
        }
    }

    public void printPreOrder(Node rootNode) {
        if (rootNode != null) {
            System.out.println(rootNode.getData());
            printPreOrder(rootNode.getLeftNode());
            printPreOrder(rootNode.getRightNode());
        }
    }
}
