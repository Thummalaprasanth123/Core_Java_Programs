package in.prasanth.pkg1;

public class CountDigits {

	public static void main(String[] args) {
		int n=437;
		int result=0;
        String str=String.valueOf(n);
		for(int i=0;i<(str.length());i++)
		{
			int stoi=str.charAt(i)-'0';
			result=result+stoi;
		}
System.out.println(result);
	}

}
