package MakeChange;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		// Prompt user for item price.

		System.out.println("Welcome to my store!!!");
		System.out.print("What does your item total come to?  ");
		double itemCost = kb.nextDouble();
		// Prompt user for money given.

		System.out.print("How much are you giving me?  ");
		double userCash = kb.nextDouble();
		kb.nextLine();

		// Display amount given or error message if not given enough.

		if (userCash < itemCost) {
			do {
				System.out.println("Hey! This isn't enough money!! ");
				System.out.print("How much more are you giving me? ");
				double userCash2 = kb.nextDouble();
				kb.nextLine();
				userCash = userCash + userCash2;

			} while (itemCost > userCash);
		}
		if (itemCost <= userCash) {
			System.out.printf("You gave me $  %.2f Thank you!\n", userCash);
		}
		if (itemCost == userCash) {
			System.out.println("You gave me exact change thank you!!");
		}
		if (itemCost != userCash) {
			System.out.println("Your change is...");
		}
		userCash += 0.005;
		kb.close();
		// Display change and bills given DO NOT display what's not given.

		double change = userCash - itemCost;

		int bill20 = 0;
		int bill10 = 0;
		int bill5 = 0;
		int bill1 = 0;
		int coin25 = 0;
		int coin10 = 0;
		int coin5 = 0;
		int coin1 = 0;

		if (change / 20 > 0) {
			bill20 = (int) change / 20;
			change = change % 20;
			if (bill20 == 1) {
				System.out.println(bill20 + " Twenty dolllar bill");
			} else if (bill20 > 1) {
				System.out.println(bill20 + " Twenty dolllar bills");
			}
		}

		if (change / 10 > 0) {
			bill10 = (int) change / 10;
			change = change % 10;
			if (bill10 == 1) {
				System.out.println(bill10 + " Ten dolllar bill");
			} else if (bill10 > 1) {
				System.out.println(bill10 + " Ten dolllar bills");
			}
		}
		if (change / 5 > 0) {
			bill5 = (int) change / 5;
			change = change % 5;
			if (bill5 == 1) {
				System.out.println(bill5 + " Five dolllar bills");
			} else if (bill5 > 1) {
				System.out.println(bill5 + " Five dolllar bills");
			}
		}
		if (change / 1 > 0) {
			bill1 = (int) change / 1;
			change = change % 1;
			if (bill1 == 1) {
				System.out.println(bill1 + " One dollar bill");
			} else if (bill1 > 1) {
				System.out.println(bill1 + " One dolllar bills");
			}
		}
		if (change / 0.25 > 0) {
			coin25 = (int) (change / 0.25);
			change = change % 0.25;
			if (coin25 == 1) {
				System.out.println(coin25 + " Quarter");
			} else if (coin25 > 1) {
				System.out.println(coin25 + " Quarters");
			}
		}
		if (change / 0.10 > 0) {
			coin10 = (int) (change / 0.10);
			change = change % 0.10;
			if (coin10 == 1) {
				System.out.println(coin10 + " Dime");
			} else if (coin10 > 1) {
				System.out.println(coin10 + " Dimes");
			}
		}
		if (change / 0.05 > 0) {
			coin5 = (int) (change / 0.05);
			change = change % 0.05;
			if (coin5 == 1) {
				System.out.println(coin5 + " Nickel");
			} else if (coin5 > 1) {
				System.out.println(coin5 + " Nickels");
			}
		}
		if (change / 0.01 > 0) {
			coin1 = (int) (change / 0.01);
			change = change % 0.01;
			if (coin1 == 1) {
				System.out.println(coin1 + " Penny");
			} else if (coin1 > 1) {
				System.out.println(coin1 + " Pennies");
			}
		}System.out.println("Have a nice day!!!");

	}

}
