package adventuregame;

abstract class Character {
	private String _name;
	private int _hp;

	public Character(String name) {
		this.setName(name);
		this.setHp(100);
	}
	public abstract int attack();
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		this._name = name;
	}
	public int getHp() {
		return _hp;
	}
	public void setHp(int hp) {
		this._hp = hp;
	}
}
