package com.company.recursive;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 이진 트리 순회(DFS : Depth-First Search)
 *
 *    5
 *  3   1
 * 2 7 4 9
 *
 * 전위 순회(PreOrder)                                 : 1 2 4 5 3 6 7
 * 중위 순회(InOrder)                                  : 4 2 5 1 6 3 7
 * 후위 순회(PostOrder)                                : 4 5 2 6 7 3 1
 * 넓이 우선 탐색(BFS : Breadth-First Search)           : 1 2 3 4 5 6 7(레벨탐색)
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

    public static void bfs(BinaryTree root){
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            BinaryTree tmp = queue.poll();
            System.out.print(tmp.value + " ");
            if(tmp.left != null) queue.offer(tmp.left);
            if(tmp.right != null) queue.offer(tmp.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(new BinaryTree(4), new BinaryTree(5),2);
        root.right = new BinaryTree(new BinaryTree(6), new BinaryTree(7),3);

        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        bfs(root);

    }


}
