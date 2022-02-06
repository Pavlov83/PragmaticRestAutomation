package Homework6;

public class Student extends Person{

    double score ;


    Student(String name, int age, boolean isMan,double score){
        this.name = name;
        this.age = age;
        this.isMan = isMan;
        this.score = score;
    }

    void showStudentInfo(){
        System.out.println(this.name + " has a " + this.score + "score" );
    }

}
