package ProjectOOP.Seminars.Seminar_4_1.view;

import java.util.List;

import ProjectOOP.Seminars.Seminar_4_1.data.User;

public interface UserView<T extends User>  { //T унаследованные от User, можно UserView вго всех классах T реализ от User
    
    void sendOnConsole(List<T> listT);


}
