package in.prasanth.pkg2;

public class PalinOrNot {

	public static void main(String[] args) {
    String str1="MaLayAlaM";
    StringBuffer sb=new StringBuffer(str1);
    String str2=new String(sb.reverse());
    if((str2.toLowerCase()).equals(str1.toLowerCase()))
    {
    	System.out.println("Palindrome");
    }
    else
    {
      System.out.println("Not a palindrome");
    }

	}

}
