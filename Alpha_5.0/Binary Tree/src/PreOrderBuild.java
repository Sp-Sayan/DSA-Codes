import Impl.BinaryTree;
import Node.Node;

public class PreOrderBuild {

    public static void main(String[] args) {
        int[] nums = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();

        tree.preorderBuild(nums);

        /*
        PREORDER
         */
        System.out.println(tree.root.left.left.data);   //prints 4
        tree.preorderTraversal(tree.root);

        System.out.println();
        /*
        INORDER
         */
        tree.inorderTraversal(tree.root);

        System.out.println();

        /*
        POSTORDER
         */
        tree.postorderTraversal(tree.root);

        System.out.println();

        /*
        LEVELORDER
         */
        tree.levelOrderTraversal(tree.root);

    }


}
