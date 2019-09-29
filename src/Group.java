import java.util.ArrayList;
import java.util.List;

public class Group {

    private String courseName = "Java Introdaction";
    private int courseStartDay = 12;
    private int courseStartMonth = 8;
    private int courseStartYears = 2019;
    private int totalAmountLessons = 16;
    private int totalAmountLessonsPerWeek = 2;
    private List<Person> personList = new ArrayList<>();

    public void add() {
        Person person = new Person(1, "Maks", "Ealon");
        Person person1 = new Person(2, "Aleks", "Hroup");
        Person person2 = new Person(3, "David", "Grat");

        personList.add(person);
        personList.add(person1);
        personList.add(person2);
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseStartDay() {
        return courseStartDay;
    }

    public int getCourseStartMonth() {
        return courseStartMonth;
    }

    public int getCourseStartYears() {
        return courseStartYears;
    }

    public int getTotalAmountLessons() {
        return totalAmountLessons;
    }

    public int getTotalAmountLessonsPerWeek() {
        return totalAmountLessonsPerWeek;
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
