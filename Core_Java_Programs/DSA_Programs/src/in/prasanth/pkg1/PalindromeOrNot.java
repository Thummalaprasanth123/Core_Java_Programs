package in.prasanth.pkg1;

public class PalindromeOrNot {

	public static void main(String[] args) {
		String s1="maham";
		StringBuffer sb=new StringBuffer(s1);
		//StringBuffer s2=sb.reverse();
		String s11=new String(sb.reverse());
		if(s1.equals(s11))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}

	}

}
