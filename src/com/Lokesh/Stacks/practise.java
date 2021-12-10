package com.Lokesh.Stacks;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;

public class practise {
    public static void main(String[] args) {
    }
}
//class Stac{
////    ArrayList<String> arr = new ArrayList<>();
//    private int[] arr;
//    private int top = -1;
//    private int capacity;
//    public Stac(int capacity) {
//        this.capacity = capacity;
//        arr = new int[capacity];
//    }
//    //push
//    public void push(int data){
//        if(arr.length == 0){
//            arr[0] = data;
//        }
//        top = 0;
//    }
//}

class Stackk
{
    private int arr[];
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    Stackk(int size)
    {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Utility function to add an element `x` to the stack
    public void push(int x)
    {
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(-1);
        }

        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    // Utility function to pop a top element from the stack
    public int pop()
    {
        // check for stack underflow
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }

        System.out.println("Removing " + peek());

        // decrease stack size by 1 and (optionally) return the popped element
        return arr[top--];
    }

    // Utility function to return the top element of the stack
    public int peek()
    {
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            System.exit(-1);
        }

        return -1;
    }

    // Utility function to return the size of the stack
    public int size() {
        return top + 1;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        return top == -1;               // or return size() == 0;
    }

    // Utility function to check if the stack is full or not
    public boolean isFull() {
        return top == capacity - 1;     // or return size() == capacity;
    }
}

class Main
{
    public static void main (String[] args)
    {
        Stackk stack = new Stackk(3);
        stack.push(1);      // inserting 1 in the stack
        stack.push(2);      // inserting 2 in the stack
        stack.push(3);      // inserting 3 in the stack
        stack.pop();        // removing the top element (3)
    }
}
















