import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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

    public void groupName() {
        System.out.println("Group Name: " + courseName + " " + courseStartDay + "." +
                courseStartMonth + "." + courseStartYears);
    }

    public void lastWeekLessons() {
        int valueWeek = totalAmountLessons / totalAmountLessonsPerWeek - 1;

        LocalDate startDate = LocalDate.of(courseStartYears, courseStartMonth, courseStartDay);
        LocalDate lastWeek = startDate.plus(valueWeek, ChronoUnit.WEEKS);

        System.out.println("Last Week Starts : " + lastWeek);

    }
    public List<Person> getPersonList() {
        return personList;
    }
}
