package binaryTree;

//1. creation of Binary tree
//2. tree traversal techniques ---> Inorder, preorder, postorder
//3. Check if binary tree is full BT or not

public class BinaryTreeCreation {

    public static TreeNode creation(){
        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(5);

        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n4;

        return root;
    }


//    left root right
    private static void inOrder(TreeNode root){
        if(root == null)
            return;

        inOrder(root.left); //left
        System.out.println(root.data); //root
        inOrder(root.right); //right
    }


//    root left right
    private static void preOrder(TreeNode root){
        if(root == null)
            return;

        System.out.println(root.data); // root
        preOrder(root.left); //left
        preOrder(root.right); //right
    }


//    left right root
    private static void postOrder(TreeNode root){
        if(root == null)
            return;

        postOrder(root.left); //left
        postOrder(root.right); //right
        System.out.println(root.data); //root
    }

    private static boolean isFullBinaryTree(TreeNode root){
        if(root == null)
            return true;

        //leaf node
        if(root.left == null && root.right == null)
            return true;

        //internal node
        return (root.left != null && root.right != null && isFullBinaryTree(root.left) && isFullBinaryTree(root.right));
    }

    public static void main(String[] args) {
        TreeNode root = creation();

        System.out.println("InOrder Traversal:- ");
        inOrder(root);
        System.out.println("PreOrder Traversal:- ");
        preOrder(root);
        System.out.println("PostOrder Traversal:- ");
        postOrder(root);

        System.out.println("is Binary Tree Full? " + isFullBinaryTree(root));

    }
}
