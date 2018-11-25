package com.stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println(stack.pop());

        System.out.println("Size: " + stack.getSize());

        stack.push("Rohit");
        stack.push("Shweta");
        stack.push("Aaru");
        stack.push("Priya");
        stack.push("Gaurav");
        stack.push("Vishu");
        stack.push("Shalini");

        System.out.println("Size: " + stack.getSize());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("Size: " + stack.getSize());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("Size: " + stack.getSize());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("Size: " + stack.getSize());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("Size: " + stack.getSize());


    }
}
