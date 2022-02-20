package Homework7;

public class Student extends Person {

    double score ;


    Student(String name, int age, boolean isMan,double score){
       super(name,age,isMan);
        this.score = score;
    }

    void showStudentInfo(){
        System.out.println(this.getName() + " has a " + this.score + "score" );
    }

}
