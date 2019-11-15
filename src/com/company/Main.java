package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write a program that takes in 5 numbers and prints out the smallest largest and the average of the 5 numbers.

        int smallest = 0;
        int largest = 0;
        double average = 0;
        int total = 0;

        Scanner userinput = new Scanner (System.in);

        System.out.println("5 Number problem");
        System.out.println("");

        // ask for 5 numbers
        System.out.println("Please enter 5 numbers:");
        int [] guesses = new int [5];

        // loop to accept the numbers from the user and input them in the array
        for (int i = 0; i < guesses.length; i++){
            System.out.print("Enter number " + (i+1) + ": ");
            guesses[i] = userinput.nextInt();
            if( i == 0){    // if its the first number entered the smallest and largest are set
                smallest = guesses[i];
                largest = guesses[i];
            }
            total += guesses[i];
            if(guesses[i] < smallest){ // checks and sets the smallest
                smallest = guesses[i];
            }
            if(guesses[i] > largest){  // check and set largest
                largest = guesses[i];
            }
        }
        average = total / guesses.length; // calculates the average

        System.out.println("The smallest number is " + smallest);
        System.out.println("The largest number is " + largest);
        System.out.println("The average of the numbers you entered is " + average);

    }


}
