package homeWork1;

import java.util.Scanner;

public class Task7 {

    /*Task 7 enter three values:
        Hour: integer
        money amount :float
        healthy: boolean
        Take decision based on: If I am sick -not going out,
                                    have money -buy medicine
                                    no money- stay home
                                    healthy: go out
                                    less than 10lv go to a bar
     */

    public static void main(String[] args) {
        System.out.println("Please enter hour: ");
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();

        System.out.println("Please enter moneyAmount: ");
        Scanner scan2 = new Scanner(System.in);
        float moneyAmount = scan2.nextFloat();


        System.out.println("Am I healthy?(true/false) :");
        Scanner scan3 = new Scanner(System.in);
        boolean Healthy = scan3.nextBoolean();

        if(Healthy = false){

            if(moneyAmount > 10){
                System.out.println("I should buy medicine");
            }else{
                System.out.println("I will drink tea");
            }

        }else{
            if(moneyAmount > 10 && hour > 18){
                System.out.println("I will go at the bar");
            }else{
                System.out.println("I will drink coffee");
            }

            if(moneyAmount > 10 && hour < 18){
                System.out.println("It is too early to go out");
            }

            if(moneyAmount <10){
                System.out.println("Not enough money to go out");
            }
        }
    }
}
