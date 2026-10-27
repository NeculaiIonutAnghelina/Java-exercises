package com.amigoscode._1_beginners._1_thebasics;

import java.util.Scanner;

/**
 * Mini Project: Simple Calculator
 *
 * Put together everything you have learned so far to build a simple calculator.
 * The calculator should display a menu, read the user's choice and two numbers,
 * perform the chosen operation, and print the result.
 */
public class MiniProject {

    public static void main(String[] args) {

        // TODO: 1 - Create a Scanner for user input
        Scanner scanner =  new Scanner(System.in);





        // TODO: 2 - Display a menu with the following options:
        // Print:
        //   "=== Simple Calculator ==="
        //   "1. Add"
        //   "2. Subtract"
        //   "3. Multiply"
        //   "4. Divide"
        //   "Choose an operation (1-4): "

        System.out.println("===Simple Calculator===");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        // TODO: 3 - Read the user's choice into an int variable

        System.out.print("Choose an operation (1-4): ");
        int choice =  scanner.nextInt();
        // I  use if because if you enter 5 would still work - and to be honest i was unsure if i want to stop or go again from start - i could use the do-while  to make to start again but the requirements doesn't ask for it.
        if (choice<1 || choice>4){
            System.out.println("Invalid choice");
            return;
        }

        // TODO: 4 - Prompt and read two double numbers from the user
        // Print "Enter first number: " and read it.
        // Print "Enter second number: " and read it.

        System.out.println("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        // TODO: 5 - Use a switch statement to perform the chosen operation and print the result
        // Case 1: Print "Result: " + (num1 + num2)
        // Case 2: Print "Result: " + (num1 - num2)
        // Case 3: Print "Result: " + (num1 * num2)
        // Case 4: Perform division (but handle division by zero first - see TODO 6)
        // Default: Print "Invalid choice"

        switch (choice) {
            case 1:
                System.out.println("Result: " + (firstNumber + secondNumber));
                break;
            case 2:
                System.out.println("Result: " + (firstNumber - secondNumber));
                break;
            case 3:
                System.out.println("Result: " + (firstNumber * secondNumber));
                break;
            case 4:
                if (secondNumber ==0){
                    System.out.println("Error : Cannot divide by zero");
                }else {
                    System.out.println("Result: " + (firstNumber / secondNumber));
                }
                break;
            default:
                System.out.println("Invalid choice");
        }


        // TODO: 6 - Inside case 4, handle division by zero with an if statement
        // If the second number is 0, print "Error: Cannot divide by zero"
        // Otherwise, print the result of the division

    }
}
