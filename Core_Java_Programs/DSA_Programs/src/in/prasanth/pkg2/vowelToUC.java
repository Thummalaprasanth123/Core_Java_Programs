package in.prasanth.pkg2;

public class vowelToUC {

	public static void main(String[] args) {
		String str="prasanth";
		String str2="aeiou";
		String strn="";
		for(int i=0;i<=(str.length()-1);i++)
		{
			String str1=String.valueOf(str.charAt(i));
			if(str2.contains(str1))
			{
				 str1=str1.toUpperCase();
				System.out.println(str1.toUpperCase());
			}
			//char c=str.charAt(i);
			strn=strn+str1;
		}
		System.out.println(strn);
	}
}
