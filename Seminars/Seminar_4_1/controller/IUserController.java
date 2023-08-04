package ProjectOOP.Seminars.Seminar_4_1.controller;

import ProjectOOP.Seminars.Seminar_4_1.data.User;

public interface IUserController<T extends User> {
    
    void create(String firstName, String surName, String lastName);
    
}
