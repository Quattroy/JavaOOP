package ProjectOOP.Seminars.Seminar_4.controller;

import java.time.LocalDate;
import java.util.List;

import ProjectOOP.Homework.task_4.Teacher;
import ProjectOOP.Seminars.Seminar_4.data.Student;
import ProjectOOP.Seminars.Seminar_4.data.User;
import ProjectOOP.Seminars.Seminar_4.servise.DataService;
import ProjectOOP.Seminars.Seminar_4.servise.StudentGroupService;
import ProjectOOP.Seminars.Seminar_4.view.UserView;

public class OldUserController {

    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final UserView userView = new UserView();

    public void createStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        List<User> userList = dataService.getAll();
        userView.sendOnConsole(userList);
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
    }

    public Student getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    }

    public List<Student> getSortedListStudentFromStudentGroup(){
        return studentGroupService.getSortedStudentGroup();
    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
        return studentGroupService.getSortedByFIOStudentGroup();
    }
}
