package com.demo.project;

import java.util.Random;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("If You Want to play Game then type Yes !!!!");
       String play=sc.next();
       
       while(play.equals("yes")) {
       Random rand = new Random();
       int randnum=rand.nextInt(100);
       
       int guess=-1;
       int tries=0;
       
       while(guess!=randnum) {
       System.out.println("Guess the Number Between 1 to 100");
       guess = sc.nextInt();
       tries++;
       
       if(guess==randnum) {
       System.out.println("Awesom! You Guessed the Number");
       System.out.println("It Only Took you "+tries+ "  guesses !.....");
       System.out.println("Would you like to play Again ? Yes or No ");
       play =sc.next().toLowerCase();
       }
       
       else if(guess>randnum)
    	   System.out.println("Your Guess is to High.try Again....");
       else
    	   System.out.println("Your Guess is to Low.try Again....");
       }
	}
}
}


