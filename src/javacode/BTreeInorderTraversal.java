package javacode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import util.TreeNode;


public class BTreeInorderTraversal {
	
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root == null)
            return result;
        
        Stack<TreeNode> s = new Stack<TreeNode>();
        List<TreeNode> visited = new ArrayList<TreeNode>();
        s.push(root);
        while(!s.isEmpty()){
            
            TreeNode cur = s.peek();
            if(cur.left != null && !visited.contains(cur.left))
                s.push(cur.left);
            else{
                result.add(cur.val);
                //System.out.println(cur.val);
                s.pop();
                //System.out.println(s.size());
                visited.add(cur);
                if(cur.right != null)  
                    s.push(cur.right);
            }
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		one.left = two;
		BTreeInorderTraversal it = new BTreeInorderTraversal();
		List<Integer>  re = it.inorderTraversal(one);
		for(int r : re){
			System.out.println(r);
		}
	}

}
