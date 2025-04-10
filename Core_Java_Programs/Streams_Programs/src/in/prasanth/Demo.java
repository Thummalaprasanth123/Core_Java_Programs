package in.prasanth;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
  public static void main(String[] args) {
    //List < String > colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
    List < Integer > colors = Arrays.asList(20,50,30,10);
    System.out.println("Original List of strings(colors): " + colors);
    // Sort strings in ascending order
//    List < String > ascendingOrder = colors.stream()
//      .sorted()
//      .collect(Collectors.toList());

    // Sort strings in descending order
//    Optional<Integer> max = colors.stream()
//      .sorted((i1,i2)->((i1<i2)?1:((i1>i2)?-1:0))).max((e1,e2)->e1.compareTo(e2));
 Optional<Integer> first = colors.stream()
    	      .sorted((i1,i2)->((i1<i2)?1:((i1>i2)?-1:0)))
    	      .limit(3).skip(2).findAny();
    //System.out.println(max.get());
System.out.println(first.get());
    //System.out.println("\nSorted in Ascending Order: " + ascendingOrder);
  //  System.out.println("\nSorted in Descending Order: " + descendingOrder);
  }
}

//55,25,30
//compare(object obj1, object obj2)

//returns -ve iff obj1 has to come before obj2.
//










