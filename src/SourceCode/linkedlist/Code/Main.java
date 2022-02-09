package SourceCode.linkedlist.Code;

import SourceCode.linkedlist.CircularLinkedList.CLL;
import SourceCode.linkedlist.SinglyLinkedList.SLL;

public class Main {
    public static void main(String[] args) {
        CLL c = new CLL();
//        c.insertFirst(5);
//        c.insertFirst(4);
        c.insert(5);
        c.insert(6);
        c.insert(7);
        c.display();
        c.insertFirst(4);
        c.insert(8);
        c.display();
////        c.delete(5);
////        System.out.println(c.delete(5));
//        c.display();
//        c.delete(7);
//        c.display();


    }
}

