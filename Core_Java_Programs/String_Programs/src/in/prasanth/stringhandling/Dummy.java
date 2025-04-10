package in.prasanth.stringhandling;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Dummy {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		map.put("E", 5);

		// Example: Filtering entries with a value greater than 2 and collecting them
		// into a new map
		Map<String, Integer> filteredMap = map.entrySet().stream().filter(e -> e.getValue() > 2)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		// Print the filtered map
		System.out.println(filteredMap);
	}}
		
	//	In this example,
//
//	we create
//	a Map
//	with some key-
//	value pairs.Then,
//	we obtain
//	a stream
//	of map
//	entries using
//
//	entrySet().stream(). We apply a filter operation to keep only those entries with a value greater than 2. Finally, we collect the filtered entries back into a new map using Collectors.toMap().	
//	}
//
//}
