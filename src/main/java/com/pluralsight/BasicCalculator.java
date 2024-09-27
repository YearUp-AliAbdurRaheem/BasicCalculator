package com.pluralsight;
import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        // Instantiate scanner
        Scanner myScanner = new Scanner(System.in);

        // Asking user for 2 numbers
        System.out.print("Enter the first number: ");
        int firstNum = myScanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = myScanner.nextInt();

        // Getting operation from user
        System.out.print("""
Possible calculations:
  (A)dd
  (S)ubtract
  (M)ultiply
  (D)ivide
Please select an option:""" + ' ');

        String operation = myScanner.next();
        String answer;

        // Switch case to perform the calculation
        switch (operation) {
            case "a":
            case "A":
                answer = String.valueOf(firstNum + secondNum);
                break;

            case "s":
            case "S":
                answer = String.valueOf(firstNum - secondNum);
                break;

            case "m":
            case "M":
                answer = String.valueOf(firstNum * secondNum);
                break;

            case "d":
            case "D":
                if (secondNum != 0) { //dont divide by zero
                    answer = String.valueOf((float) firstNum / secondNum);
                } else {
                    answer = "Cannot divide by zero!";
                }
                break;

            default:
                answer = "Invalid Input!";
                break;
        }

        System.out.println("The answer is: " + answer);

    }
}