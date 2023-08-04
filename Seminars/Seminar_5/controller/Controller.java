package ProjectOOP.Seminars.Seminar_5.controller;



import java.util.List;

import ProjectOOP.Seminars.Seminar_5.model.Student;
import ProjectOOP.Seminars.Seminar_5.model.Type;
import ProjectOOP.Seminars.Seminar_5.model.User;
import ProjectOOP.Seminars.Seminar_5.service.DataService;
import ProjectOOP.Seminars.Seminar_5.view.StudentView;

public class Controller {
    private final DataService dataService = new DataService();
    StudentView view = new StudentView();
    public void createStudent(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }
    public void createTeacher(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.TEACHER);
    }
    public void getAllStudent(){
        List<User> userList = dataService.getStudentAll();
        for (User user: userList) {
            Student student = (Student) user;
            view.printOnConsole(student);
        }
    }
}
