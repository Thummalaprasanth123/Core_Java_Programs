package in.prasanth.pkg2;

public class StringEqualCheck {

	public static void main(String[] args) {
		String str1="honey";
		String str2="HONEY";
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Two Strings are equal");
		}
		else
		{
			System.out.println("Not equal");
		}

	}

}
