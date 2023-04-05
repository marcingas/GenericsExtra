import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for(int i = 0; i < studentCount; i++){
            students.add(new Student());
        }
//        printStudent(students);
        printMoreLists(students);


        List<UJStudent> ujStudents = new ArrayList<>();
        for(int i = 0; i < studentCount; i++){
            ujStudents.add(new UJStudent());
        }
//        although UJStudent extend Student so we can say its the same, when used as
//        a reference types, a container of one type has no relationship to the same container of another type
        System.out.println("____UJSTUDENT LIST______");
//        printStudent(ujStudents);
        printMoreLists(ujStudents);
        System.out.println("test list: ");
        testList(new ArrayList<String>(List.of("John", "Poul")));
        testList(new ArrayList<Integer>(List.of(1, 2)));
        testList(new ArrayList<>(List.of(1, "john")));

        var queryList = new QueryList<>(ujStudents);
        var matches = queryList.getMatches("Course", "Python");
        System.out.println("students studying Python----------");
        printMoreLists(matches);

        var students2021 = QueryList.getMatches(students,"YearStarted","2021");
        System.out.println("Students started in 2021 with static method getMatches:");
        printMoreLists(students2021);
    }

    public static void testList(List<?>list){
        for (var element: list){
            if(element instanceof String s){
                System.out.println("String: " + s.toUpperCase());
            } else if (element instanceof  Integer i) {
                System.out.println("Integer: " + i.floatValue());

            }
        }
    }
//    Abovwe method can solve problem with those two methods:
//    public static void testList(List<String>list){
//        for (var element: list){
//            System.out.println("String: " + element.toUpperCase());
//        }
//    }
//    public static void testList(List<Integer>list){
//        for (var element: list){
//            System.out.println("String: " + element.floatValue());
//        }
//    }
    public static  void printMoreLists(List<? extends Student> students){
        for(var student: students){
            System.out.println(student.getYearStared() + ": " + student);
        }
        System.out.println();
    }
    public static <T extends Student> void printStudent(List<T> students){
        for(var student: students){
            System.out.println(student.getYearStared() + ": " + student);
        }
        System.out.println();
    }
}