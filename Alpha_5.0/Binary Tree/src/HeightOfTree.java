import Impl.BinaryTree;
import Node.Node;

public class HeightOfTree {


    public static int heightCalc(Node root, int height){
        if(root == null){
            return height;
        }

        int leftSubtreeHeight = heightCalc(root.left, height+1);
        int rightSubtreeHeight = heightCalc(root.right, height+1);

        return Math.max(leftSubtreeHeight,rightSubtreeHeight);
    }


    public static void main(String[] args) {

        int[] nums = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();

        tree.preorderBuild(nums);

        int height = heightCalc(tree.root, 0);
        System.out.println(height);

    }
}
