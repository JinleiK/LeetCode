package javacode;

public class MaximumSubarray {
	public int maxSubArrayDP(int[] A) {
        if(A == null || A.length == 0)
            return 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        // all negative
        for(int a : A)
            maxSum = Math.max(maxSum, a);
        if(maxSum < 0)
            return maxSum;
        maxSum = Integer.MIN_VALUE;
        for(int a : A){
            sum += a;
            if(sum < 0)
                sum = 0;
            if(sum > maxSum)
                maxSum = sum;
        }
        return maxSum;
    }
	
	public int maxSubArrayDC(int[] A) {
        if(A == null || A.length == 0)
            return 0;
        return maxSubArray(A, 0, A.length - 1);
    }
    
    public int maxSubArray(int[] A, int low, int high){
        if(low >= high)
            return A[low];
        int mid = (high - low) / 2 + low;
        int left = maxSubArray(A, low, mid - 1);
        int right = maxSubArray(A, mid + 1, high);
        int max = A[mid];
        int sum = max;
        for(int i = mid - 1; i >= low; i --){
            sum += A[i];
            if(sum > max)
                 max = sum;
        }
        sum = max;
        for(int i = mid + 1; i <= high; i ++){
            sum += A[i];
            if(sum > max)
                max = sum;
        }
        return Math.max(max, Math.max(left, right));
    }
}
