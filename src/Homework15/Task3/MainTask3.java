package Homework15.Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class MainTask3 {
    public static void main(String[] args) {
        /**
         * Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
         * оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
         * Написать метод, который удаляет студентов со средним баллом <3. Если средний
         * балл>=3, студент переводится на следующий курс. Дополнительно написать метод
         * printStudents(List<Student> students, int course), который получает список студентов и
         * номер курса. А также печатает на консоль имена тех студентов из списка, которые
         * обучаются на данном курсе
         */
        Students students = new Students("Vasia ", "2", "3", Arrays.asList(1, 3, 4, 2, 2, 5, 9));
        Students students1 = new Students("Oleg ", "3", "1", Arrays.asList(1, 2, 6, 2, 2, 5, 9));
        Students students2 = new Students("Masha ", "5", "2", Arrays.asList(1, 3, 7, 2, 2, 4, 9));
        Students students3 = new Students("Yulia ", "5", "4", Arrays.asList(5, 2, 9, 2, 2, 4, 9));
        Students students4 = new Students("Ilya  ", "1", "1", Arrays.asList(8, 8, 9, 9, 9, 9, 9));
        ArrayList<Students> student = new ArrayList<>();
        student.add(students);
        student.add(students1);
        student.add(students2);
        student.add(students3);
        student.add(students4);
        for (Students students5 : student) {
            System.out.println(students5);
        }
        Students.manageStudents(student);

    }
}
