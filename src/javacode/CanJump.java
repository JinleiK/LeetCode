package javacode;

import java.util.Arrays;

public class CanJump {
	public boolean canJumpDP(int[] A) {
        if(A.length < 2)    return true;
        if(A[0] == 0)   return false;
        boolean[] can = new boolean[A.length];
        Arrays.fill(can, false);
        can[0] = true;
        for(int i = 1; i < A.length; i ++){
            for(int j = i - 1; j >= 0; j --){
                can[i] = can[i] || (can[j] && (A[j] >= i - j));
                if(can[i])    
                    break;
            }
        }
        return can[A.length - 1];
    }
	
	public boolean canJumpGreedy(int[] A) {
        if(A == null || A.length < 2)
            return true;
        int reach = 0;
        for(int i = 0; i < A.length - 1 && i <= reach; i ++){
            reach = Math.max(A[i] + i, reach);
        }
        return reach >= A.length - 1;
    }
}
