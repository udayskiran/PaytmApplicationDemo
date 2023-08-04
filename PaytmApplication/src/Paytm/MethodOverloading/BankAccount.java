package Paytm.MethodOverloading;

import java.util.Scanner;

public class BankAccount {

	public void getBankAccount() {

		Scanner s = new Scanner(System.in);
		int upi = 4545;
		int Balance = 100000;
		System.out.println("Enter Bank Account Number you want to transfer :");
		long Acc1 = s.nextLong();
		System.out.println("ReEnter Bank Account Number :");
		long Acc2 = s.nextLong();
		if (Acc1 == Acc2) {
			System.out.println("Enter the Money you want to transfer :");
			int Money = s.nextInt();
			if (Money <= Balance) {
				System.out.println("Enter your UPI Number :");
				int UpiNo = s.nextInt();
				if (UpiNo == upi) {
					int AvailBal = Balance - Money;
					System.out.println("$" + Money + " is Successfully Tranfered to Account Number "+ Acc1);
					System.out.println("Remaining balance is $" + AvailBal);
				} else {
					System.out.println("Incorrect UPI Number..!");
				}
			} else {
				System.out.println("Insufficient funds..!");
			}
		} else {
			System.out.println("Account Numbers mismatched..!");
		}

	}

}
