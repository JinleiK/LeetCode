package java;
import java.util.HashMap;

public class TwoSum {

	public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i < numbers.length; i ++){
        	System.out.println(numbers[i] + ":" + i);
            hm.put(numbers[i], i);
        }
        for(int i = 0; i < numbers.length; i ++){
        	//System.out.println(numbers[i]);
            int search = target - numbers[i];
            if(hm.containsKey(search)){
            	int index = hm.get(search);
				if (index != i) {
					result[0] = i + 1;
					result[1] = hm.get(search) + 1;
					break;
				}
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,2,4};
		int[] b = twoSum(a, 6);
		for(int i = 0; i < b.length; i++){
			System.out.println(b[i]);
		}
	}

}
