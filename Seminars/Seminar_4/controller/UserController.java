package ProjectOOP.Seminars.Seminar_4.controller;

import java.time.LocalDate;

import ProjectOOP.Seminars.Seminar_4.data.User;

public class UserController implements IUserController{
    /**
     * Принцип единственной ответственности, данный класс выполняет только одну функцию создать юзера.
     */
    @Override
    public void create(String firstName, String surName, String lastName){
        User newUser = new User(firstName, lastName, surName, LocalDate.now());
    }
    public void printConsole(User user){

    }
}
