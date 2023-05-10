package Score;

import Score.SortingMethod;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        //Заполенение List студентами
        List<Student> students = Arrays.asList(
                new Student("Дмитрий", "Бескровный", 33, 3.6),
                new Student("Антон", "Безкаровайный", 38, 5.0),
                new Student("Андрей", "Ивкин", 25, 1.7),
                new Student("Александр", "Прелипенко", 24, 4.2),
                new Student("Станислав", "Губаренко", 26, 3.2),
                new Student("Мария", "Смирнова", 22, 4.5),
                new Student("Денис", "Козлов", 20, 3.8),
                new Student("Екатерина", "Кузнецова", 23, 4.0),
                new Student("Алексей", "Королев", 27, 3.5),
                new Student("Николай", "Морозов", 21, 4.7),
                new Student("Анастасия", "Соколова", 19, 4.2),
                new Student("Дарья", "Петрова", 25, 3.1),
                new Student("Сергей", "Иванов", 28, 4.9),
                new Student("Ирина", "Федорова", 26, 4.3),
                new Student("Олег", "Соловьев", 24, 3.2),
                new Student("Ольга", "Белова", 52, 4.5),
                new Student("Михаил", "Борисов", 40, 3.8),
                new Student("Иван", "Беляев", 63, 4.0),
                new Student("Евгений", "Богданов", 47, 3.5)
        );

        //Сортировка массива студентов
        Comparator<Student> studentComparator = new Student.CompareStudentName().thenComparing(new Student.CompareStudentAge());
        TreeSet<Student> studentsAfterComparing = new TreeSet<>(studentComparator);
        studentsAfterComparing.addAll(students);

        //Вывод фамилии студента после сортировки по имени и возрасту.
        System.out.println(SortingMethod.studentSortingByNameAndAge(studentsAfterComparing, "Б"));
//        System.out.println(result);

        //Вывод имени студента чей рейтинг выше заданого
        SortingMethod.studentSortingByRating(students, 4);

        //Вывод фамилии студента с возрастом выше заданого
        SortingMethod.studentSortingByMaxAge(students, 27);
    }
}