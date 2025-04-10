package in.prasanth.pkg1;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the query: ");
		
			String q1 = sc.nextLine();
			System.out.println(q1);
			String option = sc.nextLine();
			if (option.equalsIgnoreCase("No")) {
				break;
			}
			
		//}
//		for(int i=0;i<=2;i++)
//		{
//		System.out.println("Enter the s1 query: ");
//		String q0=sc.nextLine();
//		System.out.println(q0);
//		String q1 = sc.nextLine();
//		System.out.println(q1);
//		String q2=sc.nextLine();
//		System.out.println(q2);
//		}

	}

}
