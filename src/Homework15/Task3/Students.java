package Homework15.Task3;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Students {
    /**
     * *Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
     * оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
     * Написать метод, который удаляет студентов со средним баллом <3. Если средний
     * балл>=3, студент переводится на следующий курс. Дополнительно написать метод
     * printStudents(List<Student> students, int course), который получает список студентов и
     * номер курса. А также печатает на консоль имена тех студентов из списка, которые
     * обучаются на данном курсе
     */
    private String name;
    private String group;
    private String course;
    private List<Integer> subjectAssessment;
    private double averageGrade = 0;

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade() {
        this.averageGrade = averageGrade;
    }

    public Students(String name, String group, String course, List<Integer> subjectAssessment) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.subjectAssessment = subjectAssessment;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public List<Integer> getSubjectAssessment() {
        return subjectAssessment;
    }

    public void setSubjectAssessment(List<Integer> subjectAssessment) {
        this.subjectAssessment = subjectAssessment;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Double.compare(averageGrade, students.averageGrade) == 0 && Objects.equals(name, students.name) && Objects.equals(group, students.group) && Objects.equals(course, students.course) && Objects.equals(subjectAssessment, students.subjectAssessment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group, course, subjectAssessment, averageGrade);
    }

    public void printStudents(List<Students> students, int course) {
        for (Students student : students) {
            if (student.getCourse().equals(course)) {
                System.out.println(student.getName());
            }
        }
    }

    public void AverageGrade() {
        for (Integer grade : subjectAssessment) {
            averageGrade += grade;
        }
        averageGrade = averageGrade / subjectAssessment.size();
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course='" + course + '\'' +
                ", subjectAssessment=" + subjectAssessment +
                ", averageGrade=" + averageGrade +
                '}';
    }

    public static void manageStudents(List<Students> students) {
        Iterator<Students> iterator = students.iterator();//TODO iterator
        while (iterator.hasNext()) {
            Students student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove(); // Удаляем студента
                System.out.println(student.getName() + " был удален из списка (средний балл < 3).");
            } else {
                student.setCourse(student.getCourse() + 1); // Переводим на следующий курс
                System.out.println(student.getName() + " переведен на " + student.getCourse() + " курс ");
            }
        }
    }
}


