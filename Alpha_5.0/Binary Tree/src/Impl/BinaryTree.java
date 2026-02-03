package Impl;

import Node.Node;

import java.util.LinkedList;
import java.util.Queue;


public class BinaryTree {
    public Node root;
    private int idx = -1;

    public BinaryTree() {
    }

    /*
    PREORDER
     */

    public Node preorderBuild(int[] nums) {

        //increment idx
        idx++;

        if(idx == nums.length || nums[idx] == -1)
            return null;

        //root
        Node newNode = new Node(nums[idx]);
        if(idx == 0)
            root = newNode;
        //left
        newNode.left = preorderBuild(nums);
        //right
        newNode.right = preorderBuild(nums);

        return newNode;
    }

    public void preorderTraversal(Node ptr){

        if(ptr == null){
            System.out.print("null ");
            return;
        }

        //root
        System.out.print(ptr.data + " ");
        //left
        preorderTraversal(ptr.left);
        //right
        preorderTraversal(ptr.right);
    }

    /*
    INORDER
     */

    public void inorderTraversal(Node ptr){

        if(ptr == null){
            System.out.print("null ");
            return;
        }
        //left
        inorderTraversal(ptr.left);
        //root
        System.out.print(ptr.data + " ");
        //right
        inorderTraversal(ptr.right);


    }/*
    POSTORDER
     */

    public void postorderTraversal(Node ptr){

        if(ptr == null){
            System.out.print("null ");
            return;
        }
        //left
        postorderTraversal(ptr.left);
        //right
        postorderTraversal(ptr.right);
        //root
        System.out.print(ptr.data + " ");

    }

    /*
    LEVELORDER
     */
    public void levelOrderTraversal(Node root){
        if(root == null)
            return;

        Queue<Node> q = new LinkedList<>();

        //add root
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){

            Node newNode = q.remove();

            //print the current node
            if(newNode != null) {
                System.out.print(newNode.data + " ");

                //add children
                if(newNode.left != null)
                    q.add(newNode.left);
                if(newNode.right != null)
                    q.add(newNode.right);

            }
            else {
                System.out.println();

                if(q.isEmpty())
                    break;
                else
                    q.add(null);    //indicates end of level


            }
        }

    }
}
