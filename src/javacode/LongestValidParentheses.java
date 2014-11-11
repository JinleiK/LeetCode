package javacode;
import java.util.Stack;


public class LongestValidParentheses {

	public static int longestValidParentheses(String s) {
        int l = s.length();
        if(l < 1){
            return 0;
        }
        Stack<Character> stack = new Stack<Character>();
        int num = 0;
        int max = 0;
        int i = 0;
        char c;
        while(i < l){
            c = s.charAt(i);
            
            if(c == '('){
            	stack.push(c);
            } else if(!stack.empty() && stack.pop() =='('){
            	num ++;
                max = Math.max(max, num);
            } else{
            	num = 0;
            }
            i ++;
        }
        return max*2;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestValidParentheses(")()())((()()))(()"));
	}

}
