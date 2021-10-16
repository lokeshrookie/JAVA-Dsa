package com.Lokesh.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("PineApple");
        fruits.add("Banana");
        fruits.add("Orange");


        numbers.add(4);
        numbers.add(5);
        numbers.add(8);
        numbers.add(0);
        numbers.add(-8869);

        //using Iterator to traverse through a linkedlist
        Iterator it = numbers.iterator();
        while(it.hasNext()){
            if((int)it.next() == 0 ){
                System.out.println(" we found 0 at ");
            }
        }




//        fruits.remove();
//        fruits.sort(null);
//        System.out.println(fruits.indexOf("Apple"));


        // for loop to traverse over linkedlist.
        for (String fruit : fruits) {
            if (fruit.equals("Orange")) {
                System.out.println("We found Orange at " + fruits.indexOf(fruit));
            }
        }
//        System.out.println("LinkedList as array : " + fruits);

    }
}
/**
 *
 * LinkedList: LinkedList contains nodes. each node contains an element as head of the node
 * and and address of another node as tail of the node
 *
 * * * * * * * * * * * IMPORTANT POINTS TO REMEMBER * * * * * * * * * * *
 * 1.Starting index is '0' and ending index is 'n-1'.
 *
 * add(element)
 * remove(element)
 * clear();
 * sort():
 * linkedlist.get(index);
 *
 */
