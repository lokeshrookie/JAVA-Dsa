package com.Lokesh;


class  Node{
    private String data;
    private Node next;

    public Node(String data){
        this.data = data;
    }
    public void setData(String data){
        this.data = data;
    }
    public  void setNext(Node node){
        this.next = node;
    }
    public  String getData(){
        return  this.data;
    }
    public  Node getNext(){
        return this.next;
    }

}

public class LinkedList {
    private  Node head;
    private  Node tail;

    public  Node getHead(){
        return this.head;
    }

    public  Node getTail(){
        return  this.tail;
    }
    public void  addAtEnd(String data){
        //create new node
        Node node = new Node(data);
        //check if the node is empty.
        //if yes, make the node as the head and tail.
        if(this.head == null)
            this.head = this.tail = node;
        else
            this.tail.setNext(node);
        this.tail = node;
        //if the list is not empty, add the element at the end
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

    public  Node find(String data){
        Node temp = this.head;

        while(temp != null){
            if(temp.getData().equals(data)){
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }
    public void insert(String data, String dataBefore) {
        Node node = new Node(data);
        // Check if the list is empty,
        // if yes, make the node as the head and the tail
        if (this.head == null)
            this.head = this.tail = node;
        else {
            // Find the node after which the data has to be inserted
            Node nodeBefore = this.find(dataBefore);
            if (nodeBefore != null) {
                // Insert the new node after nodeBefore
                node.setNext(nodeBefore.getNext());
                nodeBefore.setNext(node);
                // If nodeBefore is currently the tail node,
                // make the new node as the tail node
                if (nodeBefore == this.tail)
                    this.tail = node;
            } else
                System.out.println("Node not found");
        }
    }

    public void delete(String data) {
        // Check if the list is empty,
        if (this.head == null)
            System.out.println("List is empty");
        else {
            // Find the node to be deleted
            Node node = this.find(data);
            // If the node is not found
            if (node == null)
                System.out.println("Node not found");
                // If the node to be deleted is the head node
            else if (node == this.head) {
                this.head = this.head.getNext();
                node.setNext(null);
                // If the node to be deleted is also the tail node
                if (node == this.tail)
                    tail = null;
            } else {
                // Traverse to the node present before the node to be deleted
                Node nodeBefore = null;
                Node temp = this.head;
                while (temp != null) {
                    if (temp.getNext() == node) {
                        nodeBefore = temp;
                        break;
                    }
                    temp = temp.getNext();
                }
                // Remove the node
                nodeBefore.setNext(node.getNext());
                // If the node to be deleted is the tail node,
                // then make the previous node as the tail
                if (node == this.tail)
                    this.tail = nodeBefore;
                node.setNext(null);
            }
        }
    }
}

class Tester {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addAtBeginning("40");
        list.addAtEnd("60");
        list.addAtEnd("70");
        list.addAtEnd("80");
        list.addAtBeginning("1");
        list.display();
        //finding node in linkedlist
        if(list.find("600") != null){
            System.out.println("Node found");
        }
        else{
            System.out.println("Node not found");
        }
        // inserting new node and
        list.insert("added", "40");
        list.delete("60");
        list.display();

    }
}

