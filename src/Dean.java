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


    @Override
    public String toString() {
        return "Dean{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", birthDate='" + birthDate + '\'' +
                ", faculty='" + faculty + '\'' +
                ", salary=" + salary +
                ", employeDate=" + employeDate +
                '}';
    }
}
