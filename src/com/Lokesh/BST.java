package com.Lokesh;

import com.sun.source.tree.Tree;

public class BST {


    //INSERT METHOD
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


