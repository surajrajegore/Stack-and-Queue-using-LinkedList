package com.bridgelabz.stack;
class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = next;
    }
}

class List<T> {
    private int len = 0;
    Node<T> top;

    List() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        len++;
    }
    public String toString() {

        String S = "{";

        Node<T> X = top;

        if (X == null) return S + "}";

        while (X.next != null) {
            S += String.valueOf(X.data) + "->";
            X = X.next;
        }

        S += String.valueOf(X.data);
        return S + "}";
    }

}
public class StackUsingLinkedList {
    public static void main(String[] args) {
        List<Integer> stack = new List<>();
        stack.push(70);
        stack.push(30);
        stack.push(50);
        System.out.println("stack is "+stack);

    }

}
