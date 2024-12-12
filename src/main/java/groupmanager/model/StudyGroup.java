package groupmanager.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudyGroup {
    private List<Student> students;

    public StudyGroup() {
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students == null ? Collections.emptyList() : students; // Возвращаем неизменяемый список
    }

    public void setStudents(List<Student> students) {
        if (students == null) {
            this.students = new ArrayList<>(); // Если передан null, создаём пустой список
        } else {
            this.students = new ArrayList<>(students); // Сохраняем копию нового списка
        }
    }
}
