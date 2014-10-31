package java;
import java.util.ArrayList;

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
	
	public static void main(String[] args) {
		String s = "10";
		int c = Character.getNumericValue(s.charAt(0)) + Character.getNumericValue(s.charAt(1));
		System.out.println(c);
	}

}
