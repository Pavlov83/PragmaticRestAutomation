package homeWork4;

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

    Student(double grade,int yearInCollege,boolean isDegree,int money){
        this();
        this.name = "New Student";
        this.subject ="General subject";
        this.age = 20;

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
