package groupmanager.model;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int lastNameCompare = s1.getLastName().compareTo(s2.getLastName());
        if (lastNameCompare == 0) {
            return s1.getFirstName().compareTo(s2.getFirstName());
        }
        return lastNameCompare;
    }
}
