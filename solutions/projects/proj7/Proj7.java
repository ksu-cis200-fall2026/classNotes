/**
 * Project 5 reads a file of video game information, and allows searching
 * on name, year, and platform.
 *
 * @author Julie Thornton
 * @version Project 7
 */

import java.util.*;
import java.io.*;

public class Proj7 {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);

		//gets the filename as a command-line argument

		if (args.length != 1) {
			System.out.println("Error: provide filename as a command-line argument");
			return;
		}

		String filename = args[0];
		Scanner inFile = new Scanner(new File(filename));

		int num = Integer.parseInt(inFile.nextLine());
		Game[] games = new Game[num];

		//skip the blank line
		inFile.nextLine();

		for (int i = 0; i < num; i++) {
			
			String name = inFile.nextLine().trim();
			int year = Integer.parseInt(inFile.nextLine());

			StringBuilder platforms = new StringBuilder();
			String onePlatform = inFile.nextLine().trim();
			do {
				platforms.append(onePlatform);
				platforms.append(",");

				if (inFile.hasNext()) {
					onePlatform = inFile.nextLine().trim();
				}
				else {
					onePlatform = "";
				}
			} while (onePlatform.length() > 0);

			games[i] = new Game(name, platforms.toString(), year);
		}
		inFile.close();

		char again = 'y';
		do {
			System.out.print("Enter (n)ame, (p)latform, (y)ear: ");
			char option = (s.nextLine().toLowerCase()).charAt(0);

			if (option == 'n') {
				System.out.print("Enter a game name or part of a name: ");
				String n = s.nextLine();
				System.out.println("\nMatching games: \n");
				for (int i = 0; i < games.length; i++) {
					if (games[i].matchesName(n)) {
						System.out.println(games[i]);
						System.out.println();
					}
				}
			}
			else if (option == 'p') {
				System.out.print("Enter a game platform: ");
				String p = s.nextLine();
				System.out.println("\nMatching games: \n");
				for (int i = 0; i < games.length; i++) {
					if (games[i].matchesPlatform(p)) {
						System.out.println(games[i]);
						System.out.println();
					}
				}
			}
			else if (option == 'y') {
				System.out.print("Enter a year: ");
				int y = Integer.parseInt(s.nextLine());
				System.out.println("\nMatching games: \n");
				for (int i = 0; i < games.length; i++) {
					if (games[i].matchesYear(y)) {
						System.out.println(games[i]);
						System.out.println();
					}
				}
			}

			System.out.print("Do you want to search again? (y/n) ");
			again = (s.nextLine().toLowerCase()).charAt(0);
		} while (again == 'y');
	}
}