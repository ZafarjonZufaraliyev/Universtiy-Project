import java.util.Date;

public class Event {
    private Integer id;
    private Professor professor;
    private String name;
    private Date creatData;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProfessorId() {
        return professor.getId();
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatData() {
        return creatData;
    }

    public void setCreatData(Date creatData) {
        this.creatData = creatData;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", professor=" + professor +
                ", name='" + name + '\'' +
                ", creatData=" + creatData +
                '}';
    }
}
