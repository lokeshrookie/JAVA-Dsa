package  com.Lokesh;

import  java.util.*;

class Stack {
    private int array[];
    private int top;
    private int capacity;

    Stack(int capacity) {
        this.array = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    public  void push(int item) {
        if(isFull()) {
            throw  new RuntimeException("Stack is Full");
        }
        array[++top] = item;
    }

    public int pop() {
        if(isEmpty()) {
            throw  new RuntimeException("Stack is Empty");
        }
        return array[top--];
    }

    public  int peek() {
        if(isEmpty()) {
            throw  new RuntimeException("Stack is Empty");
        }
        return array[top];
    }

    public  boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.isEmpty();
        s.isFull();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println();

    }
}


