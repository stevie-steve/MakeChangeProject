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

		int leftoverTen = ten(changeInt, leftoverTwenty);

		int leftoverFive = five(changeInt, leftoverTen);

		int leftoverOne = one(changeInt, leftoverFive);

		int leftoverQuarter= quarter(changeInt, leftoverOne);
		 
		int leftoverDime= dime(changeInt, leftoverQuarter);
		
		int leftoverNickel= nickel(changeInt, leftoverDime);
		
		int leftoverPenny= penny(changeInt, leftoverNickel);

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
				if (tenInt==0) {
					System.out.print("");
					return leftoverTen;
				}
				else {
					System.out.print(tenInt + " Ten Dollar Bill, ");
					return leftoverTen;
				}
		} 
		else {
			return changeInt;
		}

	}

	public static int five(int changeInt, int leftoverTen) {
		if (leftoverTen != 0) {
			changeInt = leftoverTen;
			int fiveInt = changeInt / 500;
			int leftoverFive = changeInt % 500;
			if  (fiveInt==0) {
				System.out.print("");
				return leftoverFive;
			}
			else {
			System.out.print(fiveInt + " Five Dollar Bill, ");
			return leftoverFive;
			}
		} 
		else {
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
			}
			else {
				return changeInt;
			}
		} else {
			return changeInt;
		}

	}
	public static int quarter(int changeInt, int leftoverOne) {
		if (leftoverOne != 0) {
			changeInt = leftoverOne;
			int quarterInt = changeInt / 25;
			int leftoverQuarter = changeInt % 25;
			//System.out.println("leftoverquarter  " + leftoverQuarter + "quarterInt " + quarterInt);
			if (quarterInt >= 2) {
				System.out.print(quarterInt + " Quarters, ");
				return leftoverQuarter;
			}
			if (quarterInt == 1) {
				System.out.print(quarterInt + " One Quarter, ");
				return leftoverQuarter;
			}
			else {
				return changeInt;
			}
		} else {
			return changeInt;
		}

	}
	public static int dime(int changeInt, int leftoverQuarter) {
		if (leftoverQuarter != 0) {
			changeInt = leftoverQuarter;
			int dimeInt = changeInt / 10;
			int leftoverDime = changeInt % 10;
			//System.out.println("leftoverDime  " + leftoverQuarter + "quarterInt " + quarterInt);
			if (dimeInt >= 2) {
				System.out.print(dimeInt + " Dimes, ");
				return leftoverDime;
			}
			if (dimeInt == 1) {
				System.out.print(dimeInt + " One Dime, ");
				return leftoverDime;
			}
			else {
				return changeInt;
			}
		} 
		else {
			return changeInt;
		}
	}
	
	public static int nickel(int changeInt, int leftoverDime) {
		if (leftoverDime != 0) {
			changeInt = leftoverDime;
			int nickelInt = changeInt / 5;
			int leftoverNickel = changeInt % 5;
			//System.out.println("leftoverDime  " + leftoverQuarter + "quarterInt " + quarterInt);
			if (nickelInt >= 2) {
				System.out.print(nickelInt + " Nickels, ");
				return leftoverNickel;
			}
			if (nickelInt == 1) {
				System.out.print(nickelInt + " One Nickel, ");
				return leftoverNickel;
			}
			else {
				return changeInt;
			}
		} 
		else {
			return changeInt;
		}
	}
	public static int penny(int changeInt, int leftoverNickel) {
		if (leftoverNickel != 0) {
			changeInt = leftoverNickel;
			int pennyInt = changeInt / 1;
			int leftoverPenny = changeInt % 1;
			//System.out.println("leftoverDime  " + leftoverQuarter + "quarterInt " + quarterInt);
			if (pennyInt >= 2) {
				System.out.print(pennyInt + " Pennies, ");
				return leftoverPenny;
			}
			if (pennyInt == 1) {
				System.out.print(pennyInt + " One Penny, ");
				return leftoverPenny;
			}
			else {
				return changeInt;
			}
		} 
		else {
			return changeInt;
		}
	}
}

		
/*
 * 
 * 
 * 
 * }
 * 
 * public static int twenty(int changeInt) { if (changeInt >= 2000) { int
 * twentyInt = changeInt / 2000; int leftoverTwenty = changeInt % 2000; if
 * (twentyInt >= 2) { System.out.print(twentyInt + " Twenty Dollar Bills, ");
 * return leftoverTwenty; } else { System.out.print(twentyInt +
 * " Twenty Dollar Bill, "); return leftoverTwenty; }
 * 
 * } else { return 0; } }
 * 
 * public static int ten(int changeInt, int leftoverTwenty) { if
 * (changeInt<=leftoverTwenty) { if (changeInt < 1000) { int tenInt = changeInt
 * / 1000; int leftoverTen = changeInt%1000; if (tenInt>=2) {
 * System.out.print(tenInt + " Ten Dollar Billsx, "); return leftoverTen; } else
 * { System.out.print(tenInt + " Ten Dollar Billx, "); return leftoverTen; } }
 * else { return 0; } } else /{ if (leftoverTwenty >= 1000) { int tenInt =
 * leftoverTwenty / 1000; int leftoverTen = leftoverTwenty % 1000; if (tenInt >=
 * 2) { System.out.println(tenInt + " Ten Dollar Bills, "); return leftoverTen;
 * } else { System.out.println(tenInt + " Ten Dollar Bill, "); return
 * leftoverTen; }
 * 
 * } else { return 0; } } }
 * 
 * public static int five(int changeInt, int leftoverTen) { if
 * (changeInt<=leftoverTen) { if (changeInt < 500) { int fiveInt = changeInt /
 * 500; int leftoverFive = changeInt%500; if (fiveInt>=2) {
 * System.out.print(fiveInt + " five Dollar Billsx, "); return leftoverFive; }
 * else { System.out.print(fiveInt + " five Dollar Billx, "); return
 * leftoverFive; } } else { return 0; } } else{ if (leftoverTen >= 500) { int
 * fiveInt = leftoverTen / 500; int leftoverFive = leftoverTen % 500; if
 * (fiveInt >= 2) { System.out.print(fiveInt + " five Dollar Bills,"); return
 * leftoverFive; } else { System.out.print(fiveInt + " five Dollar Bill,");
 * return leftoverFive; }
 * 
 * } else { return 0; }
 * 
 * } }
 * 
 * 
 * 
 * 
 * }
 * 
 * /* if (price>paid) {
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
 * 
 * 
 * public static int ten(int changeInt, int leftoverTwenty) { if
 * (leftoverTwenty!=0) changeInt== leftoverTwenty) { if (changeInt < 1000) { int
 * tenInt = changeInt / 1000; int leftoverTen = changeInt%1000; if (tenInt>=2) {
 * System.out.print(tenInt + " Ten Dollar Billsx, "); return leftoverTen; } else
 * { System.out.print(tenInt + " Ten Dollar Billx, "); return leftoverTen; } }
 * else { return 0; } } else /{ if (leftoverTwenty >= 1000) { int tenInt =
 * leftoverTwenty / 1000; int leftoverTen = leftoverTwenty % 1000; if (tenInt >=
 * 2) { System.out.println(tenInt + " Ten Dollar Bills, "); return leftoverTen;
 * } else { System.out.println(tenInt + " Ten Dollar Bill, "); return
 * leftoverTen; }
 * 
 * } else { return 0; } } }
 * 
 * 
 * 
 */
