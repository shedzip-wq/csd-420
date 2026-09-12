/**
 * Sheridan Dela Cruz
 * Date: 09/12/2026
 * Assignment: Module 6.2
 * Simple Person class for Comparator testing.
 */

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ")";
    }
}
