package SourceCode.AdvancedDataStructures.Trees;

public class BinaryTree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);

        a.right = b;
        a.left = c;


        /*
                a
              /   \
             b     c
            / \   / \
           d   e f   g
         */


//        lombok.val a1 = a;
        System.out.println(a.val);
        System.out.println(a.right.val);
        System.out.println(a.left.val);




    }

}

class Node{
      int val;
       Node right;
       Node left;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

}



