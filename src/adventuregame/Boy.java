package adventuregame;

import java.util.Random;
import java.util.Scanner;

public class Boy extends Character {
	private boolean _HasWeapon;
	public Boy(String name) {
		super(name);
		_HasWeapon = false;
	}
	public int attack() {
		Random rn = new Random();
		int n = 10 - 1 + 1;
		int i = rn.nextInt(n);
		int randomNum = 10 + i;
		if (_HasWeapon == true) {
		 randomNum = randomNum + 20;
		} 
		System.out.println(this.getName() + " whacks the pedo for " + randomNum
				+ " points of damage.  (Press Enter to continue)");
		System.out.println();
		Scanner in = new Scanner(System.in);
		try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
			in.close();
		}
		return randomNum;
	}
	public boolean getW() {
		return _HasWeapon;
	}
	public void setW(boolean hasweapon) {
		this._HasWeapon = hasweapon;
	}
}
