package ProjectOOP.Homework.task_4;
import ProjectOOP.Seminars.Seminar_4.data.Teacher;


import java.util.List;

public class TeacherView implements TeacherViewInterface<Teacher> {
    @Override
    public void sendOnConsole(List<Teacher> teacherList) {
        System.out.println("Список учитлей: ");
        for (Teacher t: teacherList) {
            System.out.println(t.getTeacherId());
        }
    }
}