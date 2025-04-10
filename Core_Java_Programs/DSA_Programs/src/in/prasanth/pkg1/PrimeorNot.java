package in.prasanth.pkg1;

import java.util.Scanner;

public class PrimeorNot {
    
	public static void main(String[] args) {
	 System.out.println("Enter the number");
	 Scanner sc=new Scanner(System.in);
	 int num=sc.nextInt();
	 int flag=0;
	 for(int i=2;i<num;i++)
	 {
		if(num%i==0)
		{
			flag++;
		}
	 }
 if(flag==0)
 {
	 System.out.println(num+" is Prime number");
 }
 else
 {
	 System.out.println(num+" is not a Prime number");
 }
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	System.out.print("Enter a number: ");
//	Scanner sc = new Scanner(System.in);
//	int num =10;//sc.nextInt();
//	int i = 2;
//	int flag = 0;
//	while (i < num) {
//		if (num % i == 0) {
//			flag++;
//		}
//		i++;
//	}
//	if (flag > 0)
//		System.out.println("Not a Prime number");
//	else
//		System.out.println("Prime number");
