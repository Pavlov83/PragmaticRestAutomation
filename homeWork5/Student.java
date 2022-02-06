package homeWork5;

public class Student {

    String name;
    String subject;
    double grade;
    int yearInCollege;
    int age;
    boolean isDegree;
    int money;

    Student(){
        this.grade = 4.0;
        this.yearInCollege = 1 ;
        this.isDegree = false;
        this.money = 0;
    }

    Student(String name,String subject,int age){
        this();
        this.name = name;
        this.subject = subject;
        this.age = age;

    }

    void upYear(){
        if(this.yearInCollege <=3){
            this.yearInCollege =  yearInCollege+1;
            if(this.yearInCollege == 4){
                this.isDegree = true;
            }

        }else{
            System.out.println("This student graduated already!");
        }


    }

    double receiveScholarship(double min,double amount){
        if(min >= 5){
            if(age < 30){
                this.money += amount;
            }
        }
        return money;
    }
}
