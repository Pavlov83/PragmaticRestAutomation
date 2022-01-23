package homeWork1;

import java.util.Scanner;

public class Task4 {

    //Task-4 enter two numbers and display them in ascending order

    public static void main(String[] args) {
        System.out.println("Please enter first number");
        Scanner scan_1 = new Scanner(System.in);
        int num1 = scan_1.nextInt();
        System.out.println("Please enter first number");
        Scanner scan_2 = new Scanner(System.in);
        int num2 = scan_2.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " " + num2);
        }else{
            System.out.println(num2 + " " + num1);

        }
    }


}
