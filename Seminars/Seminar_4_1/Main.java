package ProjectOOP.Seminars.Seminar_4_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ProjectOOP.Seminars.Seminar_4_1.data.Student;
import ProjectOOP.Seminars.Seminar_4_1.data.StudentGroup;
import ProjectOOP.Seminars.Seminar_4_1.data.Teacher;
import ProjectOOP.Seminars.Seminar_4_1.data.User;

public class Main { 

    public static void main(String[] args) {
        User student1 = new User("Иванов", "Иван", "Иванович", LocalDate.now());
        User student2 = new User("Петров", "Иван", "Иванович", LocalDate.now());
        User student3 = new User("Сидоров", "Иван", "Иванович", LocalDate.now());
        User student4 = new User("Болконская", "Иван", "Иванович", LocalDate.now());
        User student5 = new User("Романов", "Сергей", "Иванович", LocalDate.now());
        User student6 = new User("Ромашов", "Иван", "Иванович", LocalDate.now());
        System.out.println(student1);

        Teacher teacher = new Teacher("Букин", "Евгений", "Евгеньевич", LocalDate.now());
        List<Student> newList = new ArrayList<>();


        StudentGroup studentsGroup = new StudentGroup(teacher, newList);
        studentsGroup.createStudent(student1);
        studentsGroup.createStudent(student2);
        studentsGroup.createStudent(student3);
        studentsGroup.createStudent(student4);
        studentsGroup.createStudent(student5);
        studentsGroup.createStudent(student6);
    }

}
