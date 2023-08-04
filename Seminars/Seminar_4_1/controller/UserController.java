package ProjectOOP.Seminars.Seminar_4_1.controller;

import java.time.LocalDate;

import ProjectOOP.Seminars.Seminar_4_1.data.User;

public class UserController implements IUserController {

    @Override
    public void create(String firstName, String surName, String lastName) {
        User newUser = new User(firstName, lastName, surName, LocalDate.now());
    }

    public void printConsole(User user) {
        
    }
}
