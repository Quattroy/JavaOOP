package ProjectOOP.Homework.task_3_1;
import java.util.List;

public class Controler3 {
    private final StudentGroupService3 studentGroupService = new StudentGroupService3();

    public void removeStudentByFIO(String lastName, String secondName, String firstName){
        studentGroupService.removeStudentByFIO(lastName,secondName,firstName);
    }

    public List<Student3> getSortedStudentList(){
        studentGroupService.getSortedStudentList();
    }
}
