package javacode;

public class DistinctSubsequences {
	public int numDistinct(String S, String T) {
        if(S == null || T == null){
            return 0;
        }
        int n = S.length();
        int m =T.length();
        int[][] matrix = new int[m][n];
        int num = 0;
        for(int i = 0; i < n; i ++){
            if(S.charAt(i) == T.charAt(0)){
                num ++;
                matrix[0][i] = num;
            }
        }
        for(int i = 1; i < m; i ++){
            num = 0;
            for(int j = i; j < n; j ++){
                if(T.charAt(i) == S.charAt(j)){
                    for(int k = j - 1; k >= i - 1; k --){
                        if(matrix[i - 1][k] > 0){
                            num += matrix[i - 1][k];
                            break;
                        }
                    }
                    matrix[i][j] = num;
                }
            }
        }
        return num;
    }
}
