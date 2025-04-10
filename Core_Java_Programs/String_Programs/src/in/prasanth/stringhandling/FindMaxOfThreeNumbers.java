package in.prasanth.stringhandling;

import java.util.Arrays;

public class FindMaxOfThreeNumbers {

	public static void main(String[] args) {
		int a[] = { 23, 54, 10 };
        Arrays.sort(a);
        System.out.println(a[]);
        for(int i=(a.length-1);i>((a.length-1)-3);i--)
        {
        	System.out.println(a[i]);
        }
	}

}
