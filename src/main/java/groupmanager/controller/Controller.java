package groupmanager.controller;

import groupmanager.service.StudyGroupService;
import groupmanager.service.StreamService;
import groupmanager.model.StudyGroup;
import groupmanager.model.Stream;

import java.util.List;

public class Controller {

    private final StudyGroupService studyGroupService;
    private final StreamService streamService;

    public Controller(StudyGroupService studyGroupService, StreamService streamService) {
        this.studyGroupService = studyGroupService;
        this.streamService = streamService;
    }

    public void sortStudentsById(StudyGroup group) {
        studyGroupService.sortStudentsById(group);
    }

    public void sortStudentsByFullName(StudyGroup group) {
        studyGroupService.sortStudentsByFullName(group);
    }

    public void sortStreamsByGroupCount(List<Stream> streams) {
        streamService.sortStreamsByGroupCount(streams);
    }

    public void deleteStudentByFullName(StudyGroup group, String fullName) {
        studyGroupService.deleteStudentByFullName(group, fullName);
    }
}
