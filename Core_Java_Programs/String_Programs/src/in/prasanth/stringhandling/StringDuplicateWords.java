package in.prasanth.stringhandling;

public class StringDuplicateWords {

	public static void main(String[] args) {
		String s1 = "How are you dear you are very my dear you dear you dear very";
		String[] s1words = s1.split(" ");

		int count = 0;
//		for (int i = 0; i < s1words.length; i++) {
//			System.out.println(s1words[i]);
//		}
		String s2 = "";
		for (int i = 0; i < s1words.length; i++) {
			for (int j = i + 1; j < s1words.length; j++) {
				if (s2.contains(s1words[i])) {
					break;
				}
				if (s1words[i].equalsIgnoreCase(s1words[j])) {
					count++;
				}
			}
			s2 = s2 + " " + s1words[i];
			if (count > 0) {
				System.out.println("word : " + s1words[i] + " :repeated " + count + " times.");
			}
			count = 0;
		}
	}

}
