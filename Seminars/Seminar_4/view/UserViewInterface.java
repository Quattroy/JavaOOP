package ProjectOOP.Seminars.Seminar_4.view;

import java.util.List;

import ProjectOOP.Seminars.Seminar_4.data.User;

public interface UserViewInterface<T extends User> {
    /**
     * Принцип единственной ответственности, данный интерфейс выполняет только один метод печати.
     * Принцип разделения интерфейса (ISP)
     */
    public void sendOnConsole(List<T> listT);
}