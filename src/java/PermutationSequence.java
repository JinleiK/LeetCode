package java;
import java.util.ArrayList;
import java.util.List;



public class PermutationSequence {
	public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<Integer>();
        int total = 1;
        for(int i = 0; i < n; i ++){
        	nums.add(i + 1);
            total *= i + 1;
        }
        if(k > total)
            return "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i ++){
            total /= n - i;
            int index = 0;
            if(k % total == 0){
                index = k / total - 1;
                k = total;
            } else{
                index = k / total;
                k = k % total;
            }
            sb.append(nums.get(index));
            nums.remove(index);
            for(int num : nums){
            	System.out.print(num + ",");
            }
            System.out.println();
        }

        return sb.toString();
    }
}
