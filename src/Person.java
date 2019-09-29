public class Person {

    private int serialNumber;
    private String name;
    private String surName;

    public Person(int serialNumber, String name, String surName) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.surName = surName;
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
