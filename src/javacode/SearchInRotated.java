package javacode;

public class SearchInRotated {
	public int search(int[] A, int target) {
        if(A == null){
            return -1;
        }
        int start = 0;
        int end = A.length - 1;
        int mid;
        while(start <= end){
            mid = (start + end) / 2;
            if(A[mid] == target){
                return mid;
            }
            if(A[start] <= A[mid]){
                if(A[start] <= target && A[mid] > target){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            } else{
                if(A[mid] < target && A[end] >= target){
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
	
	public boolean search2(int[] A, int target) {
        if(A == null)
            return false;
        
        int start = 0;
        int end = A.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(A[mid] == target)
                return true;
            while(start < mid && A[start] == A[mid])
                start ++;
            while(end > mid && A[end] == A[mid])
                end --;
            if(A[start] <= A[mid]){////IMPORTANT
                if(A[start] <= target && A[mid] > target)
                    end = mid - 1;
                else start = mid + 1;
            } else{
                if(A[mid] < target && A[end] >= target)
                    start = mid + 1;
                else end = mid - 1;
            }
        }
        return false;
    }
}
