package homeWork3;

import java.sql.ShardingKey;

public class Computer {

    int buildYear;
    double sellPrice;
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operatingSystem;

    void changeOperatingSystem(String newOperatingSystem){
        operatingSystem = newOperatingSystem;
    }

    void useMemory(double memory){
        freeMemory -= memory;
    }

    Computer(){
        isNotebook = false;
        operatingSystem = "Win Xp";
    }

    Computer(int year,double price,double diskMemory,double memory){
        buildYear = year;
        sellPrice = price;
        hardDiskMemory = diskMemory;
        freeMemory = memory;
    }

    Computer(int year,double price,boolean isNotebook,
             double hardDiskMemory,double freeMemory,String operatingSystem){
        buildYear = year;
        sellPrice = price;
        isNotebook = isNotebook;
        hardDiskMemory = hardDiskMemory;
        freeMemory = freeMemory;
        operatingSystem = operatingSystem;

    }

    int comparePrice(Computer otherComp){
        if(otherComp.sellPrice < this.sellPrice){

            System.out.println("The compared price is less than the price of the current computer");
            return -1;

        }else if(otherComp.sellPrice == this.sellPrice){

            System.out.println("The compared price is equal with the price of the current computer");
            return 1;

        }else{

            System.out.println("The compared price is greater than the price of the current computer");
            return 0;
        }
    }
}
