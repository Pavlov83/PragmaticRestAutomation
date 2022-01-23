package homeWork1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //Task 6 - Enter three numbers and switch their values: a1,a2,a3

        System.out.println("Please enter value for a1:");
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        System.out.println("Please enter value for a2:");
        Scanner sc2 = new Scanner(System.in);
        int a2 = sc.nextInt();
        System.out.println("Please enter value for a3:");
        Scanner sc3 = new Scanner(System.in);
        int a3 = sc.nextInt();

        System.out.println(a1+ " " + a2 + " " + a3);
        int temp1,temp2;
        temp1 = a2;
        temp2 = a3;
        a3= a1;
        a1 = temp1;
        a2 = temp2;
        System.out.println("Changed result : a1:" + a1 +" " + "a2:" + a2 + " " + "a3:"+" " + a3 );

    }
}
