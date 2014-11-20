package javacode;

import java.util.LinkedList;
import java.util.Queue;

import util.TreeNode;

public class SymmetricTree {
	
	public static boolean isSymmetric(TreeNode root) {
        if(root == null || (root.left == null && root.right == null))
            return true;
        if(root.left == null || root.right == null)
            return false;
        Queue<TreeNode> qLeft = new LinkedList<TreeNode>();
        Queue<TreeNode> qRight = new LinkedList<TreeNode>();
        qLeft.add(root.left);
        qRight.add(root.right);
        while(!qLeft.isEmpty() && !qRight.isEmpty()){
        	System.out.println(qLeft.size());
        	System.out.println(qRight.size());
            if(qLeft.size() != qRight.size())
                return false;
            int len = qLeft.size();
            for(int i = 0; i < len; i ++){
                TreeNode l = qLeft.poll();
                TreeNode r = qRight.poll();
                //System.out.println(l.val);
                if(l.val != r.val)
                    return false;
                if(l.left != null)
                    qLeft.add(l.left);
                if(l.right != null)
                    qLeft.add(l.right);
                if(r.right != null)
                    qRight.add(r.right);
                if(r.left != null)
                    qRight.add(r.left);
            }
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(2);
		TreeNode b = new TreeNode(3);
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(4);
		TreeNode e = new TreeNode(5);
		TreeNode f = new TreeNode(5);
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		isSymmetric(a);
	}

}
