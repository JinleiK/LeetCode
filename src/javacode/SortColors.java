package javacode;

public class SortColors {
	// counting sort
	public void sortColorsCS(int[] A) {
        if(A == null || A.length == 0)
            return;
        int[] cm = new int[4];
        for(int a : A)
            cm[a + 1] ++;
        for(int i = 1; i < cm.length; i ++){
            cm[i] += cm[i - 1];
            for(int j = cm[i - 1]; j < cm[i]; j ++)
                A[j] = i - 1;
        }
    }
	
	// two pointers
	public void sortColors(int[] A) {
        if(A == null || A.length == 0)
            return;
        int i = 0;
        int left = 0;
        int right = A.length - 1;
        while(i <= right && left < right){
            if(i > left && A[i] == 0){
                swap(A, i, left);
                left ++;
            } else if(A[i] == 2){
                swap(A, i, right);
                right --;
            } else  i ++;
        }
    }
    
    public void swap(int[] A, int i, int j){
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
	
	public static void main(String[] args){
		SortColors sc = new SortColors();
		int[] A = {0,0};
		sc.sortColors(A);
		for(int a : A)
			System.out.println(a);
	}
}
