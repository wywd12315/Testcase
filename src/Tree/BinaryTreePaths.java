package Tree;
import java.util.List;
import java.util.LinkedList;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new LinkedList<String>();
        TreeNode temp=root;
        if(temp!=null) {
        	String path = "";
        	List<String> t = new LinkedList<String>();
        	t.clear();
        	if(temp.left!=null) {
        	//every item in the last results should be appended with temp.val + "->" AT FRONT, not the only one String
        	t=binaryTreePaths(temp.left);
        		for(int i=0;i<t.size();i++) {
        			path=String.valueOf(temp.val)+"->"+t.get(i);
        			res.add(path);}
        	}
        	if(temp.right!=null) {
            	t=binaryTreePaths(temp.right);
        		for(int i=0;i<t.size();i++) {
        			path=String.valueOf(temp.val)+"->"+t.get(i);
        			res.add(path);}
        	}
        	if((temp.left==null)&&(temp.right==null)) {
        	path=String.valueOf(temp.val);
        	res.add(path);
        	}
        }
        return res;
    }
}
