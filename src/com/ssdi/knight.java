package com.ssdi;

public class knight implements Role {
	private String power = "Role is Knight";
	private String taunt = "knight fights enemy";

	@Override
	public String getpower() {
		// TODO Auto-generated method stub
		return power;
	}

	@Override
	public String gettaunt() {
		// TODO Auto-generated method stub
		return taunt;
	}

}
