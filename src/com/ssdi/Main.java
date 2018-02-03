package com.ssdi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		weapontype weapon = null;
		Role r = null;
		int sc;
		String s;

		Scanner scanner_in = new Scanner(System.in);
		System.out.println("Enter 1 for King 2 for Queen or 3 for Troll or 4 for Knight");
		sc = scanner_in.nextInt();

		if (sc == 1)
			r = new king();
		else if (sc == 2)
			r = new queen();
		else if (sc == 4)
			r = new knight();
		else if (sc == 3)
			r = new troll();
		else {
			System.out.println("Enter valid number. Enter 1 for King 2 for Queen or 3 for Troll or 4 for Knight");
			System.exit(0);
		}
		System.out.println(r.getpower() + "\n" + r.gettaunt());

		System.out.println("Want to assign weapon yes/no");

		if (scanner_in.next().equalsIgnoreCase("yes"))
			new Main().setWeaponType();

	}

	public void setWeaponType() {
		System.out.println("Enter K for Knife S for Sword A for Axe C for CrossBow");
		Scanner sc_scanner = new Scanner(System.in);
		String w = "";
		w = sc_scanner.next();
		weapontype weapon = null;
		if (w.equals("K"))
			weapon = new knife();
		else if (w.equals("S"))
			weapon = new sword();
		else if (w.equals("A"))
			weapon = new axe();
		else if (w.equals("C"))
			weapon = new crossbow();
		else
			System.out.println("Enter valid character. Enter K for Knife S for Sword A for Axe C for CrossBow");

		System.out.println(weapon.getweapontype() + " \nWeapon size is " + weapon.getsize());

		System.out.println("Want to assign weapon yes/no");

		if (sc_scanner.next().equalsIgnoreCase("yes"))
			new Main().setWeaponType();
		else
			System.exit(0);

	}

}
