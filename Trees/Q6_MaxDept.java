package Trees;

public class Q6_MaxDept {

    
    if(root == null) return 0;
    // Hypothesis
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);
    // Induction
    return Math.max(left, right) + 1;
}
