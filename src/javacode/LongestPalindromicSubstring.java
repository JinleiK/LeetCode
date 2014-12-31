package javacode;

import java.util.Arrays;

public class LongestPalindromicSubstring {
	// TLE
	public String longestPalindromeDP1(String s) {
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
	
	public String longestPalindromeDP2(String s) {
        // DP
        // dp[j][i] = true (i == j)
        //          = s[i] == s[j] (i - j == 1)
        //          = s[i] == s[j] && dp[j + 1][i - 1]
        if(s == null || s.length() < 2)
            return s;
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        for(int i = 0; i < len; i ++){
            for(int j = 0; j < len && j != i; j ++){
                dp[i][j] = false;
            }
            dp[i][i] = true;
        }
        
        int maxLen = 0;
        int start = 0;
        int end = 0;
        for(int i = 0; i < len; i ++){
            for(int j = 0; j < i; j ++){
                dp[j][i] = (s.charAt(i) == s.charAt(j)) && (i - j < 2 || dp[j + 1][i - 1]);
                int l = i - j + 1;
                if(dp[j][i] && maxLen < l){
                    start = j;
                    end = i + 1;
                    maxLen = l;
                }
            }
        }
        return s.substring(start, end);
    }
	
	// O(n*n)
	public String longestPalindromeC(String s) {
        // expand from center
        if(s == null || s.length() < 2)
            return s;
            
        int len = s.length();
        int maxLen = 0;
        int start = 0;
        for(int i = 1; i < len;){
            int j = i - 1;
            int k = i + 1;
            while(j >= 0 && s.charAt(i) == s.charAt(j))
                j --;
            while(k < len && s.charAt(i) == s.charAt(k))
                k ++;
            i = k;///
            while(j >= 0 && k < len && s.charAt(j) == s.charAt(k)){
                j --;
                k ++;
            }
            int l = k - j - 1;
            if(l > maxLen){
                maxLen = l;
                start = j + 1;
            }
        }
        return s.substring(start, start + maxLen);
    }
	
	public String longestPalindrome(String s) {
        // Manacher's Algorithm
        if(s == null || s.length() < 2)
            return s;
        
        String ss = preProcess(s);
        int len = ss.length();
        int[] L = new int[len];
        Arrays.fill(L, 0);
        int C = 1;
        int R = 2;
        L[1] = 1;
        boolean expand = true;
        for(int i = 0; i < len; i ++){
            int diff = R - i;
            if(diff <= 0){
                L[i] = 0;
            } else{
                int iMirror = 2 * C - i;
                if(L[iMirror] < diff){
                    L[i] = L[iMirror];
                    expand = false;
                } else{
                    L[i] = diff;
                }
            }
            while(expand && i + L[i] + 1 < len && i - L[i] > 0 && 
                    ss.charAt(i + L[i] + 1) == ss.charAt(i - L[i] - 1))
                L[i] ++;
            if(i + L[i] > R){
                R = i + L[i];
                C = i;
            }
            expand = true;
        }
        
        int maxLen = 0;
        int maxCenter = 0;
        for(int i = 0; i < len; i ++){
            if(L[i] > maxLen){
                maxLen = L[i];
                maxCenter = i;
            }
        }
        System.out.println(maxCenter);
        System.out.println(maxLen);
        return s.substring((maxCenter - maxLen) / 2, (maxCenter - maxLen) / 2 + maxLen);
    }
    
    public String preProcess(String s){
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        for(int i = 0; i < s.length(); i ++){
            sb.append(s.charAt(i));
            sb.append("#");
        }
        return sb.toString();
    }
}
