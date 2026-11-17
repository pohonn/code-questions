// import javax.swing.tree.TreeNode;

import Sample.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return false;

        } else if (p == null || q == null || p.val != p.val) {
            return false;
        } else {
            return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
        }

    }
}
