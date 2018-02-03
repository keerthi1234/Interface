package com.ssdi;

public class sword implements weapontype {
	private String weapon = "weapon is sword";
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
