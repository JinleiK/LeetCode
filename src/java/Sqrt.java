package java;

public class Sqrt {
	public int sqrt(int x) {
        if(x == 0) {
            return 0;
        }
        long start = 0;
        long end = x / 2 + 1;
        long mid;
        while(start <= end){
            mid = (start + end) / 2;
            long temp = mid * mid;
            if(temp == (long) x){
                return (int) mid;
            } else if(temp > (long) x){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
