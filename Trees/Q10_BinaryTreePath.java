package Trees;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Q10_BinaryTreePath {
     public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<String>();
        if(root!=null){
            searchBT(root,"",ans);
        }
        return ans;
    }
    public void searchBT(TreeNode root,String path,List<String> ans){
        if(root.left==null && root.right==null){
            ans.add(path+root.val);

        }
        if(root.left!=null){
            searchBT(root.left,path+root.val+"->",ans);
        }
        if(root.right!=null){
            searchBT(root.right,path+root.val+"->",ans);
        }
    }
}
