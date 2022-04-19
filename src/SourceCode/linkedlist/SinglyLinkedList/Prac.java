package SourceCode.linkedlist.SinglyLinkedList;

public class Prac {
    public static void main(String[] args) {
        Link one = new Link();
        one.insertFirst(1);

        one.display();

    }
}

class Link{
    private Node head;
    private int size;

    public void  insertFirst(int  value){
        Node node = new Node(value);
        if( size < 1){
            node.value = value;
            node.next = null;
        }
        else{
            node.next = head;
        }
        head = node;
        size++;
    }

    public  void insertLast(int value){
        Node node = new Node(value);
        if(size <1 ){
            insertFirst(value);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.next = null;
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
    }


    private static class Node{
        private  int value;
        private  Node next;

        Node(int value){
            this.value = value;
        }

        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
