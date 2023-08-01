package ProjectOOP.Homework.task_3_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroupt3> {
    private List<StudentGroupt3> studentGroups;

    public Stream() {
        studentGroups = new ArrayList<StudentGroupt3>();
    } 

    public Stream(List<StudentGroupt3> studentGroup) {
        setStudentsGroup(studentGroups);
     }
 
     public void addGroup(StudentGroupt3 studentGroup) {
         if(studentGroups != null) {
            studentGroups.add(studentGroup);
         }
     }
    
     public List<StudentGroupt3> studentGroups(){
        return studentGroups;
    }

    public void setStudentsGroup(List<StudentGroupt3> studentGroups){
        this.studentGroups = studentGroups;
    }

    @Override
    public Iterator<StudentGroupt3> iterator() {
        ;
    }

   
    
    
}
