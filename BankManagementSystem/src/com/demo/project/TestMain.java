package com.demo.project;


import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {


    static ArrayList<Account> accounts = new ArrayList<>();

    public static void main(String[] args) {
    	FileInputOutput.loadAccountsFromFile();

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Add new Account");
            System.out.println("2. Search Account");
            System.out.println("3. Sort Account");
            System.out.println("4. Transaction");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                	AddNewAccount.addNewAccount();
                    break;
                case 2:
                	SearchAccount.searchAccount();
                    break;
                case 3:
                	ShortAccount.sortAccount();
                    break;
                case 4:
                	PerformTransaction.performTransaction();
                    break;
                case 5:
                	FileInputOutput.saveAccountsToFile();
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);
    }
    
}
