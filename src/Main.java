import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Group group = new Group();

    public static void main(String[] args) {
        groupName();
        lastWeekLessons();
        listStudents();
        addStudents();
        searchSurName();
        deleteStudent();
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

    public static void listStudents() {
        group.add();
        System.out.println("List students: " + group.getPersonList());
    }

    public static void addStudents() {
        System.out.println("Enter add name: ");
        String name = scanner.nextLine();

        System.out.println("Enter add surname: ");
        String surName = scanner.nextLine();

        Person person = new Person(group.getPersonList().size() + 1, name, surName);
        group.getPersonList().add(person);

        System.out.println("Add student: " + group.getPersonList());
    }

    public static void searchSurName() {
        System.out.println("Enter student surname");
        String search = scanner.nextLine();

        for (int i = 0; i < group.getPersonList().size(); i++) {
            if (group.getPersonList().get(i).getSurName().equals(search)) {
                System.out.println("Student found");
                break;
            }
            if (i == group.getPersonList().size() - 1) {
                System.out.println("Student does not exist");
            }
        }
    }

    public static void deleteStudent() {
        System.out.println("1.Delete by last name " + "\n2.Delete by number");

        int scr = scanner.nextInt();
        scanner.nextLine();

        switch (scr) {
            case (1):
                System.out.println("Enter student surname");
                String search = scanner.nextLine();

                for (int i = 0; i < group.getPersonList().size(); i++) {
                    if (group.getPersonList().get(i).getSurName().equals(search)) {
                        group.getPersonList().remove(i);
                        break;
                    }
                    if (i == group.getPersonList().size() - 1) {
                        System.out.println("Student does not exist");
                    }
                }
                System.out.println(group.getPersonList());
                break;
            case (2):
                System.out.println("Enter student number");
                int search1 = scanner.nextInt();

                for (int i = 0; i < group.getPersonList().size(); i++) {
                    if (group.getPersonList().get(i).getSerialNumber() == search1) {
                        group.getPersonList().remove(i);
                        break;
                    }
                    if (i == group.getPersonList().size() - 1) {
                        System.out.println("Student does not exist");
                    }
                }
                System.out.println(group.getPersonList());
                break;
        }
    }
}
