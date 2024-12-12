package groupmanager.model;

import java.util.Iterator;

public class StudyGroupIterator implements Iterator<Student> {
    private StudyGroup group;
    private int index = 0;

    public StudyGroupIterator(StudyGroup group) {
        this.group = group;
    }

    @Override
    public boolean hasNext() {
        return index < group.getStudents().size();
    }

    @Override
    public Student next() {
        return group.getStudents().get(index++);
    }

    @Override
    public void remove() {
        if (index > 0) {
            group.getStudents().remove(--index);
        }
    }
}
