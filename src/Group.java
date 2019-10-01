import java.util.ArrayList;
import java.util.List;

public class Group {

    private String courseName;
    private int courseStartDay;
    private int courseStartMonth;
    private int courseStartYears;
    private int totalAmountLessons;
    private int totalAmountLessonsPerWeek;
    private List<Person> personList = new ArrayList<>();

    public Group(String courseName, int courseStartDay, int courseStartMonth, int courseStartYears, int totalAmountLessons, int totalAmountLessonsPerWeek) {
        this.courseName = courseName;
        this.courseStartDay = courseStartDay;
        this.courseStartMonth = courseStartMonth;
        this.courseStartYears = courseStartYears;
        this.totalAmountLessons = totalAmountLessons;
        this.totalAmountLessonsPerWeek = totalAmountLessonsPerWeek;
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
