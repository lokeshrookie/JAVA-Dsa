package com.Lokesh.Queue;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Queue {
    ArrayList<Integer> arr = new ArrayList<>();
    private int size;

    public Queue() {
        this.size = 0;
    }

    public void enque(int val){
        arr.add(val);
        size++;
    }

    public void deque(){
        arr.remove(0);
    }



    public void  display(){
        if(arr.size() == 0){
            System.out.println("Empty Queue");
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println("END");
    }

}
