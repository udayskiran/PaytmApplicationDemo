package Paytm.MethodOverloading;

import java.util.Scanner;

public class SendMoney {

	public void getMoney() {

		long Uday = 9390431131l;
		long Sai = 8328064012l;
		long Siva = 9010902091l;
		int blnc = 100000;
		int upi = 4545;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Mobile Number you want to send money :");
		long Mnumber = s.nextLong();
		if (Mnumber == Uday) {
			System.out.println("You are sending money to Uday Kiran..");
			System.out.println("Enter the amount you want to send :");
			int amount = s.nextInt();
			if (amount <= blnc) {
				int avilblnc = blnc - amount;
				System.out.println("Enter your Upi pin :");
				int upipin = s.nextInt();
				if (upipin == upi) {
					System.out.println("$" + amount + " is Succesfully sent to Uday Kiran..");
					System.out.println("Available balance is $" + avilblnc);
				} else {
					System.out.println("Incorrect Upi pin..!");
				}
			} else {
				System.out.println("Insufficient funds..!");
			}
		} else if (Mnumber == Sai) {
			System.out.println("You are sending money to Sai..");
			System.out.println("Enter the amount you want to send :");
			int amount = s.nextInt();
			if (amount <= blnc) {
				int avilblnc = blnc - amount;
				System.out.println("Enter your Upi pin :");
				int upipin = s.nextInt();
				if (upipin == upi) {
					System.out.println("$" + amount + " is Succesfully sent to Sai..");
					System.out.println("Available balance is $" + avilblnc);
				} else {
					System.out.println("Incorrect Upi pin..!");
				}
			} else {
				System.out.println("Insufficient funds..!");
			}
		} else if (Mnumber == Siva) {
			System.out.println("You are sending money to Siva..");
			System.out.println("Enter the amount you want to send :");
			int amount = s.nextInt();
			if (amount <= blnc) {
				int avilblnc = blnc - amount;
				System.out.println("Enter your Upi pin :");
				int upipin = s.nextInt();
				if (upipin == upi) {
					System.out.println("$" + amount + " is Succesfully sent to Siva..");
					System.out.println("Available balance is $" + avilblnc);
				} else {
					System.out.println("Incorrect Upi pin..!");
				}
			} else {
				System.out.println("Insufficient funds..!");
			}
		} else {
			System.out.println("You are sending money to the Number " + Mnumber);
			System.out.println("Enter the amount you want to send :");
			int amount = s.nextInt();
			if (amount <= blnc) {
				int avilblnc = blnc - amount;
				System.out.println("Enter your Upi pin :");
				int upipin = s.nextInt();
				if (upipin == upi) {
					System.out.println("$" + amount + " is Succesfully sent to the Number " + Mnumber);
					System.out.println("Available balance is $" + avilblnc);
				} else {
					System.out.println("Incorrect Upi pin..!");
				}
			} else {
				System.out.println("Insufficient funds..!");
			}
		}

	}

}
