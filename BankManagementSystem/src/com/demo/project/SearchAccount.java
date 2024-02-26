package com.demo.project;

import java.util.Scanner;

public class SearchAccount {
	 static Scanner scanner = new Scanner(System.in);
	 public static void searchAccount() {
	        System.out.println("1. Search by accno");
	        System.out.println("2. Search by name");

	        System.out.print("Enter your choice: ");
	        int searchChoice = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character

	        switch (searchChoice) {
	            case 1:
	                searchByAccNo(scanner);
	                break;
	            case 2:
	                searchByName(scanner);
	                break;
	            default:
	                System.out.println("Invalid choice. Please try again.");
	        }
	    }

	    private static void searchByAccNo(Scanner scanner) {
	        System.out.print("Enter account number to search: ");
	        int searchAccNo = scanner.nextInt();

	        for (Account account : TestMain.accounts) {
	            if (account.getAccNo() == searchAccNo) {
	                System.out.println("Account found: " + account);
	                return;
	            }
	        }

	        System.out.println("Account not found with the given account number.");
	    }

	    private static void searchByName(Scanner scanner) {
	        System.out.print("Enter account holder's name to search: ");
	        String searchName = scanner.nextLine();

	        for (Account account : TestMain.accounts) {
	            if (account.getName().equalsIgnoreCase(searchName)) {
	                System.out.println("Account found: " + account);
	                return;
	            }
	        }

	        System.out.println("Account not found with the given name.");
	    }

}
