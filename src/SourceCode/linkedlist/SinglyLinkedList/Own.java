package SourceCode.linkedlist.SinglyLinkedList;

public class Own {
    public static void main(String[] args) {
        L l = new L();
        for(int i = 0; i< 10; i++){
            l.insert(i,i);
        }
        l.display();
        l.insert(5,0);
        l.display();
        System.out.println(l.delete(9));
        l.display();
    }
}
class L{
    Node head;
    int size;
    Node tail;
    L(){
        this.size = 0;
    }
    L(Node head){
        this.head = head;
    }

    public int getSize(){
        return size;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
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
        for(int i = 1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(val);
        Node next = temp.next.next;
        temp.next.next = node.next;
        temp.next = node;
        node.next = next;
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public int deleteFirst(){
        if(head != null){
            int val = head.val;
            head = head.next;
            size--;
            return val;
        }
        System.out.println("Empty list. Can't delete head");
        return -1;
    }
    public int deleteLast(){
        if(size == 0 || size == 1){
            return deleteFirst();
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        int val = temp.next.val;
        tail = temp;
        tail.next = null;
        size--;
        return val;
    }
    public int delete(int index){
        if(index > size){
            System.out.println("index not found");
            return -1;
        }
        if(index == 0){
           return deleteFirst();
        }
        if(index == size-1 ){
            return deleteLast();
        }
        Node temp = head;
        for(int i = 1; i<index; i++){
            temp = temp.next;
        }
        int val = temp.next.val;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    // change the value of a node or replace a node
    public void change(int val, int index){
        if (index == 0){
            head.val = val;
            return;
        }
        if(index == size-1){
            tail.val = val;
            return;
        }
        Node temp = head;
        for(int i = 0; i<index; i++){
            temp = temp.next;
        }
        temp.val = val;
    }
    private class Node{
        int val;
        Node next;

        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
        Node(int val){
            this.val = val;
        }
    }
}


