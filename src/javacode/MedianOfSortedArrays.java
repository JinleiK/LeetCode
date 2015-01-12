package javacode;

public class MedianOfSortedArrays {
	//O(m + n)
	public double findMedianSortedArrays1(int A[], int B[]) {
        if(A == null || B == null)
            return 0.0;
        int len = A.length + B.length;
        if(len < 2){
            if(A.length == 0 && B.length == 0)      
                return 0.0;
            if(A.length == 0)
                return (double) B[0];
            else return (double) A[0];
        }
        int i = 0;
        int j = 0;
        int cur = Integer.MIN_VALUE;
        int pre = cur;
        while(i + j <= len / 2){
            pre = cur;
            if(i >= A.length){
                cur = B[j];
                j ++;
            } else if(j >= B.length){
                cur = A[i];
                i ++;
            } else if(A[i] <= B[j]){
                cur = A[i];
                i ++;
            } else{
                cur = B[j];
                j ++;
            }
        }
        if(len % 2 == 1)
            return (double)cur;
        else return (double)(pre + cur) / 2.;
    }
	
	public double findMedianSortedArrays(int A[], int B[]) {
        if(A == null || B == null)
            return 0.0;
        if((A.length + B.length) % 2 == 0){
            return (findKth(A, 0, A.length, B, 0, B.length, (A.length + B.length) / 2) +
                    findKth(A, 0, A.length, B, 0, B.length, (A.length + B.length) / 2 + 1)) / 2.;
        } else return (double)findKth(A, 0, A.length, B, 0, B.length, (A.length + B.length + 1) / 2);
    }
    
    public int findKth(int[] A, int startA, int endA, int[] B, int startB, int endB, int k){
        int m = endA - startA;
        int n = endB - startB;
        if(m <= 0)  return B[startB + k - 1];
        if(n <= 0)  return A[startA + k - 1];
        if(k <= 1)  return Math.min(A[startA], B[startB]);
        int midA = (startA + endA) / 2;
        int midB = (startB + endB) / 2;
 
        if (A[midA] <= B[midB]) {
            if (n / 2 + m / 2 + 1 >= k)
                return findKth(A, startA, endA, B, startB, midB, k);
            else
                return findKth(A, midA + 1, endA, B, startB, endB, k - m / 2 - 1);
        } else {
            if (n / 2 + m / 2 + 1 >= k)
                return findKth(A, startA, midA, B, startB, endB, k);
            else
                return findKth(A, startA, endA, B, midB + 1, endB, k - n / 2 - 1);
 
        }
    }
	
	public static void main(String[] args){
		MedianOfSortedArrays msa = new MedianOfSortedArrays();
		int[] A = {1, 2};
		int[] B = {1, 2};
		System.out.println(msa.findMedianSortedArrays(A, B));
	}
}
