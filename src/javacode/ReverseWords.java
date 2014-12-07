package javacode;

public class ReverseWords {
	public String reverseWordsOnePass(String s) {
        if(s == null)
            return s;
        s = s.trim();
        if(s.length() == 0)
            return s;
        int end = s.length() - 1;
        int start = end;
        StringBuilder sb = new StringBuilder();
        while(start >= 0){
            while(start >= 0 && s.charAt(start) != ' ')
                start --;
            if(end > start)
                sb.append(s.substring(start + 1, end + 1));
            if(start != -1)
                sb.append(" ");
            end = start;
            while(end >= 0 && s.charAt(end) == ' ')
                end --;
            start = end;
        }
        return sb.toString();
    }
	
	public String reverseWordsTwoPass(String s) {
        if(s == null || s.length() == 0)
            return s;
        String[] arr = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length - 1; i > 0; i --){
            if(arr[i].equals(""))
                continue;
            sb.append(arr[i].trim());
            sb.append(" ");
        }
        sb.append(arr[0].trim());
        return sb.toString();
    }
}
