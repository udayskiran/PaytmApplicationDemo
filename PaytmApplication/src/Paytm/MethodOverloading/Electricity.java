package Paytm.MethodOverloading;

import java.util.Scanner;

public class Electricity {

	public void getElectricity() {

		int upi = 4545;
		int blnc = 100000;
		String Ebill1 = "90109020EC";
		String Ebill2 = "96188694EC";
		String Ebill3 = "93904311EC";

		Scanner s = new Scanner(System.in);
		do {
			System.out.println("");
			System.out.println("Enter your Service Number :");
			String Number = s.next();
			if ((Number.equals(Ebill1)) || (Number.equals(Ebill2)) || (Number.equals(Ebill3))) {
				boolean isAunthecated = true;
				if (Number.equals(Ebill1)) {
					System.out.println("You have generated the bill of $395");
					System.out.println("For bill payment ,Please enter your Upi pin :");
					int upipin = s.nextInt();
					if (upipin == upi) {
						int avilBlnc = blnc - 395;
						System.out.println(
								"Electricity bill of $395 on Service number " + Ebill1 + " is successfully payed..");
						System.out.println("Available balance is $" + avilBlnc);
					} else {
						System.out.println("Incorrect Upi pin..!");
					}
				} else if (Number.equals(Ebill2)) {
					System.out.println("You have generated the bill of $456");
					System.out.println("For bill payment ,Please enter your Upi pin :");
					int upipin = s.nextInt();
					if (upipin == upi) {
						int avilBlnc = blnc - 456;
						System.out.println(
								"Electricity bill of $456 on Service number " + Ebill2 + " is successfully payed..");
						System.out.println("Available balance is $" + avilBlnc);
					} else {
						System.out.println("Incorrect Upi pin..!");
					}
				} else if (Number.equals(Ebill3)) {
					System.out.println("You have generated the bill of $969");
					System.out.println("For bill payment ,Please enter your Upi pin :");
					int upipin = s.nextInt();
					if (upipin == upi) {
						int avilBlnc = blnc - 969;
						System.out.println(
								"Electricity bill of $969 on Service number " + Ebill3 + " is successfully payed..");
						System.out.println("Available balance is $" + avilBlnc);
					} else {
						System.out.println("Incorrect Upi pin..!");
					}
				}
			} else {
				System.out.println("Invalid Service Number..! Please Re-enter :)");
			}
			break;
		} while (true);

	}
}
