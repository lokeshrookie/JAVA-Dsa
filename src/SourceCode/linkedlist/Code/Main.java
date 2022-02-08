package SourceCode.linkedlist.Code;

import SourceCode.linkedlist.SinglyLinkedList.SLL;

public class Main {
    public static void main(String[] args) {
        DLL l = new DLL();
//        l.delete(0);
//        l.deleteFirst();
//        l.deleteLast();


        l.insert(5,0);
        l.insert(6,0);
        l.insertFirst(1);
//        l.insert(2,1);
        l.display();
        l.delete(1);
        l.display();
//        System.out.println("Size == " + l.getSize());
    }
}

