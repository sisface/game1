package adventuregame;

import java.util.Random;

public class Pedo extends Character {

	public Pedo(String name) {
		super(name);
	}
	public int attack() {
		Random rn = new Random();
		int randomNum = rn.nextInt(5) + 1;
		System.out.println(this.getName()
				+ " delivers a tickle attack while grinning for " + randomNum
				+ " points of damage.");
		System.out.println();
		return randomNum;
	}
}
