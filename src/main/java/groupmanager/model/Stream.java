package groupmanager.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Stream implements Iterable<StudyGroup> {
    private List<StudyGroup> studyGroups;

    public Stream() {
        studyGroups = new ArrayList<>();
    }

    public void addStudyGroup(StudyGroup group) {
        studyGroups.add(group);
    }

    public List<StudyGroup> getStudyGroups() {
        return studyGroups;
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return studyGroups.iterator();
    }
}
