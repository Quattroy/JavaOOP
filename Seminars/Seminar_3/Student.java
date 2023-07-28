package ProjectOOP.Seminars.Seminar_3;

public class Student {
    private Integer numberOfStudent;
    private String firstName;
    private String secondName;
    private String lastName;

    public Student(Integer numberOfStudent, String firstName, String secondName, String lastName){
        this.numberOfStudent = numberOfStudent;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public int getNumberOfStudents(){
        return numberOfStudent;
    }

    public void setNumberOfStudent(int number) {
        this.numberOfStudent = number;
    }

    public String getfirstName(){
        return firstName;
    }

    public void setfirstName(String name) {
        this.firstName = name;
    }

    public String getsecondName(){
        return secondName;
    }

    public void setsecondName(String name) {
        this.secondName = name;
    }

    public String getlastName(){
        return lastName;
    }

    public void setlastName (String name) {
        this.lastName = name;
    }

    @Override
    public boolean equals(Object o) { // Object o, чтобы не писать String firstName, String secondName, String lastName
        if(this == o) {
            return true;
        }
        Student student = (Student) o;
        return (this.firstName.equals(student.firstName) 
        && this.secondName.equals(student.secondName)
        && this.lastName.equals(student.lastName));
    }
    
    @Override
    public String toString() {
        return "Student{" + "numbersOfStudent=" + numberOfStudent + ", firstName'" +
    '\'' + ", secondName='" + secondName + '\'' + ", lastName='" + lastName + '\'' + '}';
    }
}
