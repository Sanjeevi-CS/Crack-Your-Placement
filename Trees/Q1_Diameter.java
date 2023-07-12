package Trees;

import javax.swing.tree.TreeNode;

public class Q1_Diameter {
    public int count(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(count(root.left), count(root.right)) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(count(root.left) + count(root.right),
                Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)));
    }
}
