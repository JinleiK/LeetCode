package javacode;

public class InterleavingString {
	// TLE
	public boolean isInterleave(String s1, String s2, String s3) {
        if(s1 == null && s2 == null)    return false;
        if(s1 == null || s1.length() == 0)  return  s2.equals(s3);
        if(s2 == null || s2.length() == 0)  return  s1.equals(s3);
        if(s1.length() + s2.length() != s3.length())
            return false;
        
        return isInterLeave(s1, s1.length() - 1, s2, s2.length() - 1, s3, s3.length() - 1);
    }
    
    public boolean isInterLeave(String s1, int i1, String s2, int i2, String s3, int i3){
        if(i1 == -1 && i2 == -1 && i3 == -1)
            return true;
        boolean isInter = false;
        if(i1 >= 0 && s1.charAt(i1) == s3.charAt(i3))
            isInter = isInter || isInterLeave(s1, i1 - 1, s2, i2, s3, i3 - 1);
        if(i2 >= 0 && s2.charAt(i2) == s3.charAt(i3))
            isInter = isInter || isInterLeave(s1, i1, s2, i2 - 1, s3, i3 - 1);
        return isInter;
    }
    
    public boolean isInterleaveDP(String s1, String s2, String s3) {
    	if(s1 == null && s2 == null)    return false;
        if(s1 == null || s1.length() == 0)  return  s2.equals(s3);
        if(s2 == null || s2.length() == 0)  return  s1.equals(s3);
        if(s1.length() + s2.length() != s3.length())
            return false;
        
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        for(int i = 0; i <= s1.length(); i ++){
            for(int j = 0; j <= s2.length(); j ++){
                if(i == 0 && j == 0)
                    dp[0][0] = true;
                else if(i == 0)
                    dp[i][j] = s2.charAt(j - 1) == s3.charAt(i + j - 1) && dp[i][j - 1];
                else if(j == 0){
                	System.out.println("i:"+ i);
                    dp[i][j] = dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1);
                }
                else dp[i][j] = (s2.charAt(j - 1) == s3.charAt(i + j - 1) && dp[i][j - 1]) ||
                                (s1.charAt(i - 1) == s3.charAt(i + j - 1) && dp[i - 1][j]);
            }
        }
        return dp[s1.length()][s2.length()];
    }
}
