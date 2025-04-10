package in.prasanth;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };

		/*
		 * int sum = 0; for(int i : nums) { sum = sum + i; } System.out.println(sum);
		 */
		boolean l = Arrays.stream(nums).isParallel();
		System.out.println(l);
		int reduce = Arrays.stream(nums).reduce(1, (a, b) -> a + b);
		System.out.println(reduce);
	}

}
