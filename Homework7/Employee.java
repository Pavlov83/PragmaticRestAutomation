package Homework7;

public class Employee extends Person {

    double daySalary;
    String name;


    Employee(String name,int age,boolean isMan,double daySalary){
        super(name,age,isMan);
        this.setAge(age);
        this.daySalary = daySalary;
    }

    void calculateOvertime(double hours){
        if(this.getAge() < 18){
            System.out.println("Overtime amount is zero,your age is less than 18");
        }else{
            hours = daySalary / 8 * 1.5;
            System.out.println("Overtime is: " + hours);
        }
    }

    void employeeInfo(){
        showPersonInfo();
        System.out.println("Employee name is : " + this.name + " and his salary is " + this.daySalary);
    }
}
