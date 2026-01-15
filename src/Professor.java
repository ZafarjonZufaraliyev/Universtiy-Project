public class Professor extends  Person{
    private Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
//
//    @Override
//    public String toString() {
//        return "Professor{" +
//                "id=" + getId() +
//                ", name='" + getName() + '\'' +
//                ", surname='" + getSurname() + '\'' +
//                ", birthDate='" + getBirthDate()+ '\'' +
//                ", subjectId=" + subject +
//                ", salary=" + getSalary() +
//                '}';
//    }

}
