package javacode;
import java.util.Arrays;


public class JumpGame {
	public boolean canJump(int[] A) {
        if(A.length < 2)    return true;
        if(A[0] == 0)   return false;
        //if(A[0] >= A.length)    return true;
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
	
	public int jump(int[] A) {
        if(A == null || A.length < 2)
            return 0;
        int[] step = new int[A.length];
        step[0] = 0;
        for(int i = 1; i < A.length; i ++){
            int min = Integer.MAX_VALUE;
            for(int j = i - 1; j >= 0; j --){
                if(A[j] >= i - j && step[j] < min){
                    min = step[j];
                }
            }
            step[i] = min + 1;
        }
        return step[A.length - 1];
    }
}
