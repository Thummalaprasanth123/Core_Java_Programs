package in.prasanth;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Demo3 {

	public static void main(String[] args) {
		/*
		 * FileReader fr = new FileReader(new File("info.txt"));
		 * 
		 * BufferedReader br = new BufferedReader(fr);
		 * 
		 * String line = br.readLine();
		 * 
		 * while (line != null) { System.out.println(line); line = br.readLine(); }
		 * br.close();
		 */

		String filename = "info.txt";

		try (Stream<String> stream = Files.lines(Paths.get(filename))) {

			stream.peek(s->System.out.println(s)).forEach(line -> System.out.println(line));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
