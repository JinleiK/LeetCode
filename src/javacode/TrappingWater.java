package javacode;

public class TrappingWater {
	public int trap(int[] A) {
        if(A == null || A.length < 3)   
        return 0;
        
        int[] left = new int[A.length];
        int[] right = new int[A.length];
        int trapping = 0;
        int max = A[0];
        left[0] = max;
        for(int i = 1; i < A.length; i ++){
            if(A[i] > max){
                max = A[i];
            } 
            left[i] = max;
        }
        
        max = A[A.length - 1];
        right[A.length - 1] = max;
        for(int j = A.length - 1; j > 0; j --){
            if(A[j] > max)
                max = A[j];
            right[j] = max;
            trapping += Math.min(left[j], right[j]) - A[j];
        }
        
        return trapping;
    }
}
