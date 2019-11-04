package Tree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
    	List<Integer> rootlist = new LinkedList<>();
    	if(root==null) return rootlist;
    	List<Integer> leftlist = postorderTraversal(root.left);
    	List<Integer> rightlist = postorderTraversal(root.right);
    	rootlist.addAll(leftlist);
    	rootlist.addAll(rightlist);
    	rootlist.add(root.val);
    	return rootlist;
    }
}
