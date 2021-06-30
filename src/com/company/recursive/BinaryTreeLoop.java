package com.company.recursive;

/**
 * 이진 트리 순회(DFS : Depth-First Search)
 *
 *    5
 *  3   1
 * 2 7 4 9
 *
 * 전위 순회(PreOrder) : 5 3 2 7 1 4 9
 * 중위 순회(InOrder) : 2 3 7 5 4 1 9
 * 후위 순회(PostOrder) : 2 7 3 4 9 1 5
 */
class BinaryTree{
    public BinaryTree right;
    public BinaryTree left;
    public int value;

    public BinaryTree(int value){
        this.left = null;
        this.right = null;
        this.value = value;
    }

    public BinaryTree(BinaryTree left, BinaryTree right, int value){
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public BinaryTree(){}
}

public class BinaryTreeLoop {

    public static void preOrder(BinaryTree root){
        if(root == null) return;

        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(BinaryTree root){
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }

    public static void postOrder(BinaryTree root){
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(5);
        root.left = new BinaryTree(new BinaryTree(2), new BinaryTree(7),3);
        root.right = new BinaryTree(new BinaryTree(4), new BinaryTree(9),1);

        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);

    }


}
