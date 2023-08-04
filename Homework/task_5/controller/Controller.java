package ProjectOOP.Homework.task_5.controller;



import ProjectOOP.Homework.task_5.servise.StudyGroupService;
import ProjectOOP.Seminars.Seminar_5.model.Student;
import ProjectOOP.Seminars.Seminar_5.model.Teacher;
import ProjectOOP.Seminars.Seminar_5.model.User;

import java.util.List;

public class Controller {
    StudyGroupService studyGroupService = new StudyGroupService();
    public void createStudyGroup(Teacher teacher, List<User> students){
        studyGroupService.createStudyGroup(teacher, students);
    }
    public void getStudyGroupId(){
        List<User> userList = studyGroupService.getStudentList();
        for (User user: userList) {
            Student student = (Student) user;
            System.out.println("StudentId: " + student.getStudentId());
        }
    }
    public void getTeacherId(){
        studyGroupService.getTeacher();
    }
}