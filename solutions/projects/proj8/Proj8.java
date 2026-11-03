/**
 * Proj8 gets two keys and a message, and
 * prints the enrypted or decrypted message
 * to the Four Square cipher algorithm.
 *
 * @author Julie Thornton
 * @version Project 8
 */

import java.util.*;

public class Proj8 {
    private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		String key1 = getKey("first");
		String key2 = getKey("second");

		if (containsNonAlpha(key1) || containsNonAlpha(key2)) {
			printError("At least one key contains non-alphabet characters");
		}
		else {
			char option = encryptOrDecrypt();

			Cipher c = new Cipher(key1, key2);
			String msg = "";
			String result = "";

			if (option == 'e') {
				msg = getPlaintext();
				result = c.encrypt(msg);
				printResults(result, true);
			}
			else if (option == 'd') {
				msg = getCiphertext();
				if (containsNonAlpha(msg)) {
					printError("Ciphertext contains non-alphabet characters");
				}
				else if (msg.length() % 2 != 0) {
					printError("Ciphertext must be an even length");
				}
				else {
					result = c.decrypt(msg);
					printResults(result, false);
				}
			}
			else {
				printError("Invalid menu option");
			}
		}
	}

	/**
	 * containsNonAlpha returns whether a given uppercase string contains non-alphabet characters
	 *
	 * @param str An uppercase string to check for non-alphabet characters
	 * @return True if str has a non-(upper case) alphabet character, and false otherwise
	 */
	private static boolean containsNonAlpha(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < 'A' || str.charAt(i) > 'Z') {
				return true;
			}
		}

		return false;
	}

    /**
	 * getKey returns a key from the user
	 *
	 * @param type The description of the key (first, second, etc.)
	 * @return The key from the user
	 */
	private static String getKey(String type) {
		System.out.printf("Enter the %s key: ", type);
		return s.nextLine().toUpperCase();
	}

	/**
	 * encryptOrDecrypt asks the user to choose encrypt or decrypt
	 *
	 * @return e for encryption and d for decryption
	 */
	private static char encryptOrDecrypt() {
		System.out.print("\nEnter (e)ncrypt or (d)ecrypt: ");
		return (s.nextLine().toLowerCase()).charAt(0);
	}

	/**
	 * getPlaintext gets the plaintext from the user
	 *
	 * @return The plaintext from the user, after converting to uppercase and
	 * 		removing all non-alphabet characters
	 */
	private static String getPlaintext() {
		System.out.print("Enter the message to encrypt: ");
		String plain = s.nextLine().toUpperCase();
		
		StringBuilder build = new StringBuilder();
		for (int i = 0; i < plain.length(); i++) {
			if (plain.charAt(i) >= 'A' && plain.charAt(i) <= 'Z') {
				build.append(plain.charAt(i));
			}
		}

		return build.toString();
	}

	/**
	 * getCiphertext gets the ciphertext from the user
	 *
	 * @return The ciphertext from the user
	 */
	private static String getCiphertext() {
		System.out.print("Enter the message to decrypt: ");
		return s.nextLine().toUpperCase();
	}

	/**
	 * printResults prints the encrypted and decrypted messages
	 *
	 * @param e The encrypted message
	 * @param d The decrypted message
	 */
	private static void printResults(String msg, boolean encrypt) {
		if (encrypt) System.out.println("\nEncrypted message: " + msg);
		else System.out.println("\nDecrypted message: " + msg);
	}

	/**
	 * printError prints an error message
	 *
	 * @param err The error message to print
	 */
	private static void printError(String err) {
		System.out.println("Error: " + err);
	}
}