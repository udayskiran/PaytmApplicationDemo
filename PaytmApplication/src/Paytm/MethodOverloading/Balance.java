package Paytm.MethodOverloading;

import java.util.Scanner;

public class Balance {

	public void getBalance() {

		int upi = 4545;
		int blnc = 100000;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any two digit number :");
		int Number = s.nextInt();
		if ((Number >= 10) && (Number < 100)) {
			System.out.println("Enter your Upi pin :");
			int upipin = s.nextInt();
			if (upipin == upi) {
				System.out.println("Available balance is " + blnc);
			} else {
				System.out.println("Incorrect Upi pin..!");
			}
		} else {
			System.out.println("Invalid number..!");
		}

	}

}
