package javacode;

public class StringToInteger {
	public int atoi(String str) {
        if(str == null)
            return 0;
        str = str.trim();
        if(str.length() == 0)
            return 0;
        boolean neg = false;
        int start = 0;
        if(str.charAt(0) == '+')
            start += 1;
        if(str.charAt(0) == '-'){
            neg = true;
            
            start += 1;
        }
        long num = 0;
        for(int i = start; i < str.length(); i ++){
            char c = str.charAt(i);
            System.out.println(c);
            if(c > '9' || c < '0')
                break;
            num = num * 10 + Character.getNumericValue(c);
            if(num > Integer.MAX_VALUE){
            	if(neg)
            		return Integer.MIN_VALUE;
            	return Integer.MAX_VALUE;
            }
        }
        if(neg)
            num = -num;
        System.out.println(num);
        
        return (int) num;
    }
}
