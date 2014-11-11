package javacode;

public class RemoveDup {
	public int removeDuplicates(int[] A) {
        int len = A.length;
        if(len < 3){
            return len;
        }
        int[] B = new int[len];
        int newL = len;
        int cnt = 1;
        B[0] = A[0];
        int j = 1;
        for(int i = 1; i < len; i ++){
            if(A[i] == A[i - 1]){
                cnt ++;
            } else{
                cnt = 1;
            }
            if(cnt <= 2){
                B[j] = A[i];
                j ++;
            } else{
                newL --;
            }
        }
        for(int i = 0; i < newL; i ++){
            A[i] = B[i];
        }
        return newL;
    }
}
