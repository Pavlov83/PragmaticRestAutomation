package homeWork1;

import java.util.Scanner;

public class Task5 {

    /*
    Task-5 : Enter three numbers and display them in descending order
     */

    public static void main(String[] args) {
        System.out.println("Please enter first number");
        Scanner scan_1 = new Scanner(System.in);
        int num1 = scan_1.nextInt();

        System.out.println("Please enter second number");
        Scanner scan_2 = new Scanner(System.in);
        int num2 = scan_2.nextInt();

        System.out.println("Please enter third number");
        Scanner scan_3 = new Scanner(System.in);
        int num3 = scan_3.nextInt();


        if(num1 > num2 && num1 > num3){
            if(num3 > num2) {
                System.out.println(num1 + " " + num3 + " " + num2);
            }else{
                System.out.println(num1 + " " + num2 + " " + num3);
            }
        }

        if(num2 > num1 && num2 > num3){
            if(num1 > num3){
                System.out.println(num1 + " " + num1 + " " + num3);
            }else{
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        }

        if(num3 > num2 && num3 > num1){
            if(num2 > num1){
                System.out.println(num3 + " " + num2 + " " + num1);
            }else if(num1 > num2){
                System.out.println(num3 + " " + num1 + " " + num2);
            }
        }

    }
}