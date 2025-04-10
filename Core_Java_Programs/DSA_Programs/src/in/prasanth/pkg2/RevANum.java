package in.prasanth.pkg2;

public class RevANum {

	public static void main(String[] args) {
		// 269 ------ 962
		int num = 345678;
		String str1 = String.valueOf(num);
		StringBuffer sb = new StringBuffer(str1);
		String str2 = new String(sb.reverse());
		Integer a = Integer.valueOf(str2);
		System.out.println(a);
	}
}
