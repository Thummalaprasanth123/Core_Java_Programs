
package in.prasanth;
import java.util.Arrays;
import java.util.List;

public class Demo1{
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango", "Grapes");

        System.out.println("Original list: " + fruits);

        Long modifiedList = fruits.stream()
                .peek(s -> System.out.println("Processing: " + s))
//                .map(String::toUpperCase)
//                .peek(s -> System.out.println("Uppercase: " + s))
//                .filter(s -> s.startsWith("A"))
//                .peek(s -> System.out.println("Filtered: " + s))
                .count();

        System.out.println("Modified list: " + modifiedList);
    }
}
