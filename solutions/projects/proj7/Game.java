/**
 * Game represents a video game (title, platforms, year)
 *
 * @author Julie Thornton
 * @version Project 7
 */

import java.util.*;

public class Game {
	private String name;
	private String[] platforms;
	private int year;
	
	/**
	 * Creates a new Game object
	 *
	 * @param n The game's name
	 * @param p The game's platforms
	 * @param y The year the game was released
	 */
	public Game(String n, String p, int y) {
		name = n;
		platforms = parsePlatforms(p);
		year = y;
	}

	/**
	 * Breaks a list of platform names into an array
	 *
	 * @param s A comma separated list of platforms
	 * @return An array of the platform names
	 */
	private String[] parsePlatforms(String s) {
		//will ignore last comma
		String[] pieces = s.split(",+");
		for (int i = 0; i < pieces.length; i++) {
			pieces[i] = pieces[i].trim();
		}

		return pieces;
	}

	/**
	 * Builds a string of the list of platforms
	 *
	 * @return The platform list as a string
	 */
	private String getPlatforms() {
		StringBuilder build = new StringBuilder();
		for (int i = 0; i < platforms.length; i++) {
			build.append(platforms[i]);
			if (i != platforms.length-1) {
				build.append(", ");
			}
		}

		return build.toString();
	}

	/**
	 * Builds a string representation of this object
	 *
	 * @return The string representation of this game
	 */
	public String toString() {
		StringBuilder build = new StringBuilder();
		build.append("Name: " + name + "\n");
		build.append("Platforms: " + getPlatforms() + "\n");
		build.append("Year: " + year);

		return build.toString();
	}

	/**
	 * Returns whether this game's year matches the search year
	 *
	 * @param y The year to search for
	 * @return Whether this game's year matches the parameter year
	 */
	public boolean matchesYear(int y) {
		return (year == y);
	}

	/**
	 * Returns whether one of this game's platforms matches the search platform
	 *
	 * @param p The platform to search for
	 * @return Whether one of this game's platforms matches the search platform
	 */
	public boolean matchesPlatform(String p) {
		for (int i = 0; i < platforms.length; i++) {
			if (platforms[i].trim().toLowerCase().indexOf(p.trim().toLowerCase()) >= 0) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Returns whether this game's name contains the search string
	 *
	 * @param str A search string (a piece of a name)
	 * @return Whether this game's name contains that search string
	 */
	public boolean matchesName(String str) {
		if (name.toLowerCase().indexOf(str.toLowerCase()) >= 0) {
			return true;
		}

		return false;
	}
}