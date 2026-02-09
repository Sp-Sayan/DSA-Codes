/*
https://leetcode.com/problems/symmetric-tree/
 */

import Node.Node;

public class SymmetricTree {
    public boolean isSymmetric(Node root) {

        //System.out.println(checkSymmetric(root.left, root.right));

        return checkSymmetric(root.left, root.right);
    }

    private boolean checkSymmetric(Node leftSubtree, Node rightSubtree){

        //if both null then still symmetric
        if(leftSubtree == null && rightSubtree == null)
            return true;

        //if any one null
        if((leftSubtree == null && rightSubtree != null) || (leftSubtree != null && rightSubtree == null))
            return false;

        boolean left = false, right = false;

        /*
            symmetric tree here means a mirror tree i.e., for every subtree the root remains the same, and the child becomes the mirror image
            which means leftSubtree.left = rightSubtree.right (values only not address)

         */

        //check current node (both should be not null and have same value)
        if(leftSubtree != null && rightSubtree != null && leftSubtree.val == rightSubtree.val){
            //left of leftsubtree and right of rightSubtree
            left = checkSymmetric(leftSubtree.left, rightSubtree.right);

            //right of leftsubtree and left of rightSubtree
            right = checkSymmetric(leftSubtree.right, rightSubtree.left);
        }

        return left && right;

    }
}
