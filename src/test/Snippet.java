package test;

public class Snippet {
	public void sortColors(int[] A) {
	        if(A == null || A.length == 0)
	            return;
	        int[] cm = new int[4];
	        for(int a : A)
	            cm[a] ++;
	        for(int i = 1; i < cm.length; i ++){
	            cm[i] += cm[i - 1];
	            for(int j = cm[i - 1]; j < cm[i]; j ++)
	                A[j] = i - 1;
	        }
	    }
}

