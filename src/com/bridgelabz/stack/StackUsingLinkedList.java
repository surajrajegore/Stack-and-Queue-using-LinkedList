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

    public void push(T data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        len++;
    }
    public boolean isEmpty()
    {
        return top == null;
    }
    public T peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }
        public void pop() {
            if (top == null) {
                System.out.print("\nStack Underflow");
            }
            top = top.next;
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

        System.out.println("peeked element top is " + stack.peek());
        System.out.println("stack before popped is "+stack);
        stack.pop();
        System.out.println("stack after popped is "+stack);
    }
}
