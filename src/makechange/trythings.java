
package makechange;

import java.util.Scanner;

public class trythings {

	public static void main(String[] args) {

		Scanner w = new Scanner(System.in);
		/*
		 * int leftoverTwenty=0; int leftoverTen = 0; int leftoverFive=0;
		 */

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

		int  leftoverTen = ten(changeInt, leftoverTwenty);
		//System.out.print("leftover ten " + leftoverTen);
		
		int leftoverFive= five(changeInt, leftoverTen);

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
			if (leftoverTwenty!=0) {
				changeInt=leftoverTwenty;
				int tenInt = leftoverTwenty / 1000;
				int leftoverTen = leftoverTwenty % 1000;
					System.out.print(tenInt + " Ten Dollar Bill, ");
					return leftoverTen;
			}				
			else{
				return changeInt; 
			}
	
	}
	public static int five(int changeInt, int leftoverTen) {
		if (leftoverTen!=0) {
			changeInt= leftoverTen;
				int fiveInt = changeInt / 500;
				int leftoverFive = changeInt%500;
				System.out.print(fiveInt + " Five Dollar Bill, ");
				return leftoverFive;
			}
			else {
				return changeInt;
			}
	}
}
			
				
			
			
			/*(changeInt<leftoverTwenty)*/
				/*	if (leftoverTen >= 500) {
						int fiveInt = leftoverTen / 500;
						int leftoverFive = leftoverTen % 500;
						if (fiveInt >= 2) {
							System.out.print(fiveInt + " five Dollar Bills,");
							return leftoverFive;
						} else {
							System.out.print(fiveInt + " five Dollar Bill,");
							return leftoverFive;
						}
			
					} else {
						return 0;
					}
			
				}
			}
*/
	
	
	
	
	

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
