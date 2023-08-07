package ProjectOOP.Seminars.Seminar_4.controller;


import java.time.LocalDate;
import java.util.List;

import ProjectOOP.Seminars.Seminar_4.data.Student;
import ProjectOOP.Seminars.Seminar_4.view.StudentView;
import ProjectOOP.Seminars.Seminar_4.view.UserViewInterface;

public class StudentController implements IUserController{

    private UserViewInterface studentsView = new StudentView();
    @Override
    public void create(String firstName, String surName, String lastName){
        Student newStudent = new Student(firstName, lastName, surName, LocalDate.now());
    }
    public void printConsole(List<Student> students){
        studentsView.sendOnConsole(students);
    }
}
