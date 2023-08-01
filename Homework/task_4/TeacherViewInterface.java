package ProjectOOP.Homework.task_4;
import ProjectOOP.Seminars.Seminar_4.data.Teacher;


import java.util.List;

public interface TeacherViewInterface<T extends Teacher> {
    public void sendOnConsole(List<T> tList);
}
