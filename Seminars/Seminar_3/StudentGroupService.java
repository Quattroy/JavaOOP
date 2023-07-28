package ProjectOOP.Seminars.Seminar_3;

import java.util.List;

public class StudentGroupService {
    private StudentsGroup studentsGroup;

    public StudentGroupService(StudentsGroup studentsGroup) {
        this.studentsGroup = studentsGroup;

    }

    public StudentGroupService(){
        this.studentsGroup = new StudentsGroup();
    }

    public StudentsGroup getStudentsGroup() {
        return studentsGroup;
    
    }

    public void setStudentsGroup(StudentsGroup studentsGroup) {
        this.studentsGroup = studentsGroup;
    }


    public boolean removeStudent(String firstName, String secondName, String lastName) {
        Student removeStudent = new Student(null, firstName, secondName, lastName);// чтобы сравнить через equals наших студентов и наши ФИО, мы будем создавать нового студента. 
        if(studentsGroup.getStudents() == null) return false;
        List<Student> studentsList = studentsGroup.getStudents();
        for(Student student: studentsList) {
            if(student.equals(removeStudent)) {
                studentsList.remove(student);
                return true;
            }
        }
        return false;
    }
}
