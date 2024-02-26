package com.demo.project;

public class DisplayAccount {
	 public static void displayAccounts() {
	        System.out.println("Accounts:");
	        for (Account account : TestMain.accounts) {
	            System.out.println(account);
	        }
	    }
}
