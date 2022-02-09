package SourceCode.linkedlist.CircularLinkedList;

public class CLL {
    private Node head;
    private Node tail;
    private int size;

    public CLL(){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
//            head = node;
//            tail = node;
//            head.next = node;
            insertFirst(val);
            return;
        }

        node.next = head;
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        if(size == 0){
            tail = node;
            tail.next = node;
            head = node;
            head.next = tail;
            tail.next = head;
            return;
        }
        node.next = tail.next;
        tail.next = node;
        head = node;
        size++;
    }

    public int delete(int val){
        if(head.value == val){       // delete head;
            int value = head.value;
            tail.next = head.next;
            head = tail.next;
            size--;
            if(size == 0){
                head = null;
                tail = null;
            }
            return val;
        }
        if(tail.value == val){      //delete tail
            Node temp = head;
            int value = head.value;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
            return head.value;
        }                           // delete non-head/non-tail
        Node temp = head.next;
        while(temp != head){
            if(temp.next.value == val){
                temp.next.next = temp.next.next.next;
                return temp.value;
            }
            temp = temp.next;
        }
        return -1;
    }

    public void display(){
        if(size == 0){
            System.out.println("Empty list");
            return;
        }
        Node temp = head;
        if(head != null){
            do {
                System.out.print(temp.value + " => ");
                temp = temp.next;
            }while(temp != head);

            System.out.println("HEAD");
        }
    }
    private class Node{
        private int value;
        private Node next;
        Node(int val){
            this.value = val;
            this.next = null;
        }
        Node(int val, Node next){
            this.value = val;
            this.next = next;
        }
    }
}

