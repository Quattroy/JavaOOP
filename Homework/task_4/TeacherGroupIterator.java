package ProjectOOP.Homework.task_4;

import java.util.Iterator;
import java.util.List;
import ProjectOOP.Seminars.Seminar_4.data.Teacher;

public class TeacherGroupIterator implements Iterator<Teacher> {
    private int counter;
    private final List<Teacher> teacherList;
    public TeacherGroupIterator(TeacherGroup teacherGroup){
        this.teacherList = teacherGroup.getTeacherList();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < teacherList.size() - 1;
    }

    @Override
    public Teacher next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return teacherList.get(counter);
    }
}