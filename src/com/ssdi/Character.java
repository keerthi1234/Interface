package com.ssdi;

public class Character {
	private String characterinstance;
	private weapontype currentweapon;
	private Role r;

	public Character(String characterInstance, weapontype currentweapon, Role r) {
		super();
		this.characterinstance = characterinstance;
		this.currentweapon = currentweapon;
		this.r = r;
	}

	public weapontype getcurrentweapon() {
		return currentweapon;
	}

	public Role getRole() {
		return r;
	}

}
