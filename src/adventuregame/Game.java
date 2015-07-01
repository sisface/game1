package adventuregame;

import java.util.Scanner;
import java.util.Random;

public class Game {

	/**
	 * @param args
	 * @return
	 */
	public static void main(String[] args) {
		Boy boy;
		Pedo[] pedos = new Pedo[3];
		System.out
				.println("It is another lovely day at the daycare center.  The sun is shining, the birds are singing, and the bees are buzzing.");
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name, kid?");
		boy = new Boy(scan.nextLine());
		System.out.println("You are an innocent little boy, and your name is "
				+ boy.getName() + ".");
		System.out.println();
		System.out
				.println("Suddenly, a trio of dirty old NAMBLA members approaches!  They consult briefly with one another in hushed tones.  Then, one by one, they reach toward you.");
		System.out.println();
		System.out
				.println("You see a toy on the ground.  Wield it? (Press E to equip toy)");
		String userInput = scan.next();
		if(userInput.equalsIgnoreCase("E")) {
			boy.setHasWeapon(true);
			System.out.println("You pick up the toy to use as a weapon.");
		} else {
			System.out
			.println("You decide to do battle armed only with your naked fists.");
		}
		System.out.println();
		pedos[0] = new Pedo("Uncle Gary");
		pedos[1] = new Pedo("Lance");
		pedos[2] = new Pedo("Lester the Molester");
		for (int i = 0; i < pedos.length; i++) {
			String pedoWeapon;
			String[] weapon = { "a carrot", "a cucumber", "an eggplant",
					"a deli sausage", "something you are too young to identify" };
			Random rand = new Random();
			pedoWeapon = weapon[rand.nextInt(weapon.length)];
			System.out.println("NAMBLA member " + pedos[i].getName()
					+ " grins lecherously while wielding " + pedoWeapon
					+ ". Defend yourself!");
			System.out.println();
			while (pedos[i].getHp() >= 0) {
				boy.setHp(boy.getHp() - pedos[i].attack());
				int boyAttackDmg = boy.attack();
				System.out.println(boy.getName() + " whacks the pedo for " + boyAttackDmg
						+ " points of damage.  (Press Enter to continue)");
				try {
					System.in.read();
				} catch (Exception e) {
					e.printStackTrace();
					scan.close();
				}
				pedos[i].setHp(pedos[i].getHp() - boyAttackDmg);
			}
			System.out.println(pedos[i].getName()
					+ " is defeated! He slinks off dejectedly.");
			System.out.println();
		}
		System.out
				.println("All of the pedos are defeated.  You won't be molested today!");
		scan.close();
	}
}