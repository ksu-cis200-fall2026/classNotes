/**
 * Cipher handles the encryption and decryption of
 * messages according to the Four Square cipher algorithm.
 *
 * @author Julie Thornton
 * @version Project 8
 */

public class Cipher {
	private Square plain1;
	private Square plain2;
	private Square cipher1;
	private Square cipher2;

	/**
	 * Cipher creates the four squares based on
	 * the keys for the Four Square cipher algorithm
	 *
	 * @param key1 The first key (Js will be replaced by Is)
	 * @param key2 The second key (Js will be replaced by Is)
	 */
	public Cipher(String key1, String key2) {
		key1 = key1.replaceAll("J", "I");
		key2 = key2.replaceAll("J", "I");
		cipher1 = new Square(key1);
		cipher2 = new Square(key2);
		plain1 = new Square();
		plain2 = new Square();

	}

	/**
	 * processMessage removes the spaces from the message and
	 * replaces Js with Is
	 *
	 * @param str The message
	 *
	 * @return The processed message
	 */
	private String processMessage(String str) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'J') {
				result.append("I");
			}
			else if (str.charAt(i) != ' ') {
				result.append(str.charAt(i));
			}
		}

		return result.toString();
	}

	/**
	 * encrypt returns the encrypted message using the
	 * Four Square cipher algorithm. If plaintext has an odd length,
	 * it is padded with an X.
	 *
	 * @param message The message to encrypt
	 *
	 * @return The encrypted message
	 */
	public String encrypt(String message) {
		message = processMessage(message);
		
		StringBuilder result = new StringBuilder();
		//encrypt string in groups of two
		for (int i = 0; i < message.length(); i+=2) {
			char c1 = message.charAt(i);

			char c2;
			if (i+1 < message.length())  {
				c2 = message.charAt(i+1);
			}
			else {
				//pad odd length with an X
				c2 = 'X';
			}

			int[] pos1 = plain1.getPos(c1);
			//System.out.println(pos1[0] + " " + pos1[1]);
			int[] pos2 = plain2.getPos(c2);
			//System.out.println(pos2[0] + " " + pos2[1]);
			
			result.append(cipher1.getChar(pos1[0], pos2[1]));
			result.append(cipher2.getChar(pos2[0], pos1[1]));
		}

		return result.toString();
	}

	/**
	 * decrypt returns the ciphertext using the
	 * Four Square cipher algorithm. Assumes the ciphertext length is even.
 	 *
	 * @param message The message to decrypt
	 *
	 * @return The decrypted message
	 */
	public String decrypt(String message) {
		message = processMessage(message);
		
		StringBuilder result = new StringBuilder();
		//decrypt string in groups of two
		for (int i = 0; i < message.length(); i+=2) {
			char c1 = message.charAt(i);
			char c2 = message.charAt(i+1);

			int[] pos1 = cipher1.getPos(c1);
			int[] pos2 = cipher2.getPos(c2);
			
			result.append(plain1.getChar(pos1[0], pos2[1]));
			result.append(plain2.getChar(pos2[0], pos1[1]));
		}

		return result.toString();
	}
}