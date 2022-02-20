package Homework7;


public class Person {

   private String name;
   private int age;
   private boolean isMan;

    Person(){

    }

    public String getName(){

            return name;
    }

     public int getAge(){
        return age;
     }

     public boolean getIsMan(){
        return isMan;
     }

     public void setName(String name){
        this.name = name;
     }

     public void setAge(int age){
        if(age < 0){
            System.out.println("You are trying to set negative value!!!");
        }{
             this.age = age;
         }

     }

     public void setIsMan(boolean man){
        this.isMan = man;
     }

    Person(String name, int age, boolean isMan){
        this.name = name;
        this.age = age;
        this.isMan = isMan;

    }

    void showPersonInfo(){
        System.out.println(this.name + " is " + this.age + " is man : " + this.isMan);
    }
}
