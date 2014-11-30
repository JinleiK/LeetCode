package javacode;

import java.util.HashMap;

public class IntegertoRoman {
	public String intToRomanSB(int num) {
        HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
        hm.put(1000, 'M');
        hm.put(500, 'D');
        hm.put(100, 'C');
        hm.put(50, 'L');
        hm.put(10, 'X');
        hm.put(5, 'V');
        hm.put(1, 'I');
        
        StringBuffer sb = new StringBuffer();
        int count = num / 1000;
        for(int i = 0; i < count; i ++){
            sb.append((char) hm.get(1000));
        }
        num %= 1000;
        int base = 100;
        int div = 1;
        while(num > 0){
            div = 9 * base;
            if(num / div > 0){
                sb.append((char) hm.get(base));
                sb.append((char) hm.get(div + base));
                num %= div;
            } else{
                div = 5 * base;
                if(num / div > 0){
                    sb.append((char) hm.get(div));
                    num %= div;
                } else{
                    div = 4 * base;
                    if(num / div > 0){
                        sb.append((char) hm.get(base));
                        sb.append((char) hm.get(div + base));
                        num %= div;
                    }
                }
            }
            count = num / base;
            for(int j = 0; j < count; j ++){
                sb.append((char) hm.get(base));
            }
            if(count > 0){
                num %= base;
            }
            
            base /= 10;
        }
        return new String(sb);
    }
	
	public String intToRoman(int num) {
        HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
        hm.put(1, 'I');
        hm.put(5, 'V');
        hm.put(10, 'X');
        hm.put(50, 'L');
        hm.put(100, 'C');
        hm.put(500, 'D');
        hm.put(1000, 'M');
        
        StringBuilder sb = new StringBuilder();
        int b = 1000;
        while(num > 0){
            int count = num / b;
            if(b != 1000 && (count == 9 || count == 4)){
                int high = (count + 1) * b;
                sb.append(hm.get(b));
                sb.append(hm.get(high));
            } else{
                char c = hm.get(b);
                if(b != 1000 && count >= 5){
                    sb.append(hm.get(5 * b));
                    count %= 5;
                }
                for(int i = 0; i < count; i ++)
                    sb.append(c);
            }
            num %= b;
            b /= 10;
        }
        return sb.toString();
    }
}
