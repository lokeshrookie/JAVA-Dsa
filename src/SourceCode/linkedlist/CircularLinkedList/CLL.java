package SourceCode.linkedlist.CircularLinkedList;

public class CLL {
    private Node head;
    private Node tail;
    private int size;

    public CLL(){ // make constructor public.
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
            head = node;
            tail.next = head;
//            head.next = tail;
//            head.next = tail;
//            tail.next = head;
            size++;
            return;
        }
        node.next = tail.next;
        tail.next = node;
        head = node;
        size++;
    }

    public int delete(int val){
        if(head.value == val){       // delete head;
            return deleteFirst();
//            int value = head.value;
//            tail.next = head.next;
//            head = tail.next;
//            size--;
//            if(size == 0){
//                head = null;
//                tail = null;
//            }
//            return val;
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
                size--;
                return temp.value;
            }
            temp = temp.next;
        }
        return -1;
    }

    public int deleteFirst(){
        if(size == 0){
            System.out.println("Empty list. no elements to delete.");
            return -1;
        }
        int val  = head.value;
        tail.next = head.next;
        head = head.next;
        size--;
        return val;
    }

    public int deleteLast(){
        if(size  == 1){
            return deleteFirst();
        }
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }

        int val = temp.next.value;
        temp.next = head;
        tail = temp;
        size--;
        return val;
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

