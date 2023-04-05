import java.util.Random;

public class Student implements QueryItem{
    private String name;
    private String course;
    private int yearStared;
    protected static Random random = new Random();
    private static String[] firstNames = {"Ann", "Bill","Cathy","John","Tim" };
    private static String[] courses = {"Java","C++","Python"};

    @Override
    public String toString() {
        return "%-15s %-15s %d".formatted(name,course,yearStared);
    }

    public int getYearStared() {
        return yearStared;
    }

    public Student(){
        int lastNameIndex = random.nextInt(65,91);
        name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStared = random.nextInt(2018, 2023);

    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        String fName = fieldName.toUpperCase();
        return switch (fName){
            case "NAME"-> name.equalsIgnoreCase(value);
            case "COURSE"-> course.equalsIgnoreCase(value);
            case "YEARSTARTED"-> yearStared==(Integer.parseInt(value));
            default -> false;
        };
    }
}
