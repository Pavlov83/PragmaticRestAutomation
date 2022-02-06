package homeWork5;

public class College {

    public static void main(String[] args) {



        Student peter = new Student("Peter","Physics",24);
        Student maria = new Student("Maria", "Physics",28);
        Student alPacino = new Student("Alphonse","Physics",20);

        StudentGroup physicsGroup = new StudentGroup("Physics");
        physicsGroup.addStudent(peter);
        peter.grade = 4.50;
        physicsGroup.addStudent(maria);
        maria.grade = 5.20;
        //physicsGroup.bestStudent();
        physicsGroup.addStudent(alPacino);
        physicsGroup.printStudentsInGroup();


    }
}
