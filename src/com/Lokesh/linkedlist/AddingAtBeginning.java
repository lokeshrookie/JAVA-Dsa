package com.Lokesh.linkedlist;

public class AddingAtBeginning {
        public static void main(String args[]){
            LinkedList1 list = new LinkedList1();
            list.addAtEnd("Milan");
            list.addAtEnd("Venice");
            list.addAtEnd("Munich");
            list.addAtBeginning("Nice");
//            System.out.println(list.getHead());
//            System.out.println(list.getTail());
            list.display();

        }
}
class Node {
    private String data;
    private Node next;

    public Node(String data){
        this.data=data;
    }
    public void setData(String data){
        this.data = data;
    }
    public void setNext(Node node){
        this.next = node;
    }
    public String getData(){
        return this.data;
    }
    public Node getNext(){
        return this.next;
    }
}

class LinkedList1 {

    private Node head;
    private Node tail;

    public Node getHead(){
        return this.head;
    }
    public Node getTail(){
        return this.tail;
    }
    public void addAtEnd(String data){
        //Create a new node
        Node node = new Node(data);

        //Check if the list is empty,
        //if yes, make the node as the head and the tail
        if(this.head == null)
            this.head=this.tail=node;
        else{
            //If the list is not empty, add the element at the end
            this.tail.setNext(node);
            //Make the new node as the tail
            this.tail=node;
        }

    }


    public void addAtBeginning(String data){
        Node node = new Node(data);
        //Implement your code here
        if(this.head == null){
            this.head = this.tail = node;
        }
        else{
            node.setNext(this.head);
            this.head = node;
        }
    }

    public void display(){
        Node temp = this.head;
        while(temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

}


