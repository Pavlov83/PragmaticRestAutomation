package homeWork5;

public class StudentGroup {

    String groupSubject;
    Student[] students;
    int freePlaces;

    StudentGroup(){
        this.students = new Student[5];
        this.freePlaces = 5;
    }
    StudentGroup(String subject){
        this();
        this.groupSubject = subject;
    }

    void addStudent(Student s){
        if(freePlaces > 0){
            students[freePlaces - 1] = s;
            freePlaces = freePlaces-1;

        }
    }

    void emptyGroup(){
        this.students = new Student[5];
        freePlaces = 5;
    }

    String bestStudent(){
        String bestStudentName =  "";
        for (int i = 0; i <students.length;i++){
            if(students[i].grade < students[i-1].grade){
                bestStudentName = students[i].name;
            }
       }

        return bestStudentName;
    }

    void printStudentsInGroup(){

        for(int i = 0;i < students.length;i++){
            System.out.println(students[i]);
        }
        for(Student currentName:students){
            if(currentName == null){
                continue;
            }else{
                String studentDetails = "";
                studentDetails = currentName.name + String.valueOf(currentName.grade);
                System.out.println(studentDetails);
            }
        }
    }
}


