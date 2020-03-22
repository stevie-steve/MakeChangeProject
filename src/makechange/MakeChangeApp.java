package makechange;

import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MakeChangeApp {

	private static DecimalFormat df = new DecimalFormat("0.00");

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
		double changeDouble = (paidDouble - priceDouble);

		if (priceDouble > paidDouble) {
			System.out.println("Amount: $" + df.format(priceDouble) + ", Tendered: $" + df.format(paidDouble));
			System.out.println("You did not pay enough to make the purchase. ");
		}

		if (priceDouble == paidDouble) {
			System.out.println("Amount: $" + df.format(priceDouble) + ", Tendered: $" + df.format(paidDouble));
			System.out.println("You paid the exact price for the purchase! No change is due. ");
		}

		if (priceDouble < paidDouble) {
			System.out.println("Amount: $" + df.format(priceDouble) + ", Tendered: $" + df.format(paidDouble));
			System.out.println("Your change Due is $" + df.format(changeDouble));

			int leftoverTwenty = twenty(changeInt);
			int leftoverTen = ten(changeInt, leftoverTwenty);
			int leftoverFive = five(changeInt, leftoverTen);
			int leftoverOne = one(changeInt, leftoverFive);
			int leftoverQuarter = quarter(changeInt, leftoverOne);
			int leftoverDime = dime(changeInt, leftoverQuarter);
			int leftoverNickel = nickel(changeInt, leftoverDime);
			int leftoverPenny = penny(changeInt, leftoverNickel);
			System.out.print(".");
			w.close();
		}

	}

	public static int twenty(int changeInt) {
		if (changeInt >= 2000) {
			int twentyInt = changeInt / 2000;
			int leftoverTwenty = changeInt % 2000;
			if (twentyInt >= 2) {
				System.out.print(twentyInt + " Twenty Dollar Bills, ");
				return leftoverTwenty;
			} else {
				System.out.print(twentyInt + " Twenty Dollar Bill, ");
				return leftoverTwenty;
			}

		} else {
			return changeInt;
		}
	}

	public static int ten(int changeInt, int leftoverTwenty) {
		if (leftoverTwenty != 0) {
			changeInt = leftoverTwenty;
			int tenInt = leftoverTwenty / 1000;
			int leftoverTen = leftoverTwenty % 1000;
			if (tenInt == 0) {
				System.out.print("");
				return leftoverTen;
			} else {
				System.out.print(tenInt + " Ten Dollar Bill, ");
				return leftoverTen;
			}
		} else {
			changeInt = 0;
			return changeInt;
		}
	}

	public static int five(int changeInt, int leftoverTen) {
		if (leftoverTen != 0) {
			changeInt = leftoverTen;
			int fiveInt = changeInt / 500;
			int leftoverFive = changeInt % 500;
			if (fiveInt == 0) {
				System.out.print("");
				return leftoverFive;
			} else {
				System.out.print(fiveInt + " Five Dollar Bill, ");
				return leftoverFive;
			}
		} else {
			changeInt = 0;
			return changeInt;
		}
	}

	public static int one(int changeInt, int leftoverFive) {
		if (leftoverFive != 0) {
			changeInt = leftoverFive;
			int oneInt = changeInt / 100;
			int leftoverOne = changeInt % 100;
			if (oneInt >= 2) {
				System.out.print(oneInt + " One Dollar Bills, ");
				return leftoverOne;
			}
			if (oneInt == 1) {
				System.out.print(oneInt + " One Dollar Bill, ");
				return leftoverOne;
			} else {
				return changeInt;
			}
		} else {
			changeInt = 0;
			return changeInt;
		}
	}

	public static int quarter(int changeInt, int leftoverOne) {
		if (leftoverOne != 0) {
			changeInt = leftoverOne;
			int quarterInt = changeInt / 25;
			int leftoverQuarter = changeInt % 25;
			if (quarterInt >= 2) {
				System.out.print(quarterInt + " Quarters, ");
				return leftoverQuarter;
			}
			if (quarterInt == 1) {
				System.out.print(quarterInt + " One Quarter, ");
				return leftoverQuarter;
			} else {
				return changeInt;
			}
		} else {
			changeInt = 0;
			return changeInt;
		}
	}

	public static int dime(int changeInt, int leftoverQuarter) {
		if (leftoverQuarter != 0) {
			changeInt = leftoverQuarter;
			int dimeInt = changeInt / 10;
			int leftoverDime = changeInt % 10;
			if (dimeInt >= 2) {
				System.out.print(dimeInt + " Dimes, ");
				return leftoverDime;
			}
			if (dimeInt == 1) {
				System.out.print(dimeInt + " One Dime, ");
				return leftoverDime;
			} else {
				return changeInt;
			}
		} else {
			changeInt = 0;
			return changeInt;
		}
	}

	public static int nickel(int changeInt, int leftoverDime) {
		if (leftoverDime != 0) {
			changeInt = leftoverDime;
			int nickelInt = changeInt / 5;
			int leftoverNickel = changeInt % 5;
			if (nickelInt >= 2) {
				System.out.print(nickelInt + " Nickels, ");
				return leftoverNickel;
			}
			if (nickelInt == 1) {
				System.out.print(nickelInt + " One Nickel, ");
				return leftoverNickel;
			} else {
				return changeInt;
			}
		} else {
			changeInt = 0;
			return changeInt;
		}
	}

	public static int penny(int changeInt, int leftoverNickel) {
		if (leftoverNickel != 0) {
			changeInt = leftoverNickel;
			int pennyInt = changeInt;
			int leftoverPenny = changeInt;
			if (pennyInt >= 2) {
				System.out.print(pennyInt + " Pennies");
				return leftoverPenny;
			}
			if (pennyInt == 1) {
				System.out.print(pennyInt + " One Penny");
				return leftoverPenny;
			} else {
				return 0;
			}
		} else {
			return 0;
		}
	}
}
