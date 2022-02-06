package Homework6;


public class Person {

    String name;
    int age;
    boolean isMan;

    Person(){

    }

    Person(String name, int age, boolean isMan){
        this.name = name;
        this.age = age;
        this.isMan = isMan;

    }

    void showPersonInfo(){
        System.out.println(this.name + " is " + this.age + "is man : " + this.isMan);
    }
}
