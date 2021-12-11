import com.sun.source.tree.Tree;

import java.util.Scanner;

public class BST {

    public  class TreeNode{
        private  int data;
        private TreeNode left;
        private TreeNode right;

        TreeNode(int data){
            this.data = data;
            this.left = this.right =  null;
        }
    }
    TreeNode root;

    BST(){
        this.root = null;
    }

    public void delete(TreeNode root, int data){

    }


    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }

    public TreeNode search(TreeNode root, int dataToBeSearched){
        if(root == null || root.data == dataToBeSearched){
            return root;
        }
        if(root.data < dataToBeSearched){
            return search(root.right, dataToBeSearched);
        }
        else{
            return  search(root.left, dataToBeSearched);
        }
    }

    public TreeNode insert( TreeNode root,int newData){
        if(root == null){
            root = new TreeNode(newData);
            return root;
        }
        if(root.data < newData){
            root.right = insert(root.right, newData);
        }
        else if(root.data > newData){
            root.left =  insert(root.left , newData);
        }
        return root;
    }


    //wrapper methods
    public void insertToTree(int data){
        root = insert(root, data);
    }
    public TreeNode searchInTree(int data){
        return search(root, data);
    }
    public void inOrderTraversal(){
        inOrder(root);
    }
}

class Test{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BST bst = new BST();
        bst.insertToTree(5);
        bst.insertToTree(6);
        bst.insertToTree(7);
        int search = s.nextInt();
        if(bst.searchInTree(search) != null){
            System.out.println("Number found");
        }
        else{
            System.out.println("Number not found");
        }
        bst.inOrderTraversal();
    }

}




















