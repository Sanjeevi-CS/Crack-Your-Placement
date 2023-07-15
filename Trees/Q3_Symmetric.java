// package Trees;

import javax.swing.tree.TreeNode;

public class Q3_Symmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        return isIdentical(root.right, root.left);
    }

    public boolean isIdentical(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.val == node2.val && isIdentical(node1.left, node2.right) && isIdentical(node1.right, node2.left);
    }
}
