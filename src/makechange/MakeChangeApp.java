package makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {

		Scanner w = new Scanner(System.in);

		System.out.print("What is the price of the item?: $");
		double priceDouble = w.nextDouble();
		int priceInt = (int) (priceDouble * 100);

		System.out.println();
		System.out.print("How much did the customer give for a payment? $");
		double paidDouble = w.nextDouble();
		int paidInt = (int) (paidDouble * 100);
		int changeInt = (paidInt - priceInt);
		System.out.println("This is the change in Int: $" + changeInt);

		int leftoverTwenty = twenty(changeInt);
		//System.out.print("leftover twenty " + leftoverTwenty);// the mod if the change strsted off with a $20

		int leftoverTen = ten(changeInt, leftoverTwenty);
		//System.out.print("leftover ten " + leftoverTen);

	}

	public static int twenty(int changeInt) {
		if (changeInt >= 2000) {
			int twentyInt = changeInt / 2000;
			int leftoverTwenty = changeInt % 2000;
			// System.out.println(leftover);
			//System.out.println("twentyInt " + twentyInt);
			// double twentyDouble = (double) (twentyInt);
			if (twentyInt >= 2) {
				System.out.print(twentyInt + " Twenty Dollar Bills ");

				return leftoverTwenty;
			} else {
				System.out.print(twentyInt + " Twenty Dollar Bill ");
				return leftoverTwenty;
			}

		} else {
			return 0;
		}
	}

	public static int ten(int changeInt, int leftoverTwenty) {
			if (changeInt<=leftoverTwenty) {
				if (changeInt >= 1000) {
					int tenInt = changeInt / 1000;
					int leftoverTen = changeInt%1000;
					if (tenInt>=2) {
						 System.out.print(tenInt + " Ten Dollar Billsx ");
						 return leftoverTen;
					}
					else {
						System.out.print(tenInt + " Ten Dollar Billx ");
						return leftoverTen;
					}
				}
				else {
					return 0;
				}
			}
			else /*(changeInt<leftoverTwenty)*/{
				if (leftoverTwenty >= 1000) {
					int tenInt = leftoverTwenty / 1000;
					int leftoverTen = leftoverTwenty % 1000;
					if (tenInt >= 2) {
						System.out.println(tenInt + " Ten Dollar Bills");
						return leftoverTen;
					} else {
						System.out.println(tenInt + " Ten Dollar Bill");
						return leftoverTen;
					}
		
				} else {
					return 0;
				}
			}
	}

	/*
	 * if (price>paid) {
	 * System.out.println(" You did not pay enough to make the purchase. "); } if
	 * (price == paid) { System.out.
	 * println("You paid the exact price for the purchase! No change is due. "); }
	 * if (price < paid) { System.out.println(""); }
	 */

	/*
	 * public static int change (int changeInt) {
	 * 
	 * 
	 * else if{
	 * 
	 * }
	 * 
	 * } if (changeInt % 1000 == 0) {
	 * 
	 * } if (changeInt % 500 == 0) {
	 * 
	 * } if (changeInt % 100 == 0) {
	 * 
	 * } if (changeInt % 25 == 0) {
	 * 
	 * }
	 */

}
