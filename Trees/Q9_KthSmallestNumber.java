package Trees;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Q9_KthSmallestNumber {
     public int kthSmallest(TreeNode root, int k) {
         ArrayList<Integer> res = new ArrayList<>();
         inOrder(root, res);
          return res.get(k-1);

    }
     public void inOrder(TreeNode root, List<Integer> res){
        if(root==null) return;
        inOrder(root.left, res);
        res.add(root.val);
        inOrder(root.right, res);
    }
}
