package Paytm.MethodOverloading;

import java.util.Scanner;

public class PaytmDemo {
	
	public void money(SendMoney sm) {
		sm.getMoney();
	}

	public void money(Recharge rc) {
		rc.getRecharge();
	}

	public void money(BankAccount ba) {
		ba.getBankAccount();
	}

	public void money(Electricity ec) {
		ec.getElectricity();
	}

	public void money(Balance bc) {
		bc.getBalance();
	}


	public static void main(String[] args) {
		
		int pin=5050;
		PaytmDemo paytm = new PaytmDemo();
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("oo WELCOME TO PAYTM oo");
		System.out.println("Fastest payment app>>>");
		
		do {
			System.out.println("");
			System.out.println("Enter your Security pin :");
			int PinNumber=s.nextInt();
			if(PinNumber==pin) {
				boolean isAunthecated=true;
				break;
			}	
			else {
				System.out.println("Incorrect Security pin..! Please Try Again.");
			}
		}while(true);
		
		System.out.println("Choose one payment option :");
		System.out.println("1. Send Money to Contact");
		System.out.println("2. Recharge your number");
		System.out.println("3. Payment to Bank account");
		System.out.println("4. Electricity Bill Payment");
		System.out.println("5. Balance Enquiry");
		int option = s.nextInt();
		switch(option) {
		case 1:
			paytm.money(new SendMoney());
			break;
		case 2:
			paytm.money(new Recharge());
			break;
		case 3:
			paytm.money(new BankAccount());
			break;
		case 4:
			paytm.money(new Electricity());
			break;
		case 5:
			paytm.money(new Balance());
			break;
		default:
			System.out.println("Incorrect Payment option..!");
		}

		
		

	}

}
