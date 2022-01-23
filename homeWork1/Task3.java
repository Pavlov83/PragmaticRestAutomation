package homeWork1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Task - 3 ,enter two values and change their number

        System.out.println("Please enter number A");
        Scanner scan_1 = new Scanner(System.in);
        String A = scan_1.next();
        System.out.println("Please enter second number B");
        Scanner scan_2 = new Scanner(System.in);
        String B = scan_2.next();


        System.out.println("The switched values are number A: " + B + " number B: " + A);
    }

}
