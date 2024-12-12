package groupmanager;

import java.util.List;

import groupmanager.model.Student;
import groupmanager.model.StudyGroup;
import groupmanager.service.StudyGroupService;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Создаём объект StudyGroupService
        StudyGroupService studyGroupService = new StudyGroupService();

        // Создаём список студентов
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "John", "Doe"));
        students.add(new Student(1, "Alice", "Smith"));
        students.add(new Student(2, "Bob", "Brown"));

        // Создаём объект StudyGroup и добавляем студентов
        StudyGroup group = new StudyGroup();
        group.setStudents(students);

        // Демонстрация сортировки по ID
        System.out.println("Before sorting by ID:");
        printStudents(group.getStudents());
        studyGroupService.sortStudentsById(group);
        System.out.println("After sorting by ID:");
        printStudents(group.getStudents());

        // Демонстрация сортировки по имени
        System.out.println("Before sorting by full name:");
        printStudents(group.getStudents());
        studyGroupService.sortStudentsByFullName(group);
        System.out.println("After sorting by full name:");
        printStudents(group.getStudents());

        // Удаление студента по полному имени
        System.out.println("Before removing student:");
        printStudents(group.getStudents());
        studyGroupService.deleteStudentByFullName(group, "Alice Smith");
        System.out.println("After removing student:");
        printStudents(group.getStudents());
    }

    // Вспомогательный метод для вывода студентов
    private static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

