package javacode;

public class FirstMissingPositive {
	public int firstMissingPositive(int[] A) {
//		if(A.length == 1 && A[0] != 1)
//            return 1;
        int i = 0;
        while(i < A.length){
        	System.out.println(A[i]);
            if(A[i] > 0 && A[i] <= A.length && A[i] != A[A[i] - 1]){
                    int temp = A[A[i] - 1];
                    A[A[i] - 1] = A[i];
                    A[i] = temp;
            } else  i ++;
        }
        for(int j = 0; j < A.length; j ++){
            if(A[j] != j + 1)
                return j + 1;
        }
        return A.length + 1;
    }
}
