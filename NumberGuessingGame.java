package com.ma;

import java.util.Random;

import java.util.Scanner;

            public class NumberGuessingGame {
	
            public static void main(String[] args){
            	System.out.println("Enter to the game");
			Scanner scanner = new Scanner(System.in);
			Random random = new Random();
			
			int lowestNumber = 1;
			int highestNumber =100;
			int numberToGuess = random.nextInt(highestNumber - lowestNumber + 1)+ lowestNumber;
			int attempts=0;
			
			System.out.println("Welcome to the Number Guessing Game!");
			
			System.out.println("I've selected a number between" + lowestNumber + "and" + highestNumber +".Try to guess it!");
			
			while (true) {
				System.out.print("Enter your guess:");
				
				int userGuess = scanner.nextInt();
				attempts++;
				if (userGuess<lowestNumber || userGuess>highestNumber){
				
			}
			
			else if (userGuess<numberToGuess) {
				System.out.println("Too low.");
			}
			
			else if (userGuess>numberToGuess) {
				System.out.println("Too high.");
			}
			
			else {
				System.out.println("Congratulations! You've guessed the number" + "numberToguess" + "in"+ attempts + "attempts.");
				break;
			}
		}
		scanner.close();

	}


}
