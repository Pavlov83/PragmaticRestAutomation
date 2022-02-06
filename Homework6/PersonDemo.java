package Homework6;




public class PersonDemo {
    public static void main(String[] args) {


    Person[] people = new Person[10];

    Person walter = new Person("Mister",23,true);
    Person hank = new Person("Human",39,true);

    Student bruce = new Student("Ivan",17,true,5.7);
    Student lee = new Student("Ivan",17,true,5.7);

    Employee donald = new Employee("Donald",24,250);
    Employee trump = new Employee("trump",24,160);

    people[0] = walter;
    people[1] = hank;

    people[2] = bruce;
    people[3] = lee;

    people[4] = donald;
    people[5] = trump;

    for(int i = 0;i < people.length;i++){
        if(people[i] instanceof Student){
            ((Student) people[i]).showStudentInfo();
        }else if(people[i] instanceof Employee){
            ((Employee) people[i]).employeeInfo();
            ((Employee) people[i]).calculateOvertime(2);
        }else{
            if(people[i] instanceof Person){
            people[i].showPersonInfo();
        }
    }

    }
}
}