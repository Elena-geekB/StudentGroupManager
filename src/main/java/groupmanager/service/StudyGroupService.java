package groupmanager.service;

import groupmanager.model.StudyGroup;
import groupmanager.model.Student;

import java.util.Collections;
import java.util.Comparator;

public class StudyGroupService {

    // Сортировка студентов по полному имени (фамилия, имя)
    public void sortStudentsByFullName(StudyGroup studyGroup) {
        if (studyGroup == null || studyGroup.getStudents() == null) {
            throw new IllegalArgumentException("Study group or students list is null");
        }

        // Сортировка сначала по фамилии, затем по имени
        Collections.sort(studyGroup.getStudents(), new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // Сравниваем фамилии (сравнение по алфавиту)
                int lastNameComparison = s1.getLastName().compareTo(s2.getLastName());

                // Если фамилии одинаковы, сравниваем имена
                if (lastNameComparison == 0) {
                    return s1.getFirstName().compareTo(s2.getFirstName());
                }

                return lastNameComparison;
            }
        });
    }

    // Другие методы, например, сортировка по ID
    public void sortStudentsById(StudyGroup studyGroup) {
        if (studyGroup == null || studyGroup.getStudents() == null) {
            throw new IllegalArgumentException("Study group or students list is null");
        }

        // Сортировка студентов по ID
        Collections.sort(studyGroup.getStudents(), Comparator.comparingInt(Student::getStudentId));
    }

    // Удаление студента по полному имени
    public void deleteStudentByFullName(StudyGroup studyGroup, String fullName) {
        studyGroup.getStudents().removeIf(student -> (student.getFirstName() + " " + student.getLastName()).equals(fullName));
    }
}
