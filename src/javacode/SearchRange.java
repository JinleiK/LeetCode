package javacode;

public class SearchRange {
	public int[] searchRange(int[] A, int target) {
        int[] range = new int[2];
        range[0] = A.length - 1;
        range[1] = -1;
        int start = 0;
        int end = A.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(A[mid] == target && mid < range[0]){
                range[0] = mid;
                end = mid - 1;
            } else if(A[mid] > target){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        
        start = 0;
        end = A.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(A[mid] == target && mid > range[1]){
                range[1] = mid;
                start = mid + 1;
            } else if(A[mid] > target){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        if(range[1] == -1)  range[0] = -1;
        return range;
    }
}
