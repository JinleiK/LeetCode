package javacode;

public class NextPermutation {
	public void nextPermutation1(int[] num) {
        if(num == null || num.length < 2)
            return;
        int len = num.length;
        int start = 0;
        int end = len - 1;
        while(end > 0 && num[end] == num[end - 1])
        	end --;
        if(end <= 0)
        	return;
        int i = end - 1;
        if(num[end] > num[i])
            start = i;
        else{
        	end = num.length - 1;
            while(i >= 0 && num[i] >= num[i + 1])
                i --;
            if(i >= 0){
            	int j = end;
            	while(j > i && num[j] <= num[i])
            		j --;
                	int temp = num[i];
                	num[i] = num[j];
                	num[j] = temp;
                	start = i + 1;
            }
        }
        while(start < end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start ++;
            end --;
        }
    }
	
	public void nextPermutation2(int[] num) {
        if(num == null || num.length < 2)
            return;
        int start = 0;
        int end = num.length - 1;
        int i = end - 1;
        while(i >= 0 && num[i] >= num[i + 1])
            i --;
        if(i >= 0){
            int j = end;
            while(j > i && num[j] <= num[i])
            	j --;
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            start = i + 1;
        }
        while(start < end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start ++;
            end --;
        }
    }
	
	//!
	public void nextPermutation(int[] num) {
        if(num == null || num.length < 2)
            return;
        int i = num.length - 2;
        while(i >= 0 && num[i + 1] <= num[i])
            i --;
        int j = num.length - 1;
        if(i >= 0){
            while(j > i && num[j] <= num[i])
                j --;
            swap(num, i, j);
        }
        reverse(num, i + 1, num.length - 1);
    }
    
    public void swap(int[] num, int i, int j){
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }
    
    public void reverse(int[] num, int i, int j){
        while(i < j){
            swap(num, i, j);
            i ++;
            j --;
        }  
    }
    
    public static void main(String[] args){
    	NextPermutation np = new NextPermutation();
    	int[] num = {1,3,3,3};
    	np.nextPermutation(num);
    	for(int n : num){
    		System.out.println(n);
    	}
    }
}
