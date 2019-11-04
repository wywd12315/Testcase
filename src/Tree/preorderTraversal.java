package Tree;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class preorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
    	List<Integer> ret = new LinkedList<>();
    	if(root==null) return ret;
    	Stack<TreeNode> stack = new Stack<>();
    	stack.push(root);
    	
    	while(!stack.isEmpty()) {
        TreeNode myTree = stack.pop();
        	if(myTree!=null) {
        	ret.add(myTree.val);
        	if(myTree.right!=null) stack.push(myTree.right);
        	if(myTree.left!=null) stack.push(myTree.left);
        	}
    	}
    	return ret;
    }
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	/**
    	List<Integer> rootlist = new LinkedList<>();
    	if(root==null) return rootlist;
    	List<Integer> leftlist = preorderTraversal(root.left);
    	List<Integer> rightlist = preorderTraversal(root.right);
    	rootlist.add(root.val);
    	rootlist.addAll(leftlist);
    	rootlist.addAll(rightlist);
    	return rootlist;
    	**/
}
