/**
 * Square represents the square in the Playfair
 * cipher algorithm.
 *
 * @author Julie Thornton
 * @version Project 8
 */

public class Square {
	private char[][] matrix;

	/**
	 * Square first puts the characters from key into
	 * the matrix, and then fills the matrix with the remaining
	 * letters (treating I/J as the same).
	 *
	 * @param key One of the encryption keys
	 */
	public Square(String key) {
		matrix = new char[5][5];
		String letters = removeDups(key+"ABCDEFGHIKLMNOPQRSTUVWXYZ");
		int index = 0;

		//fill with key, then with alphabet
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matrix[i][j] = letters.charAt(index);
				index++;
			}
		}
	}

	/**
	 * Square creates a 5x5 square of alphabet letters
	 * (treating I/J as the same).
	 */
	public Square() {
		this("");
	}
	
	//this is just for debugging
	public void print() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

	/**
	 * strContains returns whether the given string
	 * contains the given character
	 *
	 * @param str The string to search
	 * @param c The character to search for
	 *
	 * @return Whether c is in str
	 */
	private boolean strContains(String str, char c) {
		for (int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i)) return true;
		}

		return false;
	}

	/**
	 * removeDups removes all duplicate characters
	 * from the string
	 *
	 * @param key The string to remove duplicates from
	 *
	 * @return The string with all duplicates removed
	 */
	private String removeDups(String key) {
		String s = "";
		for (int i = 0; i < key.length(); i++) {
			if (!strContains(s, key.charAt(i))) {
				s += key.charAt(i);
			}
		}

		return s;
	}

	/**
	 * getChar returns the character at a given
	 * row and column in the matrix.
	 *
	 * @param row The row to look in
	 * @param col The column to look in
	 *
	 * @return The character at (row, col)
	 */
	public char getChar(int row, int col) {
		return matrix[row][col];
	}

	/**
	 * getPos returns the [row,col] position
	 * of the given character.
	 *
	 * @param c The character to look for
	 *
	 * @return A 2-slot array holding the (row,col) of c
	 */
	public int[] getPos(char c) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (matrix[i][j] == c) {
					int[] pos = new int[2];
					pos[0] = i;
					pos[1] = j;
					return pos;
				}
			}
		}

		return null;
	}
}