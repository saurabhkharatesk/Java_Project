package com.demo.project;

import java.util.Scanner;

public class AddNewAccount {
     static Scanner scanner = new Scanner(System.in);
	 public static void addNewAccount() {
	        System.out.print("Enter account number: ");
	        int accNo = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character

	        System.out.print("Enter account holder's name: ");
	        String name = scanner.nextLine();
               
	        System.out.print("Enter Adhar Number: ");
	        String adharNo = scanner.nextLine();
	        
	        System.out.print("Enter Mobile Number: ");
	        String mobileNo = scanner.nextLine();
	        
	        System.out.print("Enter initial balance: ");
	        double balance = scanner.nextDouble();

	        Account newAccount = new Account(accNo, name, mobileNo, adharNo, balance);
	        TestMain.accounts.add(newAccount);

	        System.out.println("Account added successfully.");
	    }

	
}
