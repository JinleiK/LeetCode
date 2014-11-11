package javacode;

public class DecodeWays {
	public int numDecodings(String s) {
        if(s == null || s.length() == 0 || s.startsWith("0"))
            return 0;
        int[] m = new int[s.length() + 1];
        m[0] = 1;
        m[1] = 1;
        for(int i = 2; i <= s.length(); i ++){
            for(int j = 1; j <= 2; j ++){
                if(validCode(s.substring(i - j, i)))
                    m[i] += m[i - j];
            }
        }
        return m[s.length()];
    }
    
    public boolean validCode(String s){
        int code = Integer.parseInt(s);
        if(!s.startsWith("0") && code >= 1 && code <= 26)
            return true;
        return false;
    }
}
