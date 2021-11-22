package com.Lokesh.linkedlist.SinglyLinkedList;


public class SLL {
    private  int size;
    private  Node head;
    private  Node tail;

    public SLL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node  = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int val){
        if(size == 0){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public  void insert(int val, int index){

        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    /**
     *  take temp of int type to return the deleted value
     *
     * head = head.next;
     * this means making head null; so linkedlist will be empty.
     *
     *
     */
    public  int  deleteFirst(){
        int temp = head.value;
        head = head.next;
        if(head == null) tail = null;
        return  temp;
    }



    public void display(){
        if(isEmpty()){
            System.out.println(" Empty ");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }




    public boolean isEmpty(){
        return size==0;
    }

    private  class Node{
        private  int value;
        private  Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

}



class Test{
    public static void main(String[] args) {
        SLL l = new SLL();
        l.insertFirst(4);
        l.insertFirst(3);
        l.insertFirst(2);
        l.insertFirst(1);
        l.insertFirst(0);
        l.insertLast(5);
        l.insertLast(6);
        l.insert(4,4);
        l.deleteFirst();

        l.display();
        System.out.println(l.deleteFirst());
        l.display();
    }
}
