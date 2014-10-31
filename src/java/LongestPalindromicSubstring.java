package java;

public class LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
        if(s == null || s.length() < 2)
            return s;
        
        int n = s.length();
        String palin = "";
        int[][] p = new int[n][n];
        for(int i = 0; i < n; i ++){
            p[i][i] = 1;
            if(i > 0 &&s.charAt(i) == s.charAt(i - 1))
                p[i - 1][i] = i;
        }
        for(int len = 2; len <= n; len ++){
            for(int i = 0; i < n - len; i ++){
                int j = i + len;
                if(s.charAt(i) == s.charAt(j) && p[i + 1][j - 1] == 1){
                    p[i][j] = 1;
                    palin = s.substring(i, j + 1);
                }
            }
        }
        return palin;
    }
}
