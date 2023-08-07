package ProjectOOP.Seminars.Seminar_4.view;

import java.util.List;
import java.util.logging.Logger;

import ProjectOOP.Seminars.Seminar_4.data.Student;
import ProjectOOP.Seminars.Seminar_4.data.StudentGroup;
import ProjectOOP.Seminars.Seminar_4.data.User;

public class UserView {
    /**
     * Принцип единственной ответственности, данный класс выполняет только методы по печати.
     */
    Logger logger = Logger.getLogger(UserView.class.getName());

    public void sendOnConsole(List<User> userList){
        for(User user: userList){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

    public void sendOnConsoleListStudent(List<Student> students){
        logger.info(students.toString());
    }

}