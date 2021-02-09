package Base64EncodeDecode;

import java.util.Base64;

public class BasicEncodingDecoding {

	public static void main(String[] args) {
		String byteArr2;
		byte[] byteArr3;
		byte[] byteArr;
		byte[][] newbyte = null;
		String x = null;
		// Getting encoder
		Base64.Encoder encoder = Base64.getEncoder();
		// Creating byte array
		byte byteArr1[] = { 1, 2 };
		// encoding byte array
		byte byteArr21[] = encoder.encode(byteArr1);

		System.out.println("Encoded byte array: " + byteArr21);

		byte byteArr31[] = newbyte[5]; // Make sure it has enough size to store copied bytes

		int intx = encoder.encode(byteArr1, byteArr31); // Returns number of  bytes written
		System.out.println("Encoded byte array written to another array: " + byteArr31);

		System.out.println("Number of bytes written: " + x);

		// Encoding string
		String str = encoder.encodeToString("JavaTpoint".getBytes());
		System.out.println("Encoded string: " + str);
		// Getting decoder
		Base64.Decoder decoder = Base64.getDecoder();
		// Decoding string
		String dStr = new String(decoder.decode(str));
		System.out.println("Decoded string: " + dStr);

	}

}
