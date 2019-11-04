package Tree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root){	
    	List<Integer> rootlist = new LinkedList<>();
    	if(root==null) return rootlist;
    	List<Integer> leftlist = inorderTraversal(root.left);
    	List<Integer> rightlist = inorderTraversal(root.right);
    	rootlist.addAll(leftlist);
    	rootlist.add(root.val);
    	rootlist.addAll(rightlist);
    	return rootlist;
    }
}
