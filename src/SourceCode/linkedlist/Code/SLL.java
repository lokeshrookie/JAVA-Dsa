package SourceCode.linkedlist.Code;

public class SLL {
    private Node head;
    private Node tail;
    private int size;


    public SLL() {
        this.size = 0;
    }
    static class Node{
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


    public void insertFirst(int val){ // - one edge case => empty list(after insertion, tail need to be updated i.e, tail = head )
        Node node = new Node(val);
        node.next = head;
        head = node;
        // if this is the only element, tail = head = this node.
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void  insertLast(int val){ //  - one edge case => if tail == null(one empty list), then call insertFirst();
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index){ // - Two edge cases, head index or tail index;
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        Node node = new Node(value);
        Node temp = head;
        for(int i = 1; i<index; i++){
            temp = temp.next;
        }
        Node next = temp.next;
        temp.next = node;
        node.next = next;
        size++;
    }

    public int deleteFirst(){ // - one edge case >> no elements
        int temp = head.value;
        head = head.next;
        size--;
        if(head == null){
            tail = head;
        }
        return temp;
    }

    public int deleteLast(){ // - one edge case >> single element, return deleteFirst.
        if(size <= 1){
           return deleteFirst();
        }
        int value = tail.value;
        Node secondLast = getNode(size-2);
        tail = secondLast;
        tail.next = null;
        size--;
        return value;
    }

    public int delete(int index){ // deletes node at given index. two edge cases: index is 0(head index) or size-1(tail index)
        if(index == 0){
           return deleteFirst(); // dont forgot to return methods int required.
        }
        if(index == size-1){
           return deleteLast();
        }
        Node previous = getNode(index -1); // we want previous. so index-1 used
        int val = previous.next.value;
        previous.next = previous.next.next;
        size--;
        return val;
    }

    //method for printing linked list elements
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp  = temp.next;
        }
        System.out.println("Linked list printed succesfully");
    }

    public Node getNode(int index){ // return noe at given index. call getNode(index-1) to get previous Node.
        if(index == 0){
            return head;
        }
        if(index == size-1){ //size-1 is last index.
            return tail;
        }
        Node node = head;
        for(int i = 0; i<index; i++){
            node = node.next;
        }
        return node;
    }

    public Node find(int val){
        Node temp = head;
        while(temp != null){
            if(temp.value == val){
                return temp;
            }
            temp = temp.next; // update temp value.
        }
        return null; // return null if node with given value is not found.
    }
}

class TEster{
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.display();
        list.insertLast(0);
        list.insertLast(6);
        list.insertLast(7);
        list.display();
        list.insert(99, 2);
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        System.out.println(list.delete(4)); // printed deleted value(form return).
        list.display();
        list.find(0);




    }
}
