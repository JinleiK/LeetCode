package javacode;

public class AddBinary {
	public String addBinary(String a, String b) {
        if(a == null || a.length() < 1) return b;
        if(b == null || b.length() < 1) return a;
        
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while(i >= 0 && j >= 0){
            int sum = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(j)) + carry;
            carry = sum / 2;
            sum %= 2;
            sb.append(sum);
            i --;
            j --;
        }
        while(i >= 0){
            int sum = Character.getNumericValue(a.charAt(i)) + carry;
            carry = sum / 2;
            sum %= 2;
            sb.append(sum);
            i --;
        }
        while(j >= 0){
            int sum = Character.getNumericValue(b.charAt(j)) + carry;
            carry = sum / 2;
            sum %= 2;
            sb.append(sum);
            j --;
        }
        if(carry > 0){
            sb.append(carry);
        }
        sb.reverse();
        return sb.toString();
    }
}
