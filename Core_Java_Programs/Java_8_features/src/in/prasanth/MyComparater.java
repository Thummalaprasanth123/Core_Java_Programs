package in.prasanth;

import java.util.Comparator;

public class MyComparater implements Comparator<Integer> {

	@Override
	public int compare(Integer I1, Integer I2) {
		return (I1<I2)?-1:(I1>I2)?1:0;
	}

}
