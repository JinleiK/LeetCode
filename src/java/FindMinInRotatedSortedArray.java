package java;

public class FindMinInRotatedSortedArray {
	public int findMin(int[] num) {
        if(num == null || num.length == 0)
            return 0;
        if(num.length == 1)
            return num[0];
        int low = 0;
        int high = num.length - 1;
        while(low < high){
            if(high - low == 1)
                return Math.min(num[low], num[high]);
            int mid = (low + high) / 2;
            if(num[low] < num[mid] && num[mid] < num[high])
                high = mid - 1;
            else{
                if(num[low] < num[mid])
                    low = mid + 1;
                if(num[mid] < num[high])
                    high = mid;
            }
        }
        return num[low];
    }
	
	public int findMinDup(int[] num) {
		if(num == null || num.length == 0)
            return Integer.MIN_VALUE;
        int low = 0;
        int high = num.length - 1;
        while(low < high){
            if(high - low == 1)
                return Math.min(num[high], num[low]);
            int mid = (low + high) / 2;
            while(low < mid && num[low] == num[mid])
                low ++;
            while(mid < high && num[mid] == num[high])
                high --;
            if(num[low] <= num[mid] && num[mid] <= num[high])
                return num[low];
            else{
                
                if(num[low] < num[mid])
                    low = mid + 1;
                if(num[mid] < num[high])
                    high = mid;
            }
        }
        return num[low];
    }
}
