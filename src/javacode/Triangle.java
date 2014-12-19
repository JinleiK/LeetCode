package javacode;

import java.util.List;

public class Triangle {
	// O(n) space
	public int minimumTotalN(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size() == 0)
            return 0;
        int[] dp = new int[triangle.size()];
        
        for(int i = 0; i < triangle.size(); i ++)
            dp[i] = triangle.get(triangle.size() - 1).get(i);
        
        for(int i = triangle.size() - 2; i >= 0; i --){
            for(int j = 0; j < i + 1; j ++){
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }
        
        return dp[0];
    }
	
	// O(1) space
	public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size() == 0)
            return 0;
        for(int i = triangle.size() - 2; i >= 0; i --){
            for(int j = 0; j < i + 1; j ++){
                int left = triangle.get(i + 1).get(j);
                int right = triangle.get(i + 1).get(j + 1);
                int cur = triangle.get(i).get(j);
                triangle.get(i).set(j, Math.min(left, right) + cur);
            }
        }
        
        return triangle.get(0).get(0);
    }
	
}
