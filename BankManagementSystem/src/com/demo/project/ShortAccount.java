package com.demo.project;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ShortAccount {
	 static Scanner scanner = new Scanner(System.in);
	 
	 static void sortAccount() {
	        System.out.println("1. Sort by accno");
	        System.out.println("2. Sort by name");
	        System.out.println("3. Sort by balance");

	        System.out.print("Enter your choice: ");
	        int sortChoice = scanner.nextInt();

	        switch (sortChoice) {
	            case 1:
	                Collections.sort(TestMain.accounts, Comparator.comparingInt(Account::getAccNo));
	                break;
	            case 2:
	                Collections.sort(TestMain.accounts, Comparator.comparing(Account::getName));
	                break;
	            case 3:
	                Collections.sort(TestMain.accounts, Comparator.comparingDouble(Account::getBalance));
	                break;
	            default:
	                System.out.println("Invalid choice. Please try again.");
	                return;
	        }

	        System.out.println("Accounts sorted successfully.");
	        DisplayAccount.displayAccounts();
	    }

}
