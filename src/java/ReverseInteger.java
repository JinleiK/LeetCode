package java;

public class ReverseInteger {
	
	public int reverse1(int x){
		if(x == 0 || Math.abs(x / 10) < 1)
			return x;
		StringBuilder sb = new StringBuilder();
		if(x < 0){
			x = - x;
			sb.append('-');
		}
		String strX = Integer.toString(x);
		for(int i = strX.length() - 1; i >= 0; i --){
			sb.append(strX.charAt(i));
		}
		return Integer.parseInt(sb.toString());
	}
	
	public int reverse2(int x){
		int out = 0;
		boolean neg = false;
		if(x < 0){
			x = -x;
			neg = true;
		}
		while(x > 0){
			out = out * 10 + x % 10;
			x /= 10;
		}
		if(neg)	return -out;
		return out;
	}
	
	public static void main(String[] args){
		ReverseInteger ri = new ReverseInteger();
		int x = 10;
		int y = ri.reverse2(x);
		System.out.println(y);
	}
}
