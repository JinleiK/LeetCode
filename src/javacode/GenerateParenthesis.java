package javacode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class GenerateParenthesis {
	public List<String> generateParenthesis_1(int n) {
        List<String> ps = new ArrayList<String>();
        if(n < 1){
            return ps;
        }
        if(n == 1){
            ps.add("()");
            return ps;
        }
        List<String> ls = generateParenthesis_1(n - 1);
        for(String s : ls){
            ps.add(s + "()");
            ps.add("()" + s);
            ps.add("(" + s + ")");
        }
        Set<String> tempSet = new HashSet<String>(ps);
        List<String> result = new ArrayList<String>(tempSet);
        return result;
    }
	
	public List<String> generateParenthesis(int n) {
        List<String> ps = new ArrayList<String>();
        if(n < 1){
            return ps;
        }
        
        generateP(ps, "", n, n);
        return ps;
    }
    
    public void generateP(List<String> ls, String s, int left, int right){
        if(left == 0 && right == 0){
            ls.add(s);
            return;
        }
        if(left > right){
            return;
        }
        if(left == 0){
            generateP(ls, s + ")", left, right - 1);
            return;
        }
        
        generateP(ls, s + "(", left - 1, right);
        generateP(ls, s + ")", left, right - 1);
    }
	
	public static void main(String[] args) {
		GenerateParenthesis gp = new GenerateParenthesis();
		List<String> ls = gp.generateParenthesis(4);
		String[] aaa = {"(((())))","((()()))","((())())","((()))()","(()(()))","(()()())","(()())()","(())(())","(())()()","()((()))","()(()())","()(())()","()()(())","()()()()"};
		List<String> bbb = new ArrayList<String>(Arrays.asList(aaa));
		for(String s : ls){
			if(!bbb.contains(s)){
				System.out.println(s);
			}
		}
		System.out.println(ls.size() + "," + bbb.size());
	}

}
