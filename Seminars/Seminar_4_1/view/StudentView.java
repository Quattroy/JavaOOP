package ProjectOOP.Seminars.Seminar_4_1.view;

import java.util.List;

import ProjectOOP.Seminars.Seminar_4_1.data.Student;

public class StudentView implements UserView<Student> {

    @Override
    public void sendOnConsole(List<Student> listT) {
        System.out.println("Список студентов");
        for (Student student: listT) {
            System.out.println(student.getStudentId());

        }
    }
    
}
