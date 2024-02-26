package com.demo.project;

import java.util.Scanner;

public class PerformTransaction {
	 static Scanner scanner = new Scanner(System.in);
	 
	  public static void performTransaction() {
	        System.out.println("1. Transfer");
	        System.out.println("2. Add money to account");
	        System.out.println("3. Withdraw");

	        System.out.print("Enter your choice: ");
	        int transactionChoice = scanner.nextInt();

	        switch (transactionChoice) {
	            case 1:
	                transfer();
	                break;
	            case 2:
	                addMoney();
	                break;
	            case 3:
	                withdraw();
	                break;
	            default:
	                System.out.println("Invalid choice. Please try again.");
	        }
	    }
	 
	 private static void transfer() {
	        System.out.print("Enter sender's account number: ");
	        int senderAccNo = scanner.nextInt();
	        System.out.print("Enter receiver's account number: ");
	        int receiverAccNo = scanner.nextInt();
	        System.out.print("Enter transfer amount: ");
	        double amount = scanner.nextDouble();

	        Account sender = findAccountByAccNo(senderAccNo);
	        Account receiver = findAccountByAccNo(receiverAccNo);

	        if (sender != null && receiver != null && sender.getBalance() >= amount) {
	            sender.setBalance(sender.getBalance() - amount);
	            receiver.setBalance(receiver.getBalance() + amount);
	            System.out.println("Transfer successful.");
	        } else {
	            System.out.println("Transfer failed. Please check account numbers and balance.");
	        }
	    }

	    private static void addMoney() {
	        System.out.print("Enter account number: ");
	        int accNo = scanner.nextInt();
	        System.out.print("Enter amount to add: ");
	        double amount = scanner.nextDouble();

	        Account account = findAccountByAccNo(accNo);

	        if (account != null) {
	            account.setBalance(account.getBalance() + amount);
	            System.out.println("Money added successfully.");
	        } else {
	            System.out.println("Account not found with the given account number.");
	        }
	    }

	    private static void withdraw() {
	        System.out.print("Enter account number: ");
	        int accNo = scanner.nextInt();
	        System.out.print("Enter amount to withdraw: ");
	        double amount = scanner.nextDouble();

	        Account account = findAccountByAccNo(accNo);

	        if (account != null && account.getBalance() >= amount) {
	            account.setBalance(account.getBalance() - amount);
	            System.out.println("Withdrawal successful.");
	        } else {
	            System.out.println("Withdrawal failed. Please check account number and balance.");
	        }
	    }

	    
	    private static Account findAccountByAccNo(int accNo) {
	        for (Account account : TestMain.accounts) {
	            if (account.getAccNo() == accNo) {
	                return account;
	            }
	        }
	        return null;
	    }
}
