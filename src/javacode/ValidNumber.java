package javacode;

public class ValidNumber {
	// there must be a number after '+' or '-', '+' and '-' can only be at the begining or before e or E
    // there must be a number before or after '.', no '.', must be a number or 'e' or 'E' after '.'
    // there must be a number or '+' or '-' after 'e' or 'E', must be a '.' or a number before 'e' or 'E'
    public boolean isNumber(String s) {
        if(s == null)
            return false;
        s = s.trim();
        System.out.println(s);
        if(s.length() == 0)
            return false;
        int dot = -1;
        int epos = -1;
        for(int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);
            char before = '#';
            char after = '#';
            if(i > 0)   before = s.charAt(i - 1);
            if(i < s.length() - 1)  after = s.charAt(i + 1);
            if(c == '+' || c == '-'){
            	System.out.println(c);
                if(i > 0 && (before != 'e' && before != 'E' || !isDigit(after))){
                	System.out.println(after);
                	System.out.println(before == 'e');
                	System.out.println(isDigit(after));
                    return false;
                }
            } else if(c == '.'){
                if(epos >= 0 || dot >= 0 || (!isDigit(before) && !isDigit(after)))
                    return false;
                dot = i;
            }else if(c == 'e' || c == 'E'){
            	System.out.println(c);
            	if(epos >= 0 || (before != '.' && !isDigit(before)) || (after != '+' && after != '-' && !isDigit(after))){
            		System.out.println("ddd");
            		return false;
            	}
                epos = i;
            }else if(!isDigit(c))
                return false;
        }
        return true;
    }
    
    public boolean isNumber2(String s) {
        if(s == null)
            return false;
        s = s.trim();
        if(s.length() == 0)
            return false;
        int dot = -1;
        int epos = -1;
        for(int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);
            char before = '#';
            char after = '#';
            if(i > 0)   before = s.charAt(i - 1);
            if(i < s.length() - 1)  after = s.charAt(i + 1);
            switch(c){
                case '+':
                case '-':
                    if(i > 0 && (before != 'e' && before != 'E' || !isDigit(after)))
                        return false;
                    break;
                case '.':
                    if(epos >= 0 || dot >= 0 || (!isDigit(before) && !isDigit(after)))
                        return false;
                    dot = i;
                    break;
                case 'e':
                case 'E':
                    if(epos >= 0 || (before != '.' && !isDigit(before)) || (!isDigit(after) && after != '+' && after != '-'))
                        return false;
                    epos = i;
                    break;
            default:
                if(!isDigit(c))
                    return false;
            }
        }
        return true;
    }
    
    public boolean isDigit(char c){
        return c >= '0' && c <= '9';
    }
}
