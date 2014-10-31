package java;

public class LengthOfLastWord {

	public int lengthOfLastWord(String s) {
        int l = s.length();
        if(l < 1){
            return 0;
        }
        int lOfLW = 0;
        int i = l - 1;
        while(i >= 0 && s.charAt(i) == ' '){
           i --;
        }
        if(i < 0){
            return 0;
        }
        while(i >= 0 && s.charAt(i) != ' '){
            lOfLW ++;
            i --;
        }
        return lOfLW;
    }
	
	public static int lengthOfLastWordTrim(String s) {
        String s1 = s.trim();
        int l = s1.length();
        if(l < 1){
            return 0;
        }
        int lOfLW = 0;
        int i = l - 1;

        while(i >= 0 && s1.charAt(i) != ' '){
            lOfLW ++;
            i --;
        }
        return lOfLW;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" a".trim().length());
		System.out.println(lengthOfLastWordTrim(" a"));
	}

}
