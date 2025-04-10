package in.prasanth;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {
//Write a Java program to calculate the average of a list of integers using streams.
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
		List<String> colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
		List < Integer > numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List < Integer > distNums = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
		System.out.println("List of numbers: " + nums);
		// Calculate the average using streams
		double average = nums.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
		System.out.println(average);
		// Convert strings to uppercase using streams
		List<String> uppercaseStrings = colors.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("\nUppercase Strings: " + uppercaseStrings);
		// Sum of even numbers
	    int sumOfEvens = numbers.stream()
	      .filter(num -> num % 2 == 0)
	      .mapToInt(Integer::intValue)
	      .sum();
	    System.out.println("Sum of even numbers: " + sumOfEvens);
	 // Remove duplicates
	    List < Integer > distinctNumbers = distNums.stream()
	      .distinct()
	      .collect(Collectors.toList());
	    System.out.println("After removing duplicates from the said list: " + distinctNumbers);
	    
	}
}
