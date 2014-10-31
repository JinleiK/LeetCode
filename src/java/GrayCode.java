package java;
import java.util.ArrayList;
import java.util.List;


public class GrayCode {
	
	public List<Integer> grayCode(int n) {
        List<Integer> codes = new ArrayList<Integer>();
        if(n < 0)
            return codes;
        codes.add(0);
        for(int i = 0; i < n; i ++){
            int len = codes.size();
            for(int j = len - 1; j >= 0; j --){
                codes.add(codes.get(j) + (1 << i));
            }
        }
        return codes;
    }

	public static void main(String[] args) {
//		int a = 1 << 1;
//		System.out.println(a);
		// TODO Auto-generated method stub
		GrayCode gc = new GrayCode();
		List<Integer> codes = gc.grayCode(3);
		for(int c : codes)
			System.out.println(c);

	}

}
