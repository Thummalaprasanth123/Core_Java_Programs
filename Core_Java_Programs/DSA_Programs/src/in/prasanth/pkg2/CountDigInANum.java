package in.prasanth.pkg2;

public class CountDigInANum {

	public static void main(String[] args) {
		// 437 --------- 4+3+7=14
		//Integer num =3466;
int count = 0;
//	String str1 = String.valueOf(num);
//		for (int i = 0; i <= (str1.length() - 1); i++) {
//			int a = (str1.charAt(i)) - '0';
//			count = count + a;
//		}
//		System.out.println(count)
		String str="123ABC45D";
		char[] ca = str.toCharArray();
		for(int i=0;i<=(ca.length-1);i++)
		{
		boolean b = Character.isAlphabetic(ca[i]);
		if(b==true)
		{
			int b1=ca[i];
			System.out.println(b1);
			count=count+b1;
			
		}
		}
		System.out.println(count);
	}
}
