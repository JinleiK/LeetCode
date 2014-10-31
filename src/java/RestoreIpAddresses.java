package java;
import java.util.ArrayList;
import java.util.List;


public class RestoreIpAddresses {
	public List<String> restoreIpAddresses(String s) {
        List<String> ips = new ArrayList<String>();
        if(s == null || s.length() < 4)
            return ips;
        StringBuilder ip = new StringBuilder();
        restoreIps(ips, ip, s, 4);
        return ips;
    }
    
	public void restoreIps(List<String> ips, StringBuilder ip, String s, int count){
        if(s.length() == 0 && count == 0)
            ips.add(ip.toString());
        else if(s.length() > 0 && count > 0){
            int maxLen = Math.min(3, s.length());
            for(int i = 1; i <= maxLen; i ++){
            	String maybeIp = s.substring(0, i);
                int num = Integer.parseInt(s.substring(0, i));
                int digits = i;
                if((num == 0 && maybeIp.length() == 1) || (num < 256 && !maybeIp.startsWith("0"))){
                    ip.append(s.substring(0, i));
                    if(count > 1){
                        ip.append(".");
                        digits ++;
                    }
                    //System.out.println(i);
                    restoreIps(ips, ip, s.substring(i), count - 1);
                    ip.delete(ip.length() - digits, ip.length());
                }
            }
        }
    }
    
    public static void main(String[] args){
    	RestoreIpAddresses ria = new RestoreIpAddresses();
    	String s = "010010";
    	List<String> ips = ria.restoreIpAddresses(s);
    	for(String ip : ips)
    		System.out.println(ip);
    }
}
