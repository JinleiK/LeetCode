package java;
import java.util.Arrays;
import java.util.LinkedList;


public class Test {
	 public static int count = 0;
	 public static int removeDuplicates(int[] A) {
	        int l = A.length;
	        if(l < 2){
	            return l;
	        }
	        System.out.println("l:"+l);
	        int i = 0;
	        int j = 1;
	        int newL = l;
	        int temp;
	        while(i < l && j < l){
	        	 System.out.println("out" + j);
	            if(A[i] == A[j]){
	            	System.out.println("in:"+j);
	            	//j ++;
	            	 
	                newL --;
	                count ++; 
	            } else{
	                temp = A[i + 1];
	                A[i + 1] = A[j];
	                A[j] = temp;
	                i ++;
	              //  j ++;
	            }
	            j++;
	        }
	        return newL;
	    }

	public static void main(String[] args) {
//		ArrayList<Integer> bb = new ArrayList<Integer>();
//		ArrayList<Integer> cc = new ArrayList<Integer>();
//		ArrayList<ArrayList<Integer>> aa = new ArrayList<ArrayList<Integer>>();
//		bb.add(2);
//		bb.add(3);
//		cc.add(2);
//		cc.add(3);
//		aa.add(bb);
////		System.out.println(aa.contains(cc));
//		
//		
//		int[] A = {1,1,1};
//		removeDuplicates(A);
//
//		int[] candies = new int[2];
//        Arrays.fill(candies, 1);
		System.out.println(Math.round(4.4));
	}

}
