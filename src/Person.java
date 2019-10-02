import java.util.Scanner;

public class Person {

    private static Group group = new Group("Java Intro",12,8,2019,16,2);
    private static Scanner scanner = new Scanner(System.in);

    private int serialNumber;
    private String name;
    private String surName;

    public Person(int serialNumber, String name, String surName) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.surName = surName;
    }

    public void listStudents(Person person1,Person person2,Person person3) {
        group.getPersonList().add(person1);
        group.getPersonList().add(person2);
        group.getPersonList().add(person3);
        System.out.println("List students: " + group.getPersonList());
    }

    public void addStudents(String name,String surName) {
        Person person = new Person(group.getPersonList().size() + 1, name, surName);
        group.getPersonList().add(person);

        System.out.println("Add student: " + group.getPersonList());
    }

    public void searchSurName() {
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

    public void deleteStudent() {
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

    public String getSurName() {
        return surName;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "serialNumber=" + serialNumber +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
