package Paytm.MethodOverloading;

import java.util.Scanner;

public class Recharge {

	public void getRecharge() {
		
		int blnc = 100000;
		int upi = 4545;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Mobile Number you want to Recharge :");
		long Mnumber=s.nextLong();
		System.out.println("Choose your network Carrier :");
		System.out.println("1. Jio");
		System.out.println("2. Airtel");
		System.out.println("3. Vi");
		int choose=s.nextInt();
		switch(choose) {
		case 1:
			System.out.println("Choose a Recharge plan below :");
			System.out.println("$739 Pack validity\r\n"
					+ "84 days\r\n"
					+ "Total Data\r\n"
					+ "126 GB\r\n"
					+ "Data at High Speed\r\n"
					+ "1.5 GB/day\r\n"
					+ "Voice\r\n"
					+ "Unlimited\r\n"
					+ "SMS\r\n"
					+ "100 SMS/day");
			System.out.println("");
			System.out.println("$299 Pack validity\r\n"
					+ "28 days\r\n"
					+ "Total data\r\n"
					+ "56 GB\r\n"
					+ "Data at high speed*\r\n"
					+ "2 GB/day\r\n"
					+ "Voice\r\n"
					+ "Unlimited\r\n"
					+ "SMS\r\n"
					+ "100 SMS/day");
			System.out.println("");
			System.out.println("$999 Pack validity\r\n"
					+ "365days\r\n"
					+ "Total data\r\n"
					+ "912.5 GB\r\n"
					+ "Data at high speed*\r\n"
					+ "2.5 GB/day\r\n"
					+ "Voice\r\n"
					+ "Unlimited\r\n"
					+ "SMS\r\n"
					+ "100 SMS/day");
			System.out.println("");
			System.out.println("Enter the recharge plan :");
			int select=s.nextInt();
			System.out.println("You have selected a Recharge plan of $"+select);
			switch(select) {
			case 739:
				System.out.println("");
				System.out.println("Enter Upi pin :");
				int upipin=s.nextInt();
				if(upipin==upi){
					System.out.println("Recharge Plan of $739 is Successful on Number "+Mnumber);
					int avilblnc=blnc-739;
					System.out.println("Available balance is "+avilblnc);
				}else {
					System.out.println("Incorrect Upi pin..!");
				}
				break;
			case 299:
				System.out.println("");
				System.out.println("Enter Upi pin :");
				int Upipin=s.nextInt();
				if(Upipin==upi){
					System.out.println("Recharge Plan of $299 is Successful on Number "+Mnumber);
					int avilblnc=blnc-299;
					System.out.println("Available balance is "+avilblnc);
				}else {
					System.out.println("Incorrect Upi pin..!");
				}
				break;
			case 999:
				System.out.println("");
				System.out.println("Enter Upi pin :");
				int upiPin=s.nextInt();
				if(upiPin==upi){
					System.out.println("Recharge Plan of $999 is Successful on Number "+Mnumber);
					int avilblnc=blnc-999;
					System.out.println("Available balance is "+avilblnc);
				}else {
					System.out.println("Incorrect Upi pin..!");
				}
				break;
			default:
				System.out.println("Invalid Recharge Plan..!");
			}
			break;
		case 2:
			System.out.println("Choose a Recharge plan below :");
			System.out.println("$799 Pack validity\r\n"
					+ "84 days\r\n"
					+ "Total Data\r\n"
					+ "126 GB\r\n"
					+ "Data at High Speed\r\n"
					+ "1.5 GB/day\r\n"
					+ "Voice\r\n"
					+ "Unlimited\r\n"
					+ "SMS\r\n"
					+ "100 SMS/day");
			System.out.println("");
			System.out.println("$365 Pack validity\r\n"
					+ "28 days\r\n"
					+ "Total data\r\n"
					+ "56 GB\r\n"
					+ "Data at high speed*\r\n"
					+ "2 GB/day\r\n"
					+ "Voice\r\n"
					+ "Unlimited\r\n"
					+ "SMS\r\n"
					+ "100 SMS/day");
			System.out.println("");
			System.out.println("$1129 Pack validity\r\n"
					+ "365days\r\n"
					+ "Total data\r\n"
					+ "912.5 GB\r\n"
					+ "Data at high speed*\r\n"
					+ "2.5 GB/day\r\n"
					+ "Voice\r\n"
					+ "Unlimited\r\n"
					+ "SMS\r\n"
					+ "100 SMS/day");
			System.out.println("");
			System.out.println("Enter the recharge plan :");
			
			int option=s.nextInt();
			System.out.println("You have selected a Recharge plan of $"+option);
			switch(option) {
			case 799:
				System.out.println("");
				System.out.println("Enter Upi pin :");
				int upipin=s.nextInt();
				if(upipin==upi){
					System.out.println("Recharge Plan of $799 is Successful on Number "+Mnumber);
					int avilblnc=blnc-799;
					System.out.println("Available balance is "+avilblnc);
				}else {
					System.out.println("Incorrect Upi pin..!");
				}
				break;
			case 365:
				System.out.println("");
				System.out.println("Enter Upi pin :");
				int Upipin=s.nextInt();
				if(Upipin==upi){
					System.out.println("Recharge Plan of $365 is Successful on Number "+Mnumber);
					int avilblnc=blnc-365;
					System.out.println("Available balance is "+avilblnc);
				}else {
					System.out.println("Incorrect Upi pin..!");
				}
				break;
			case 1129:
				System.out.println("");
				System.out.println("Enter Upi pin :");
				int upiPin=s.nextInt();
				if(upiPin==upi){
					System.out.println("Recharge Plan of $1129 is Successful on Number "+Mnumber);
					int avilblnc=blnc-1129;
					System.out.println("Available balance is "+avilblnc);
				}else {
					System.out.println("Incorrect Upi pin..!");
				}
				break;
			default:
				System.out.println("Invalid Recharge Plan..!");
			}
			break;
		case 3:
			System.out.println("Choose a Recharge plan below :");
			System.out.println("$769 Pack validity\r\n"
					+ "84 days\r\n"
					+ "Total Data\r\n"
					+ "126 GB\r\n"
					+ "Data at High Speed\r\n"
					+ "1.5 GB/day\r\n"
					+ "Voice\r\n"
					+ "Unlimited\r\n"
					+ "SMS\r\n"
					+ "100 SMS/day");
			System.out.println("");
			System.out.println("$309 Pack validity\r\n"
					+ "28 days\r\n"
					+ "Total data\r\n"
					+ "56 GB\r\n"
					+ "Data at high speed*\r\n"
					+ "2 GB/day\r\n"
					+ "Voice\r\n"
					+ "Unlimited\r\n"
					+ "SMS\r\n"
					+ "100 SMS/day");
			System.out.println("");
			System.out.println("$1029 Pack validity\r\n"
					+ "365days\r\n"
					+ "Total data\r\n"
					+ "912.5 GB\r\n"
					+ "Data at high speed*\r\n"
					+ "2.5 GB/day\r\n"
					+ "Voice\r\n"
					+ "Unlimited\r\n"
					+ "SMS\r\n"
					+ "100 SMS/day");
			System.out.println("");
			System.out.println("Enter the recharge plan :");
			int choice=s.nextInt();
			System.out.println("You have selected a Recharge plan of $"+choice);
			switch(choice) {
			case 769:
				System.out.println("");
				System.out.println("Enter Upi pin :");
				int upipin=s.nextInt();
				if(upipin==upi){
					System.out.println("Recharge Plan of $769 is Successful on Number "+Mnumber);
					int avilblnc=blnc-769;
					System.out.println("Available balance is "+avilblnc);
				}else {
					System.out.println("Incorrect Upi pin..!");
				}
				break;
			case 309:
				System.out.println("");
				System.out.println("Enter Upi pin :");
				int Upipin=s.nextInt();
				if(Upipin==upi){
					System.out.println("Recharge Plan of $309 is Successful on Number "+Mnumber);
					int avilblnc=blnc-309;
					System.out.println("Available balance is "+avilblnc);
				}else {
					System.out.println("Incorrect Upi pin..!");
				}
				break;
			case 1029:
				System.out.println("");
				System.out.println("Enter Upi pin :");
				int upiPin=s.nextInt();
				if(upiPin==upi){
					System.out.println("Recharge Plan of $1029 is Successful on Number "+Mnumber);
					int avilblnc=blnc-1029;
					System.out.println("Available balance is "+avilblnc);
				}else {
					System.out.println("Incorrect Upi pin..!");
				}
				break;
			default:
				System.out.println("Invalid Recharge Plan..!");
			}
			break;
		default:
			System.out.println("Invalid Carrier..!");
		}
	}

}
