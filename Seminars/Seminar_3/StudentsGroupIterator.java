package ProjectOOP.Seminars.Seminar_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentsGroupIterator implements Iterator<Student> {
    // счетчик, чтобы считать студентов + List массив со студентами
    private List<Student> students;

    private int counter;
    
    public StudentsGroupIterator(StudentsGroup studentsGroup) {
        this.students = studentsGroup.getStudents();//studentsGroup - это объект экземпляра класса,
                                                    // getStudents - вернет нам лист наших студентов.
        this.counter = 0;
    }

    @Override
    public boolean hasNext() { // будем возвращать сравнение counter и studentsize
        return counter < students.size() - 1;
    }

    @Override
    public Student next() {
        if(!hasNext()) return null; // если слудующего элемента нет - возвращаем null
        counter++;
        return students.get(counter);
    }
    
    @Override
    public void remove() {//очищает ссписок
        students = new ArrayList<>();
        counter = 0;
        
    }
}