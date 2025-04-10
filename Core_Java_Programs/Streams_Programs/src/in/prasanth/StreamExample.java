package in.prasanth;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// Sequential Stream
		int sequentialSum = numbers.stream().mapToInt(n -> n * n).sum();
		System.out.println("Sequential Sum: " + sequentialSum);

		// Parallel Stream
		int parallelSum = numbers.parallelStream().mapToInt(n -> n * n).sum();
		System.out.println("Parallel Sum: " + parallelSum);
	}
}
