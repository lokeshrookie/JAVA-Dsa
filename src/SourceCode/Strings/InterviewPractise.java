package SourceCode.Strings;


class Stack{
    private int top = -1;
    private int[] arr;
    private int capacity;

    public Stack(int size) {
        this.capacity = size;
        arr = new int[capacity];
    }

    public int push(int data){
        if(isFull()){
            throw new RuntimeException("Stack is full");
        }
        top++;
        arr[top] = data;
        return arr[top];
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        else{
            int temp = arr[top]; // preserving top value in temp to return
            top--; // removing top element;
            return temp;
        }
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack if full ");
        }
        else{
            return arr[top];
        }
    }


    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if(top == arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }

    public void display(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        else{
            int temp = arr[top];
            for(int i = 0; i<top; i++){
                System.out.print(arr[i] + "  ");
            }
        }
    }
}







public class InterviewPractise {
    public static void main(String[] args) {
//        skipChar("hello", 'l');
//        dup("hello");

        Stack stack = new Stack(6);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.display();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
    }
    //skip character
    static void skipChar(String s , char c){
        String ans = "";
        for(int i = 0;i<s.length();i++){
            if(!(s.charAt(i) == c)){
                ans = ans + s.charAt(i);
            }
        }
        System.out.println(ans);
    }
    //String uniques and duplicates
    static void dup(String s){
        String uniques = "";
        String dup = "";
        for(int i = 0; i<s.length(); i++){
            if(!uniques.contains(Character.toString(s.charAt(i)))){
                uniques = uniques + s.charAt(i);
            }
            else
                dup = dup + s.charAt(i);
        }
        System.out.println("Uniques : " + uniques);
        System.out.println("Duplicates : " + dup);
    }
}
