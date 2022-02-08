package SourceCode.linkedlist.Code;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    DLL(){
        this.size = 0;
    }

    public int getSize(){
        return size;
    }
    public int getHead(){
        return head.val;
    }
    public int getTail(){
        return tail.val;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){  // if head is null, we cant assign previous to previous to head. so this statement is optional.
            head.prev = node;
        }
        head = node;
        head.prev = null;
        size++;
        if(tail == null){
            tail = head;
        }
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(size <= 1){
            insertFirst(val);
            return;
        }
        tail.next = node;
        node.next = null;
        node.prev = tail;
        tail = node;
        size++;
    }

    public void insert(int val, int index){
        if(index > size ){

        }
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        int ind = 0; // "already used. so we have to use temp.next inside while loop condition, not temp".
        while(temp.next != null){
            if(ind < index){
                temp = temp.next;
            }
        }
/*
        ==> If we use for loop, we get null pointer exception when the given index is more than size(index not found).
        ==> So while loop is better for this purpose.
        for(int i = 1; i<index; i++){ // loop starts form 1. 0 is head itself.
            temp = temp.next;
        }
        temp = node;
*/
        node.next = temp.next;
        node.prev = temp;
        temp.next = node;
        if(node.next == null){
            tail = node;
        }
//        node.next = temp.next.next;
//        node.prev = temp;
        size++;

    }

    public int deleteFirst() { // 2 edge cases: 0 element and single element linked list.
        if(size == 0){
            System.out.println("empty list");
            return -1;
        }
        if(size == 1){
            int val = head.val;
            head = null;
            return val;
        }
        int val = head.val;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public int deleteLast(){
        if(size == 0 || size == 1){
            return  deleteFirst();
        }
        Node temp = head;
        int val = head.val;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next  = null;
        tail = temp;
        return val;
    }

    public int delete(int index){
        if(index >= size){
            System.out.println("Index out of range");
            return -1;
        }
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node temp = head;
        for(int i = 1; i<index; i++){
            temp = temp.next;
        }
        int val = temp.val;
        temp.next.next.prev = temp;
        temp.next = temp.next.next;
//        temp.next.next.prev = temp;
        return val;



    }



    public void display(){
        Node temp  = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("end of linked list");
    }

    public void displayReverse(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.val + " => ");
            temp = temp.prev;
        }
        System.out.println(" Start of linked list  ");

    }




    private class Node{
        private int val;
        private Node next;
        private Node prev;
        Node(int val){
            this.val = val;
        }
        Node(int val,Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;

        }
    }
}
