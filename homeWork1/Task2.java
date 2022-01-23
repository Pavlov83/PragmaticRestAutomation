package homeWork1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        /*
        Enter two different integers,display their sum,difference,derivative,
        remainder
         */

        System.out.println("Please select first number");
        Scanner scan_1 = new Scanner(System.in);
        int num1 = scan_1.nextInt();

        System.out.println("Please select first number");
        Scanner scan_2 = new Scanner(System.in);
        int num2 = scan_2.nextInt();

        System.out.println("The sum of first and second number is: " +  (num1 + num2));
        System.out.println("The difference of first and second number is: " +  (num1 - num2));
        System.out.println("The derivative of first and second number is: " +  (num1 / num2));
        System.out.println("The remainder of first and second number is: " +  (num1 % num2));

        //Same example with floatitng point numbers

//    System.out.println("Please select first number");
//    Scanner scan_3 = new Scanner(System.in);
//    Float num3 = scan_3.nextFloat();
//
//    System.out.println("Please select first number");
//    Scanner scan_4 = new Scanner(System.in);
//    Float num4 = scan_4.nextFloat();
//
//    System.out.println("The sum of first and second number is: " +  (num1 + num2));
//    System.out.println("The difference of first and second number is: " +  (num1 - num2));
//    System.out.println("The derivative of first and second number is: " +  (num1 / num2));
//    System.out.println("The remainder of first and second number is: " +  (num1 % num2));

    }

}
