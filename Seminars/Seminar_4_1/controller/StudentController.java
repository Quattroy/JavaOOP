package ProjectOOP.Seminars.Seminar_4_1.controller;

import java.time.LocalDate;
import java.util.List;

import ProjectOOP.Seminars.Seminar_4_1.data.Student;
import ProjectOOP.Seminars.Seminar_4_1.view.StudentView;
import ProjectOOP.Seminars.Seminar_4_1.view.UserView;

public class StudentController implements IUserController {

    private UserView studentsView = new StudentView();

    @Override
    public void create(String firstName, String surName, String lastName) {
        Student newStudent = new Student(firstName, lastName, surName, LocalDate.now());
    }

    public void printConsole(List<Student> students) {
        studentsView.sendOnConsole(students);
    }
}
