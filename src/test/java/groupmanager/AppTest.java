package groupmanager;

import groupmanager.model.Student;
import groupmanager.model.StudyGroup;
import groupmanager.service.StudyGroupService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    private StudyGroupService studyGroupService;
    private StudyGroup studyGroup;
    private Student student1, student2, student3;

    @BeforeEach
    void setUp() {
        // Инициализация данных перед каждым тестом
        student1 = new Student(3, "John", "Doe");
        student2 = new Student(1, "Alice", "Smith");
        student3 = new Student(2, "Bob", "Johnson");

        studyGroup = new StudyGroup();
        studyGroup.setStudents(Arrays.asList(student1, student2, student3));

        studyGroupService = new StudyGroupService();
    }

    @Test
    void testSortStudentsById() {
        // Проверяем начальный порядок студентов
        List<Student> studentsBeforeSort = studyGroup.getStudents();
        assertEquals(3, studentsBeforeSort.get(0).getStudentId());
        assertEquals(1, studentsBeforeSort.get(1).getStudentId());
        assertEquals(2, studentsBeforeSort.get(2).getStudentId());

        // Сортируем студентов по ID
        studyGroupService.sortStudentsById(studyGroup);

        // Проверяем результат сортировки
        List<Student> studentsAfterSort = studyGroup.getStudents();
        assertEquals(1, studentsAfterSort.get(0).getStudentId());
        assertEquals(2, studentsAfterSort.get(1).getStudentId());
        assertEquals(3, studentsAfterSort.get(2).getStudentId());
    }

    @Test
    void testSortStudentsByFullName() {
        // Проверяем начальный порядок студентов
        List<Student> studentsBeforeSort = studyGroup.getStudents();
        System.out.println("Before sort: ");
        for (Student student : studentsBeforeSort) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }

        // Сортируем студентов
        studyGroupService.sortStudentsByFullName(studyGroup);

        // Проверяем результат сортировки
        List<Student> studentsAfterSort = studyGroup.getStudents();
        System.out.println("After sort: ");
        for (Student student : studentsAfterSort) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }

        // Проверяем, что порядок студентов изменился
        assertEquals("Alice", studentsAfterSort.get(0).getFirstName());
        assertEquals("Bob", studentsAfterSort.get(1).getFirstName());
        assertEquals("John", studentsAfterSort.get(2).getFirstName());
    }

    @Test
    void testDeleteStudentByFullName() {
        // Проверяем, что список студентов содержит Alice
        assertTrue(studyGroup.getStudents().stream()
                .anyMatch(student -> student.getFirstName().equals("Alice") && student.getLastName().equals("Smith")));

        // Удаляем студента по полному имени
        studyGroupService.deleteStudentByFullName(studyGroup, "Alice Smith");

        // Проверяем, что студент Alice был удалён
        assertFalse(studyGroup.getStudents().stream()
                .anyMatch(student -> student.getFirstName().equals("Alice") && student.getLastName().equals("Smith")));
    }
}
