package ProjectOOP.Homework.task_4;
import ProjectOOP.Seminars.Seminar_4.data.Teacher;
public interface TeacherControllerInterface<T extends Teacher> {
    void create(String firstName, String secondName, Long teacherID);
}