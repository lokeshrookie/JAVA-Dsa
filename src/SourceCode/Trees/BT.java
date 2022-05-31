package SourceCode.Trees;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeCellRenderer;
import javax.xml.crypto.Data;
import java.util.stream.Stream;

class Tester{
//    public static void main(String[] args) {
//        BT t =  new BT();
////        BT.TreeNode
//
//    }
}

public class BT {
//    private  int size;
    private  TreeNode root;

    public static void main(String[] args) {
        BT t = new BT();
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        a.left = b;
        a.right = c;
        b.left =  d;
        b.right = e;
        d.left = f;

        t.display(a );



    }



    //insertion
    public void insert(int value){
        TreeNode node = new TreeNode(value);

    }
    //deletion

    //searching

    //traversal
    public void display(TreeNode root){
       if(root == null){
           return;
       }
        System.out.print(root.data + " ");

        display(root.left);
       display(root.right);
    }




    //height

    //size

    //LCA

    //maxSumLevel





    //

    //Preorder

    //Post Order

    //In Order

    //level order




     static class TreeNode{
         int data;
         TreeNode left;
         TreeNode right;

        public TreeNode(){

        }

        public TreeNode(int value){
            this.data = value;
            this.right = null;
            this.left = null;
        }

        public void setData(int value){
            this.data = value;
        }
        public int getData(){
            return this.data;
        }
        public void setRight(TreeNode right){
            this.right = right;
        }
        public TreeNode getRight(){
            return this.right;
        }
        public TreeNode getLeft(){
            return  this.left;
        }
        public void setLeft(TreeNode left){
            this.left = left;
        }

    }
}
