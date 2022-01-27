public class LL {
    private  int size;
    private Node head;
    private Node tail;

    public  class Node{
        private int value;
        private Node next;
        Node(){
            this.value = 0;
            this.next = null;
        }
        Node(int value){
            this.value = value;
            this.next = null;
        }
        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void addFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void addLast(int value){
        if(size == 0){
            addFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;

    }

//    public  void insert(int value, int index){
//        if(index == 0){
//            addLast(value);
//            return;
//        }
//        if(index == size){
//            addLast(value);
//        }
//        Node temp = head;
//        for(int i = 1; i<index; i++){
//            temp = temp.next;
//        }
//        Node node = new Node(value, temp.next);
//        temp.next = node;
//        size++;
//    }
//
    public void insert(int value, int index){
        if(index == 0){
            addFirst(value);
            return;
        }
        if(index == size){
            addLast(value);
            return;
        }
        Node temp = head;
        for(int i = 1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int temp = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return temp;
    }

    public int deleteLast(){
        if(size <=1 ){
            deleteFirst();
        }
//        int var = tail.value;
//        Node temp = head;
//        for(int i = 1; i<size-1;i++){
//            temp = temp.next;
//        }
//        tail = temp;
//        tail.next = null;
//        return  var;
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }
    public void display(){
        Node temp = head;
        for(int i = 1; i<=size; i++){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private Node get(int index) {
        Node temp = head;
        for(int i = 1; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    LL(){
        this.size = 0;
    }
}


 class LLClient{
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(5);
        list.addLast(6);
        list.display();
    }
}