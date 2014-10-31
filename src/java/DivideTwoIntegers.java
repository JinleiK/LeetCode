package java;

public class DivideTwoIntegers {
	public int divide(int dividend, int divisor) {
        long absDd = Math.abs((long) dividend);
        long absDs = Math.abs((long) divisor);
        int count = 0;
        long c = 1;
        while(absDd >= absDs){
            absDs <<= 1;
            c <<= 1;
            if(absDd <= absDs){
                if(absDd < absDs){
                    absDs >>= 1;
                    c >>= 1;
            		System.out.println(c);
                    absDd -= absDs;
                }
                System.out.println(c);
                count += c;
                c = 1;
                if(absDd == absDs)
                    break;
                absDs = Math.abs((long) divisor);
            }
        }
        return (dividend < 0) ^ (divisor < 0)? -count : count;
    }
}
