package groupmanager.service;

import groupmanager.model.Stream;
import groupmanager.model.StreamComparator;
import groupmanager.model.StudyGroup;
import java.util.Collections;
import java.util.List;

public class StreamService {

    public void sortStreamsByGroupCount(List<Stream> streams) {
        Collections.sort(streams, new StreamComparator());
    }
}
