import java.time.LocalDate;

public class Dean extends Person{

    private String faculty;
    private LocalDate employeDate;

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public LocalDate getEmployeDate() {
        return employeDate;
    }

    public void setEmployeDate(LocalDate employeDate) {
        this.employeDate = employeDate;
    }


//    @Override
//    public String toString() {
//        return "Dean{" +
//                "id=" + getId() +
//                ", name='" + getName() + '\'' +
//                ", surname='" + getSurname() + '\'' +
//                ", age=" + getAge() +
//                ", birthDate='" + getBirthDate() + '\'' +
//                ", faculty='" + faculty + '\'' +
//                ", salary=" + getSalary() +
//                ", employeDate=" + employeDate +
//                '}';
//    }
}
