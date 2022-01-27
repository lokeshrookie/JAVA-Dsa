package SourceCode.AdvancedDataStructures.Trees;

/**
 * Inorder : Left, Root, Right,
 * Preorder : Root, Left, Right
 * Postorder : Left, Right, Root
 */
public class BTImplementation {
    public static void main(String[] args) {
        BTTraversal t = new BTTraversal();
        t.root = new BTNode('A');
        t.root.right= new BTNode('B');
        t.root.left = new BTNode('C');
        t.root.right.right = new BTNode('D');
        t.root.right.left = new BTNode('E');
        t.root.left.right = new BTNode('F');
        t.root.left.left = new BTNode('G');
        System.out.println("PostOrder is : ");
        t.postOrder(t.root);
        System.out.println("PreOder is : " );
        t.preOrder(t.root);
        System.out.println("InOrder is : ");
        t.inOrder(t.root);


    }
}
class BTTraversal {
    BTNode root;
    void preOrder(BTNode node){ // here we pass root node
        if(node!=null){
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    void postOrder(BTNode node){
        if(node != null){
            postOrder(node.left );
            postOrder(node.right);
            System.out.print(node.key + " ");

        }
    }

    void inOrder(BTNode node){
        if(node != null){
            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);
        }
    }
}


class BTNode{
    char key;
    BTNode left;
    BTNode right;
    public BTNode(char key) {
        this.key = key;
    }
}

