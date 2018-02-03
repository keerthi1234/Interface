package com.ssdi;

public class axe implements weapontype {
	private String weapon = "weapon is axe";
	private double size = 2.0;

	@Override
	public String getweapontype() {
		// TODO Auto-generated method stub
		return weapon;
	}

	@Override
	public double getsize() {
		// TODO Auto-generated method stub
		return size;
	}

}
