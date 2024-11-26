package Ucheba.DZ_43_44;

import java.util.ArrayList;
import java.util.List;

public class Spisok {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>(5);
        students.add(0, "Ivan");
        students.add(1, "Nikita");
        students.add(2, "Petya");
        students.add(3, "Dasha");
        students.add(4, "Sveta");
        System.out.println(students);

        List<String> newStudents = new ArrayList<>();
        newStudents.add(0, "Alex");
        newStudents.add(1, "Bob");
        newStudents.add(2, "Charlie");

        students.addAll(newStudents);
        System.out.println(students);

        students.remove("Petya");
        System.out.println(students);
        students.remove(1);
        System.out.println(students);

        System.out.println("Есть ли Петя - " + students.contains("Svatoslav"));
        System.out.println("Есть ли Даша - " + students.contains("Dasha"));

        List<String> newStudents1 = new ArrayList<>();
        newStudents1.add(0, "Kesha");
        newStudents1.add(1, "Denis");
        newStudents1.add(2, "Ira");
        newStudents1.add(3, "Olga");
        students.containsAll(newStudents1);
        System.out.println("Есть ли студенты в списке - " + students.containsAll(newStudents1));

        System.out.println("Кол-во студентов: " + students.size());

        System.out.println("Список пуст: " + students.isEmpty());

        students.clear();
        System.out.println(students);
    }
}
