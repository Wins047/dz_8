package Score;

import java.util.Comparator;

public class Student {

    private final String name;
    private final String surname;
    private final int age;
    private final double averageRating;

    public Student(String name, String surname, int age, double averageRating) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageRating = averageRating;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getAverageRating() {
        return averageRating;
    }

    static class CompareStudentName implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    static class CompareStudentAge implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}