package in.prasanth;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Demo4 {

	public static void main(String[] args) {
		String name = "Prasanth8301";
		Encoder encoder = Base64.getEncoder();
		byte[] encode = encoder.encode(name.getBytes());
		String encodename = new String(encode);
		System.out.println(encodename);
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodename);
		String decodename = new String(decode);
		System.out.println(decodename);
	}
}
