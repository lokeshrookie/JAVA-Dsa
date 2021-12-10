package com.Lokesh.Stacks;

import java.util.ArrayList;

public class Implement {
    public static void main(String[] args) {

    }
}

class Stack {
    private int array[];
    private int top;
    private int capacity;

    public Stack() {
    }

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

/*

UDEMY JAVA DSA

public class Stack {
  int[] arr;
  int topOfStack;

  public Stack(int size) {
    this.arr = new int[size];
    this.topOfStack = -1;
    System.out.println("The Stack is created with size of: " + size);
  }

  // isEmpty
  public boolean isEmpty() {
    if (topOfStack == -1) {
      return true;
    } else {
      return false;
    }
  }

  // isFull

  public boolean isFull() {
    if (topOfStack == arr.length-1) {
      // System.out.println("The Stack is full!");
      return true;
    } else {
      return false;
    }
  }

  // Push
  public void push(int value) {
    if (isFull()) {
      System.out.println("The Stack is full!");
    } else {
      arr[topOfStack+1] = value;
      topOfStack++;
      System.out.println("The value is successfully inserted");
    }
  }

  // pop
 public int pop() {
    if (isEmpty()) {
      System.out.println("The stack is empty");
      return -1;
    } else {
      int topStack = arr[topOfStack];
      topOfStack--;
      return topStack;
    }
  }

// Peek method
public int peek() {
  if (isEmpty()) {
    System.out.println("The stack is empty!");
    return -1;
  } else {
    return arr[topOfStack];
  }
}

//  Delete method
public void deleteStack() {
  arr = null;
  System.out.println("The Stack is successfully deleted");
}

}

 */








