package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
    	if((root==null)||((root.left==null)&&(root.right==null))) return root;
    	Stack<TreeNode> stack = new Stack<>();
    	stack.push(root);
    	
    	while(!stack.isEmpty()) {
        TreeNode myTree = stack.pop();
        	if(myTree!=null) {
        		TreeNode left=myTree.left;
        		TreeNode right=myTree.right;
        		myTree.left=right;
        		myTree.right=left;
        	if(myTree.right!=null) stack.push(myTree.right);
        	if(myTree.left!=null) stack.push(myTree.left);
        	}
    	}
    	return root;
    }
}
