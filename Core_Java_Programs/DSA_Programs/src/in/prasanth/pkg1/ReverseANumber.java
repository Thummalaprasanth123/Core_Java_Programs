package in.prasanth.pkg1;

import java.util.Scanner;
/*
public class ReverseANumber {

	public static void main(String[] args) {
		System.out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();   //234  ----  /432
		int r;
		String str="";
		while(num>0)
		{
			r=num%10;
			if(r>0 || r==0)
			{
				str=str+r;
			}
			num=num/10;
		}
      //System.out.println(str);
      int result=Integer.parseInt(str);
      System.out.println(result);
	}
}
*/
//-----------------------------------------
public class ReverseANumber {

	public static void main(String[] args) {
		System.out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
String str=String.valueOf(num);
StringBuffer sb=new StringBuffer(str);
//System.out.println(sb.reverse());
String str2=new String(sb);
int result=Integer.parseInt(str2);
System.out.println(result);
	}
}















