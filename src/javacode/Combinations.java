package javacode;
import java.util.ArrayList;
import java.util.List;

public class Combinations {

	public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<ArrayList<Integer>> combinations = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i ++){
            for (int j = i + 1; j < n; j ++){
                ArrayList<Integer> combination = new ArrayList<Integer>();
                combination.add(i);
                combination.add(j);
                combinations.add(combination);
            }
        }
        return combinations;
    }
	
	///
	public List<List<Integer>> combine2(int n, int k) {
        List<List<Integer>> combines = new ArrayList<List<Integer>>();
        if(n < 1 || k > n)
            return combines;
        List<Integer> com = new ArrayList<Integer>();
        combine(combines, com, 1, n, k);
        return combines;
    }
    
    public void combine(List<List<Integer>> combines, List<Integer> com, int m, int n, int k){
        if(k == 0){
            combines.add(new ArrayList<Integer>(com));
            return;
        }
        for(int i = m; i <= n; i ++){
            com.add(i);
            combine(combines, com, i + 1, n, k - 1);
            com.remove(com.size() - 1);
        }
    }
	///
	public static void main(String[] args) {
		String s = "10";
		int c = Character.getNumericValue(s.charAt(0)) + Character.getNumericValue(s.charAt(1));
		System.out.println(c);
	}

}
