package homeWork2;

import java.util.Scanner;

public class Task6 {

    //enter a number, print the sum of all numbers between 1 and the number
    public static void main(String[] args) {


        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int counter = 0;
        for(int i = num;i >= 1;i--){
           counter += i;

        }
        System.out.println(counter);
     }

}

