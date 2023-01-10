package dsaBookSimpleCryptographyWithCharacterArrays;

// Class for doing encryption and decryption using the Caesar Cipher.
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
}
