package javacode;

public class MultiplyStrings {
	public String multiply(String num1, String num2) {
        if(num1 == null || num2 == null || num1.length() == 0 || num2.length() == 0)
            return null;
        if(num1.charAt(0) == '0' || num2.charAt(0) == '0')
            return "0";
         
        if(num1.length() > num2.length()){
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        int m = num1.length();
        int n = num2.length();   
        StringBuilder product = new StringBuilder();
        int carry = 0;
        for(int i = 0; i < m; i ++){
            int sum = carry;
            int a = m - 1;
            int b = n - 1 - i;
            while(a >= 0 && b < n){
                sum += Character.getNumericValue(num1.charAt(a)) * Character.getNumericValue(num2.charAt(b));
                a --;
                b ++;
            }
            carry = sum / 10;
            sum %= 10;
            if(carry != 0 || sum != 0)
            	product.append(sum);
            System.out.println(sum);
        }
        for(int i = n - 2; i >= 0; i --){
            int sum = carry;
            int a = 0;
            int b = i;
            while(a < m && b >= 0){
                sum += Character.getNumericValue(num1.charAt(a)) * Character.getNumericValue(num2.charAt(b));
                a ++;
                b --;
            }
            carry = sum / 10;
            sum %= 10;
            product.append(sum);
            System.out.println(sum);
        }
        if(carry > 0)
            product.append(carry);
            
        return product.reverse().toString();
    }
}
