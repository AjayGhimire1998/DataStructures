package dsaBook;

public class CaesarCipher {

	protected char[] encoder = new char[26]; // Encryption array
	protected char[] decoder = new char[26]; // Decryption array

	// Constructor that initializes the encryption and decryption arrays
	public CaesarCipher(int rotation) {
		for (int i = 0; i < 25; i++) {
			encoder[i] = (char) ('A' + (i + rotation) % 26);
			decoder[i] = (char) ('A' + (i - rotation + 26) % 26);
		}
	}

	public String encrypt(String message) {

		return transform(message, encoder); // use encoder array
	}

	public String decrypt(String secret) {

		return transform(secret, decoder); // use decoder array

	}

	// returns transformation of original String
	public String transform(String original, char[] code) {
		char[] msg = original.toCharArray();

		for (int i = 0; i < msg.length; i++) {
			if (Character.isUpperCase(msg[i])) { // checl if we have a letter to change
				int j = msg[i] - 'A'; // gives us the value from 0 to 25
				msg[i] = code[j]; // replace the character
			}
		}
		return new String(msg);
	}

//	public static String transform(String original, char[] code) {
//		char[] msg = original.toCharArray();
//
//		for (int i = 0; i < msg.length; i++) {
//			if (Character.isUpperCase(msg[i])) {
//				int j = msg[i] - 'A';
//				msg[i] = code[j];
//			}
//		}
//		return new String(msg);
//	}

	public static void main(String[] args) {
		CaesarCipher cipher = new CaesarCipher(3);
		System.out.println("Encryption code: " + new String(cipher.encoder));
		System.out.println("Decryption code: " + new String(cipher.decoder));

		String message = "FIRE IN THE HOLE, FIRE IN THE HOLE; GET WATER";

		String coded = cipher.encrypt(message);
		System.out.println("Secret: " + coded);

		String answer = cipher.decrypt(coded);
		System.out.println("Message: " + answer);
	}

}
