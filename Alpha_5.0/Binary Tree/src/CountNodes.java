import Impl.BinaryTree;
import Node.Node;

public class CountNodes {



    public static void main(String[] args) {
        int[] nums = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();

        tree.preorderBuild(nums);

        int count = nodeCount(tree.root);
        System.out.println(count);
    }

    private static int nodeCount(Node root) {

        if(root == null){
            return 0;
        }


        //right subtree
        int rightCount = nodeCount(root.right);
        //left subtree
        int leftCount = nodeCount(root.left);

        return rightCount+leftCount+1;  //1 to consider the current node

    }
}
