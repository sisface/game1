package adventuregame;

import java.util.Scanner;

public class Toy {
	public Toy(String nextLine) {
		}
	public String input;
	Scanner in = new Scanner(System.in);
	{
		for (boolean wieldToy = false; wieldToy == false;) {
			input = in.next();
			if (input.equalsIgnoreCase("E")) {
				wieldToy = true;
				System.out.println("You pick up the toy to use as a weapon.");
			} else if (!input.equalsIgnoreCase("E")) {
				System.out
						.println("You decide to do battle armed only with your naked fists.");
			}
		}
	}
}
