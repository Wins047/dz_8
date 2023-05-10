package Score;

import Score.Student;

import java.util.*;

public class SortingMethod {


    public static void studentSortingByMaxAge(List<Student> students, int maxAge) {
        List<String> olderStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() > maxAge) {
                olderStudents.add(student.getSurname());
            }
        }
        System.out.println("Фамилии студентов чей возраст выше " + maxAge + ".");
        System.out.printf("%s", olderStudents);
    }

    public static void studentSortingByRating(List<Student> students, double average) {
        Map<String, Double> studentsRating = new IdentityHashMap<>();
        for (Student student : students) {
            if (student.getAverageRating() > average) {
                studentsRating.put(student.getSurname(), student.getAverageRating());
            }
        }
        System.out.print("Имена студентов чей рейтинг выше " + average + ".\n");
        System.out.printf("%s\n", studentsRating);
    }

    public static String studentSortingByNameAndAge(TreeSet<Student> studentsComparator, String prefix) {
        List<String> nameSort = new ArrayList<>();
//        System.out.println("Сортировка по имени (по возрастанию) и возрасту (по убыванию).");
        for (Student student : studentsComparator) {
            if (student.getSurname().startsWith(prefix)) {
                nameSort.add(student.getSurname());
            }
        }
        System.out.println("Фамилии начинающиеся на \"" + prefix + "\" после сортировки по имени (по возрастанию) и возрасту (по убыванию).");
        return nameSort.toString();
    }
}