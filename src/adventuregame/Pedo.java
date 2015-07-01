package adventuregame;

import java.util.Random;

public class Pedo extends Character {
	private int randomNum;

	public Pedo(String name) {
		super(name);
	}
	public int attack() {
		Random rn = new Random();
		int n = 5 - 1 + 1;
		int i = rn.nextInt(n);
		randomNum = 1 + i;
		System.out.println(this.getName()
				+ " delivers a tickle attack while grinning for " + randomNum
				+ " points of damage.");
		System.out.println();
		return randomNum;
	}
}
