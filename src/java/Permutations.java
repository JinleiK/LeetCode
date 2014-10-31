package java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
	public List<List<Integer>> permute(int[] num) {
		List<List<Integer>> permutes = new ArrayList<List<Integer>>();
		if (num == null || num.length < 1)
			return permutes;
		List<Integer> singlePer = new ArrayList<Integer>();
		singlePer.add(num[0]);
		permutes.add(singlePer);
		for (int i = 1; i < num.length; i++) {
			int len = permutes.size();
			for (int j = 0; j < len; j++) {
				List<Integer> pre = permutes.get(j);
				for (int k = 0; k < pre.size(); k++) {
					List<Integer> permute = new ArrayList<Integer>();
					permute.addAll(pre);
					permute.add(k, num[i]);
					if (!permutes.contains(permute))
						permutes.add(permute);
				}
				pre.add(num[i]);
			}
		}
		return permutes;
	}
	
	public List<List<Integer>> permuteUnique(int[] num) {
		List<List<Integer>> permutes = new ArrayList<List<Integer>>();
		if (num == null || num.length < 1)
			return permutes;
		Arrays.sort(num);
		
		return permutes;
	}

	public static void main(String[] args) {
		Permutations p = new Permutations();
		int[] num = { 1, 1, 2 };
		List<List<Integer>> ps = p.permute(num);
		for (int i = 0; i < ps.size(); i++) {
			for (int a : ps.get(i)) {
				System.out.print(a + ",");
			}
			System.out.println();
		}

	}

}
