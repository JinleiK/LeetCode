package java;

public class MaximumProductSubarray {
	public int maxProduct(int[] A) {
        if(A == null || A.length == 0)
            return 0;
        int n = A.length;
        int[][] m = new int[n][n];
        int maxPro = Integer.MIN_VALUE;
        for(int i = 0; i < n; i ++){
            m[i][i] = A[i];
            for(int j = i + 1; j < n; j ++){
                m[i][j] = m[i][j - 1] * A[j];
                maxPro = Math.max(maxPro, m[i][j]);
            }
        }
        return maxPro;
    }
	
	public int maxProduct2(int[] A) {
        if(A == null || A.length == 0)
            return 0;
        int curMax = A[0];
        int curMin = A[0];
        int maxPro = A[0];
        for(int i = 1; i < A.length; i ++){
            int tempMax = curMax * A[i];
            int tempMin = curMin * A[i];
            curMax = Math.max(Math.max(tempMax, A[i]), tempMin);
            curMin = Math.min(Math.min(tempMin, A[i]), tempMax);
            maxPro = Math.max(maxPro, curMax);
        }
        return maxPro;
    }
}
