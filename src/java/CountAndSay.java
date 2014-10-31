package java;
import java.util.ArrayList;
import java.util.List;


public class CountAndSay {
	public String countAndSay(int n) {
        if(n < 1)
            return null;
        List<Integer> str = new ArrayList<Integer>();
        str.add(1);
        for(int i = 2; i <= n; i ++){
            int len = str.size();
            List<Integer> pre = new ArrayList<Integer>(str);
            str.removeAll(pre);
            int count = 0;
            int j = 0;
            while(j < len){
                int val = pre.get(j);
                while(j < len && pre.get(j) == val){
                    count ++;
                    j ++;
                }
                str.add(count);
                str.add(val);
                count = 0;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int s : str)
            sb.append(s);
        return sb.toString();
    }
}
