package pekan6_2511532011;

import java.util.Scanner;

public class doWhile1_2511532011 {
	public static void main(String [] args) {
		Scanner console = new Scanner(System.in);
		String phrase;
		do {
			System.out.print("Input Password: ");
			phrase = console.nextLine();
		} while (!phrase.equals("abcd"));
	}
}
