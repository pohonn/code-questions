import Sample.TreeNode;

public class MaximumDepthBinaryTree {

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int depthLeft = maxDepth(root.left);
        int depthRight = maxDepth(root.right);

        return Math.max(depthLeft, depthRight) + 1;

    }

}
