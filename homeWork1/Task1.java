package homeWork1;

import java.util.Scanner;

public class Task1 {

    /*
    Task1: Display  messages,then read the user input(a,b,c).Execute
    chek if c is between a and b
     */


    public static void main(String[] args) {

        System.out.println("Hello, please enter your first number - a!");
        Scanner scan_a = new Scanner(System.in);
        double a = scan_a.nextDouble();
        System.out.println("Hello, please enter your second number - b!");
        Scanner scan_b = new Scanner(System.in);
        double b = scan_b.nextDouble();
        System.out.println("Hello, please enter your third number - c!");
        Scanner scan_c = new Scanner(System.in);
        double c = scan_b.nextDouble();

        if(c > a && c < b){
            System.out.println("Third number - c is between a and b");
        }else{
            System.out.println("Third number c is not between a and b");
        }



    }



}
