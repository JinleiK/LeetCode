package javacode;


public class UniqueBinaryTree {
	public int numTrees(int n) {
		if(n <= 0)	return 0;
		if(n == 1)	return 1;
        int[] nums = new int[n + 1];
        nums[0] = 1;
        nums[1] = 1;
        
        for(int i = 2; i <= n; i ++){
        	for(int j = 0; j < i; j ++){
        		nums[i] += nums[j] * nums[i - j - 1];
        	}
        }
        return nums[n];
     }
}
