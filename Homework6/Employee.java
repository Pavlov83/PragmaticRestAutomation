package Homework6;

public class Employee extends Person {

    double daySalary;
    String name;


    Employee(String name,int age,double daySalary){
        this.name = name;
        this.age = age;
        this.daySalary = daySalary;
    }

    void calculateOvertime(double hours){
        if(this.age < 18){
            System.out.println("Overtime amount is zero,your age is less than 18");
        }else{
            hours = daySalary / 8 * 1.5;
            System.out.println("Overtime is: " + hours);
        }
    }

    void employeeInfo(){
        System.out.println("Employee name is : " + this.name + " and his salary is " + this.daySalary);
    }
}
