package javacode;

public class SortColors {
	public void sortColors(int[] A) {
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
	
	public static void main(String[] args){
		SortColors sc = new SortColors();
		int[] A = {2,1,2,1,0,0,1,2,2,0,0,1};
		sc.sortColors(A);
		for(int a : A)
			System.out.println(a);
	}
}
