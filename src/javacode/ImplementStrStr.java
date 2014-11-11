package javacode;

public class ImplementStrStr {
	public String strStr(String haystack, String needle) {
        if(haystack == null || needle == null)
            return null;
        int h = haystack.length();
        int n = needle.length();
        if(n == 0)
            return haystack;
        for(int i = 0; i < h; i ++){
            if(h - i < n)
                break;
            if(haystack.charAt(i) == needle.charAt(0)){
                int k = i;
                int j = 0;
                while(k - i < n && j < n && haystack.charAt(k) == needle.charAt(j)){
                    k ++;
                    j ++;
                }
                if(k - i == n)
                    return haystack.substring(i);
            }
        }
        return null;
    }
}
