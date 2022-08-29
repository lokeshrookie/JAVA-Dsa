package SourceCode.Leetcode;

import org.w3c.dom.NodeList;

import java.util.Collections;
import java.util.LinkedList;

public class AddTwoNumbers2 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.addFirst(2);
        l1.addLast(4);
        l1.addLast(3);
//        System.out.println(l1);
        l2.addFirst(5);
        l2.addLast(6);
        l2.addLast(4);
//        System.out.println(l2);
//        int n1 = 0;
//        while(l1.size() != 0){
//            n1 = n1 *10 + l1.getLast();
//            l1.removeLast();
//        }
//        int n2 = 0;
//        while(l2.size() != 0){
//            n2 = n2 * 10 + l2.getLast();
//            l2.removeLast();
//        }
//        int ans = n1+n2;
////        System.out.println(ans);
//        System.out.println(l1.getFirst());

        System.out.println(addTwoNumbers(l1, l2));

    }
    public static  LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2){
        int a = l1.getFirst();
        int b = l2.getFirst();
        return new LinkedList<Integer>(Collections.singleton(Integer.valueOf(a + b)));
    }
}
