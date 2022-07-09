package com.bridgelabz.queue;

class Node<T>{
    T data;
    Node next;

    public Node(T data)
    {
        this.data = data;
        this.next = null;
    }
}

class Queue <T>{
    Node front, rear;

    public Queue()
    {
        this.front = this.rear = null;
    }

    void enqueue(int data)
    {

        Node temp = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        this.rear.next = temp;
        this.rear = temp;
    }
    void dequeue()
    {
        if (this.front == null)
            return;

        Node temp = this.front;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;
    }

    @Override
    public String toString() {
        String S = "{";

        Node<T> X = front;

        if (X == null) return S + "}";

        while (X.next != null) {
            S += String.valueOf(X.data) + "->";
            X = X.next;
        }

        S += String.valueOf(X.data);
        return S + "}";
    }
}

public class QueueUsingLinkedList {
    public static void main(String[] args)
    {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        System.out.println("ListQueue before dequeue "+queue);
        queue.dequeue();
        System.out.println("List after Dequeue "+queue);

    }
}