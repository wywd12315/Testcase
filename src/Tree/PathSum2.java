package Tree;

import java.util.List;
import java.util.LinkedList;

public class PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer>sumPerPath = new LinkedList<>();
        List<List<Integer>> tmp = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        if(root==null) return res;
        if((root.left==null)&&(root.right==null)) {
        	if(root.val==sum) {
        		sumPerPath.add(root.val);
        		res.add(sumPerPath);
        	}
        }
       if(root.left!=null) {
    	   tmp=pathSum(root.left, sum-root.val);
    	   for(int i=0; i<tmp.size();i++) {
    		   sumPerPath=tmp.remove(i);
    		   sumPerPath.add(0, root.val);
    		   tmp.add(i,sumPerPath);
    	   }
    	   res.addAll(tmp);
       }
       if(root.right!=null) {
    	   tmp=pathSum(root.right, sum-root.val);
    	   for(int i=0; i<tmp.size();i++) {
    		   sumPerPath=tmp.remove(i);
    		   sumPerPath.add(0, root.val);
    		   tmp.add(i,sumPerPath);
    	   }
    	   res.addAll(tmp);
       }
       return res;
    }
}
