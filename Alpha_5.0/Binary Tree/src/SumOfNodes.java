import Impl.BinaryTree;
import Node.Node;

public class SumOfNodes {

    private static int nodeSum(Node root) {

        if(root == null){
            return 0;
        }


        //right subtree
        int rightSum = nodeSum(root.right);
        //left subtree
        int leftSum = nodeSum(root.left);

        return rightSum+leftSum+root.data;  //root.data to consider the current node

    }


    public static void main(String[] args) {
        int[] nums = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();

        tree.preorderBuild(nums);

        int sum = nodeSum(tree.root);
        System.out.println(sum);
    }
}
