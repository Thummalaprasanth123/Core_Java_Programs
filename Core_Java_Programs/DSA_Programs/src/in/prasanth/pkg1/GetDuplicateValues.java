package in.prasanth.pkg1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class GetDuplicateValues {

	public static void main(String[] args) {

		Integer[] a = {1, 2, 3, 4, 6, 12, 1, 2, 3, 6, 9, 18};
		List<Integer> li = Arrays.asList(a);
		Set<Integer> si = new HashSet<>();
//		List<Integer> li=new ArrayList<>();
//        for(int i=0;i<=(a.length-1);i++)
//        {   
//        	boolean b = si.add(a[i]);
//        	if(b==false)
//        	{
//        		li.add(a[i]);
//        	}
//        }
//        System.out.println(si);
        System.out.println(li);
        Optional<Integer> first = li.stream().filter(i->!(si.add(i))).sorted((i,j)->Integer.compare(j,i)).findFirst();
        first.ifPresent(value->System.out.println(value));
	}

}







