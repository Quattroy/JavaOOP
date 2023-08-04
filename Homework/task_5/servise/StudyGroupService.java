package ProjectOOP.Homework.task_5.servise;

import ProjectOOP.Homework.task_5.data.StudyGroup;
import ProjectOOP.Seminars.Seminar_5.model.Teacher;
import ProjectOOP.Seminars.Seminar_5.model.User;

import java.util.List;

public class StudyGroupService {
    private StudyGroup studyGroup;
    public void createStudyGroup(Teacher teacher, List<User> students){
        this.studyGroup = new StudyGroup(teacher, students);
    }
    public void createStudent(User user){
        studyGroup.createStudent(user);
    }
    public StudyGroup getStudyGroup() {
        return studyGroup;
    }
    public List<User> getStudentList(){
        return studyGroup.getStudentList();
    }
    public void getTeacher(){
        studyGroup.getTeacher();
    }
}
