import java.time.LocalDate;

public class Dean {
    private  Integer id;
    private String name;
    private String surname;
    private Integer age;
    private String birthDate;
    private String faculty;
    private Double salary;
    private LocalDate employeDate;

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Dean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", birthDate='" + birthDate + '\'' +
                ", faculty='" + faculty + '\'' +
                ", salary=" + salary +
                ", employeDate=" + employeDate +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDate getEmployeDate() {
        return employeDate;
    }

    public void setEmployeDate(LocalDate employeDate) {
        this.employeDate = employeDate;
    }
}
