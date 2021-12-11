package com.Lokesh;

import com.sun.source.tree.Tree;

import java.util.Scanner;

public class BST {




//    INSERT METHOD
    public TreeNode insert(TreeNode root, int newData){
        //check if the root is null. if yes, then create root node with this data. This will be the first element in the tree.
        if(root == null){
            root = new TreeNode(newData);
            return root;
        }
        //if the value of data is smaller than that of the root node,
        // then we have to insert that particular node as left child of the root node.
        if(root.data > newData){
            root.left = insert(root.left, newData);
        }
        // if newData is greather than the value of root node, then insert that particular node as right child of the root node.
        else if(root.data < newData){
            root.right = insert(root.right, newData);
        }
        // to add the new data as left or right child of the root node,  we call the insert method recursively.
        // As every left and right TreeNode is null. The first if statement will be executed to insert the data at the particular TreeNode.
        // then we weill return the root. The root is the Tree where we have inserted the newData.
        return root;
    }



    //SEARCH
    public TreeNode search(TreeNode root, int dataToSearch){
        // If the root is null, we dont need to check further. so return root.
        // Also if the data of the root is matched with the dataToSearch, then return root.
        if(root == null || root.data == dataToSearch){
            return root;
        }
        // if the dataToSearch is smaller than the data of root, then search in the left side of the BST.
        // this will search for the data recursively.
        if(root.data > dataToSearch){
            return search(root.left, dataToSearch);
        }// if not, search in the right side of the BST.
        else{
            return search(root.right, dataToSearch);
        }
    }

    //TRAVERSAL METHODS.
    //INORDER TRAVERSAL: left, root, right
    public void inOrder(TreeNode root){
        // if root is null, there is nothing to traverse. so return null
        if(root == null){
            return;
        }
        inOrder(root.left);  // this will recursively visit all nodes in the left subTree.
        // after traversing the left subtree, we have to visit root.
        System.out.print(root.data + " ");
        // this will recursively visit all node nodes in the right subtree.
        inOrder(root.right);
    }

    //PREORDER TRAVERSAL : root, left, right
    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //POSTORDER TRAVERSAL : left, right, root
    public void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }




    //WRAPPER METHODS: ( A wrapper method is an adapter. it provides an alternative interface for an existing method.).
    //wrapper method are used to make the program simple for the user.
    // IT ENHANCES THE READABILITY OF THE PROGRAM. IF ANYONE LOOKS AT THE PROGRAM, HE WILL UNDERSTAND THE FLOW OF THE PROGRAM.
    // LIKE FORM HERE WE ARE GOING TO THIS PARTICULAR METHOD.
    public void insertIntoTree(int dataToBeInserted){
        root = insert(root, dataToBeInserted);
    }
    public TreeNode searchTree(int dataToBeSearched){
        return search(root, dataToBeSearched);
    }
    public void inOrderTraversal(){
        inOrder(root);
    }
    public  void preOrderTraversal(){
        preOrder(root);
    }
    public void postOrderTraversal(){
        postOrder(root);
    }





    public class TreeNode{
        // Every TreeNode must have left and right TreeNode. initialize the default value with null.
        private int data;
        private TreeNode left;
        private TreeNode right;
        // constructor
        public TreeNode(int data) {
            this.data = data;
            this.right = this.left = null;
        }
    }
    //Root node for the tree declared in Tree class
    TreeNode root;

    // default constructor with root as null.
    public BST() {
        this.root = null;
    }
}


class Main{
    public static void main(String[] args) {
        BST bst = new BST();
        int n, num, search;
        Scanner s = new Scanner(System.in);
        System.out.println("No of inputs: ");
        n = s.nextInt();
        System.out.println("Enter " + n + " numbers");

        for(int i = 0; i<n; i++){
            num = s.nextInt();
            bst.insertIntoTree(num);
        }
        System.out.println(" Tree insertion is done");

        System.out.println("Enter the nubmer to be searched: ");
        search = s.nextInt();
        if(bst.searchTree(search) != null){
            System.out.println("Number found");
        }
        else{
            System.out.println("Number not found");
        }

        System.out.println("INORDER TRAVERSAL OF THE BST IS : ");
        bst.inOrderTraversal();
        System.out.println("\nPREORDER TRAVERSAL : ");
        bst.preOrderTraversal();
        System.out.println("\nPOSTORDER TRAVERSAL : ");
        bst.postOrderTraversal();

    }
}

