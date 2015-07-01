package adventuregame;

import java.util.Random;

public class Boy extends Character {
	private boolean _hasWeapon;

	public Boy(String name) {
		super(name);
		_hasWeapon = false;
	}
	public int attack() {
		Random rn = new Random();
		int randomNum = rn.nextInt(10) + 11;
		if (_hasWeapon) {
			randomNum = randomNum + 20;
		}
		return randomNum;
	}
	public boolean getHasWeapon() {
		return _hasWeapon;
	}
	public void setHasWeapon(boolean hasWeapon) {
		this._hasWeapon = hasWeapon;
	}
}
