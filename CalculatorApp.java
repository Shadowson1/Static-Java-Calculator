package com.mycompany.softwaredevl1.JavaFundamentalsQuiz;

import java.util.Scanner;

/**
 *
 * @author aws.admin
 */
public class CalculatorApp {
     public static void main(String[] args) {
         float num1, num2;
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter a number:");
         num1 = sc.nextFloat();
         
         System.out.println("Enter a number:");
         num2 = sc.nextFloat();
         
         System.out.println("Enter a operator (+,-,*,/):");
         
         char operator = sc.next().charAt(0);
         float result = 0;
         
         if (operator == '+') {
             result = num1 + num2;
         } else if (operator == '-') {
             result = num1 - num2;
         } else if (operator == '*') {
             result = num1 * num2;
         } else if (operator == '/') {
             result = num1 / num2;
         } else {
            System.out.println("Invalid operator");
            System.exit(0);
         }
         System.out.println("Result:" + result);
     }
}
