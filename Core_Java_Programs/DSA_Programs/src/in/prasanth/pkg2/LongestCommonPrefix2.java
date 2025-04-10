package in.prasanth.pkg2;

public class LongestCommonPrefix2 {
	 public static String longestCommonPrefix(String[] strs) {
	        StringBuilder sb=new StringBuilder();

	        if(strs.length==0) return "";

	        for(int i=0; i<strs[0].length(); i++){
	            char c=strs[0].charAt(i);
	            for(int j=1; j<strs.length; j++){
	                if(i>=strs[j].length() || strs[j].charAt(i)!=c){
	                    return sb.toString();
	                }
	            }
	            sb.append(c);
	        }

	        return sb.toString();
	    }
	
	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };
		String s=longestCommonPrefix(strs);
		System.out.println(s);
	
	}
	}


