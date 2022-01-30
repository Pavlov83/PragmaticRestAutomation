package homeWork4;

public class DemoStudent {
    public static void main(String[] args) {
        Student peter = new Student();
        Student alPacino = new Student();
        System.out.println(alPacino.yearInCollege);
        alPacino.upYear();
        System.out.println(alPacino.yearInCollege);
        System.out.println(peter.receiveScholarship(5.2,30));

    }
}
