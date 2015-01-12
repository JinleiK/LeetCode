package javacode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWConcatenationOAllWords {
	public List<Integer> findSubstring(String S, String[] L) {
        if(L==null || L.length==0) return null; 
        int n = L.length, wordLen = L[0].length(), l=S.length();
        ArrayList<Integer> res = new ArrayList<Integer>();
         
        Map<String,Integer> dict = new HashMap<String,Integer>();
        for(String word : L){
            if(!dict.containsKey(word)){
                dict.put(word, 1);
            } else{
                dict.put(word, dict.get(word) + 1);
            }
        }
        
        for(int i = 0; i <= l - wordLen * n; i ++){
            Map<String,Integer> curDict = new HashMap<String,Integer>(dict);
            for(int j = i; j < i + wordLen * n; j += wordLen){
                String curWord = S.substring(j, j + wordLen);
                if(curDict.containsKey(curWord)){
                    if(curDict.get(curWord) == 1){
                        curDict.remove(curWord);
                    } else{
                        curDict.put(curWord, curDict.get(curWord) - 1);
                    }
                } else  break;
            }
            if(curDict.isEmpty()){
                res.add(i);
            }
        }
        return res;    
    }
}
