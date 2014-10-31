package java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ThreeSum {
	public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> solutions = new ArrayList<List<Integer>>();
        if(num.length == 0)
            return solutions;
        Arrays.sort(num);    
        for(int i = 0; i < num.length - 2; i ++){
            while(i > 0 && i < num.length - 2 && num[i] == num[i - 1])
                i ++;
            int l = i + 1;
            int r = num.length - 1;
            int target = 0 - num[i];

            while(l < r){
                int sum = num[l] + num[r];
                if(sum > target)
                    r --;
                else if(sum < target)
                    l ++;
                else{
                    List<Integer> solution = new ArrayList<Integer>();
                    solution.add(num[i]);
                    solution.add(num[l]);
                    solution.add(num[r]);
                    solutions.add(solution);
                    l ++;
                    r --;
                    while(l < r && num[l] == num[l - 1])
                        l ++;
                    while(r > l && num[r] == num[r + 1])
                        r --;
                }
            }
        }
        return solutions;
    }
	
	public static void main(String[] args){
		ThreeSum ts = new ThreeSum();
		int[] a = {-1,0,1,2,-1,-4};
		List<List<Integer>> b = ts.threeSum(a);
		System.out.println(b.size());
	}
}
