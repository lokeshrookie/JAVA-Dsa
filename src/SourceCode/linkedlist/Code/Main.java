package SourceCode.linkedlist.Code;

import SourceCode.linkedlist.SinglyLinkedList.SLL;

public class Main {
    public static void main(String[] args) {
        DLL l = new DLL();
////        l.insertFirst(4);
////        l.insertFirst(5);
////        l.insertFirst(6);
////        l.insertFirst(7);
//        l.insertLast(3);
//        l.insertFirst(1);
//        l.insert(2,1);
//        l.insertLast(4);
//        l.insertLast(5);
//        l.insertLast(6);
//        l.insert(7,5);
//        l.insertLast(9);
//        l.insertLast(8);

        l.insertLast(9);
        l.insertFirst(1);
        l.insert(2,1);
        l.display();

        l.displayReverse();
        System.out.println("Size == " + l.getSize());


    }
}

