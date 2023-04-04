import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for(int i = 0; i < studentCount; i++){
            students.add(new Student());
        }
        printStudent(students);


        List<UJStudent> ujStudents = new ArrayList<>();
        for(int i = 0; i < studentCount; i++){
            ujStudents.add(new UJStudent());
        }
//        although UJStudent extend Student so we can say its the same, when used as
//        a reference types, a container of one type has no relationship to the same container of another type
        printStudent(ujStudents);
    }
    public static void printStudent(List<Student> students){
        for(var student: students){
            System.out.println(student);
        }
        System.out.println();
    }
}