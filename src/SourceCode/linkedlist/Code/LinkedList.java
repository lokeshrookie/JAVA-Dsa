package SourceCode.linkedlist.Code;

public class LinkedList{
    private Node head;
    private Node tail;
    private int size;


    public LinkedList() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        // if this is the only element, tail = head = this node.
        if(tail == null){
            tail = head;
        }
        size = size + 1;
    }



    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void  insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        // i = 0 is head itself
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }


    }


    private  class Node{
        private  int value;
        private  Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
