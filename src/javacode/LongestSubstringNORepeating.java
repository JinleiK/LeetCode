package javacode;
import java.util.HashMap;


public class LongestSubstringNORepeating {
	public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() < 2)
            return s.length();
        
        int maxLen = Integer.MIN_VALUE;
        int count = 1;
        int start = 0;
        int end = 1;
        while(end < s.length()){
        	int index = -1;
        	for(int i = start; i < end; i ++){
        		if(s.charAt(i) == s.charAt(end))
        			index = i;
        	}
            if(index >= 0){
                start = index + 1;
                count = end - index;
            } else{
                count ++;
                maxLen = Math.max(maxLen, count);
            }
            System.out.println(s.charAt(end) + "," + maxLen);
            end ++;
        }
        return maxLen;
    }
	
	public int lengthOfLongestSubstring2(String s) {
        if(s == null || s.length() < 2)
            return s.length();
        
        int maxLen = Integer.MIN_VALUE;
        int count = 1;
        int start = 0;
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        hm.put(s.charAt(0), 0);
        for(int i = 1; i < s.length(); i ++){
            if(hm.containsKey(s.charAt(i))){
                int index = hm.get(s.charAt(i));
                if(start <= index){
                	start = index + 1;
                	count = i - index;
                } else
                	count ++;
            } else
            	count ++;
            maxLen = Math.max(maxLen, count);
            hm.put(s.charAt(i), i);
        }
        return maxLen;
    }
}
