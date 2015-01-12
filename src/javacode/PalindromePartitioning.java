package javacode;

import java.util.Arrays;

public class PalindromePartitioning {
	// I
	
	// II
	// TLE
	public int minCut1(String s) {
        if(s == null || s.length() < 2)
            return 0;
        s = s.trim();
        int len = s.length();
        int[] cuts = new int[len + 1];
        cuts[0] = -1;
        cuts[1] = 0;
        for(int i = 2; i < len + 1; i ++){
            cuts[i] = Integer.MAX_VALUE;
            for(int j = 0; j < i; j ++){
                if(isPalindrome(s.substring(j, i))){
                    cuts[i] = Math.min(cuts[i], cuts[j] + 1);
                }
            }
        }
        return cuts[len];
    }
    
    public boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j))
                return false;
            i ++;
            j --;
        }
        return true;
    }
	
    // DP
    public int minCut2(String s) {
        if(s == null || s.length() < 2)
            return 0;
        s = s.trim();
        int len = s.length();
        int[] cuts = new int[len + 1];
        boolean[][] dp = new boolean[len][len];
        for(int i = 0; i <= len; i ++)
            cuts[i] = i - 1;
        for(int i = 0; i < len; i ++){
            Arrays.fill(dp[i], false);
            dp[i][i] = true;
        }
        
        for(int i = 1; i < len; i ++){
            for(int j = 0; j < i; j ++){
                if(s.charAt(i) == s.charAt(j) && (i - j < 2 || dp[j + 1][i - 1])){
                    dp[j][i] = true;
                    cuts[i + 1] = Math.min(cuts[i + 1], cuts[j] + 1);
                }
            }
            cuts[i + 1] = Math.min(cuts[i + 1], cuts[i] + 1);
        }
        return cuts[len];
    }
    
	// spread from center
    public int minCut3(String s) {
        if(s == null || s.length() < 2)
            return 0;
        s = s.trim();
        int len = s.length();
        int[] cuts = new int[len + 1];
        for(int i = 0; i <= len; i ++)
            cuts[i] = i - 1;
        for(int i = 0; i < len; i ++){
            // odd
            for(int j = 0; i - j >= 0 && i + j < len && s.charAt(i - j) == s.charAt(i + j); j ++){
                cuts[i + j + 1] = Math.min(cuts[i + j + 1], cuts[i - j] + 1);
            }
            // even
            for(int j = 1; i - j + 1 >= 0 && i + j < len && s.charAt(i - j + 1) == s.charAt(i + j); j ++){
                cuts[i + j + 1] = Math.min(cuts[i + j + 1], cuts[i - j + 1] + 1);
            }
        }
        return cuts[len];
    }
}
