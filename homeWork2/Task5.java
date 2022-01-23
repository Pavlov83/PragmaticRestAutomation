package homeWork2;

import java.util.Scanner;

public class Task5 {

    //Enter two numbers,print all numbers inbetween(ascending)

    public static void main(String[] args) {

        System.out.println("Please enter first number:");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();

        System.out.println("Please enter second number:");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();

        if (num1 < num2) {
            while (num1 <= num2) {
                System.out.println(num1);
                num1++;
            }
        } else {
            while (num2 <= num1) {
                System.out.println(num2);
                num2++;
            }

        }
    }
}
