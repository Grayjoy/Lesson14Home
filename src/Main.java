import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Group group = new Group("Java Intro", 12, 8, 2019, 16, 2);
    private static Person person = new Person(4, "Danyl", "Yarov");

    public static void main(String[] args) {
        groupName();
        lastWeekLessons();
        person.listStudents();
        person.addStudents(consoleAddName(), consoleAddSurName());
        person.searchSurName();
        person.deleteStudent();
    }

    public static void groupName() {
        System.out.println("Group Name: " + group.getCourseName() + " " + group.getCourseStartDay() + "." +
                group.getCourseStartMonth() + "." + group.getCourseStartYears());
    }

    public static void lastWeekLessons() {
        int valueWeek = group.getTotalAmountLessons() / group.getTotalAmountLessonsPerWeek() - 1;

        LocalDate startDate = LocalDate.of(group.getCourseStartYears(), group.getCourseStartMonth(), group.getCourseStartDay());
        LocalDate lastWeek = startDate.plus(valueWeek, ChronoUnit.WEEKS);

        System.out.println("Last Week Starts : " + lastWeek);

    }

    public static String consoleAddName() {
        System.out.println("Enter add name: ");
        String name = scanner.nextLine();
        return name;
    }

    public static String consoleAddSurName() {
        System.out.println("Enter add surname: ");
        String surName = scanner.nextLine();
        return surName;
    }

}
