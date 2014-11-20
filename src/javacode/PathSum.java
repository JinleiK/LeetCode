package javacode;

import java.util.LinkedList;

import util.TreeNode;

public class PathSum {
	public boolean hasPathSumRec(TreeNode root, int sum) {
        if(root == null)
            return false;
        if(root.val == sum && root.left == null && root.right == null)
            return true;
        return hasPathSumRec(root.left, sum - root.val) || hasPathSumRec(root.right, sum - root.val);
    }
	
	public boolean hasPathSumBFS(TreeNode root, int sum) {
        if(root == null)
            return false;
        LinkedList<TreeNode> nodes = new LinkedList<TreeNode>();
        LinkedList<Integer> sums = new LinkedList<Integer>();
        nodes.add(root);
        sums.add(root.val);
        while(!nodes.isEmpty()){
            TreeNode node = nodes.poll();
            int num = sums.poll();
            if(num == sum && node.left == null && node.right == null)
                return true;
            if(node.left != null){
                nodes.add(node.left);
                sums.add(num + node.left.val);
            }
            if(node.right != null){
                nodes.add(node.right);
                sums.add(num + node.right.val);
            }
        }
        return false;
    }
	
	public boolean hasPathSumDFS(TreeNode root, int sum) {
        if(root == null)
            return false;
        LinkedList<TreeNode> nodes = new LinkedList<TreeNode>();
        LinkedList<Integer> sums = new LinkedList<Integer>();
        nodes.push(root);
        sums.push(root.val);
        while(!nodes.isEmpty()){
            TreeNode node = nodes.pop();
            int num = sums.pop();
            if(num == sum && node.left == null && node.right == null)
                return true;
            if(node.right != null){/////////////
                nodes.push(node.right);
                sums.push(num + node.right.val);
            }
            if(node.left != null){
                nodes.push(node.left);
                sums.push(num + node.left.val);
            }
        }
        return false;
    }
}
