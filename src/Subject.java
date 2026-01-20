public class Subject {
    private Integer id;
    private String name;
    private int semester;
    private Student[] studentsArray=new Student[10];
    private int studentsIndex=0;

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", semester=" + semester +
                '}';
    }

    public Student[] getStudentsArray() {
        return studentsArray;
    }

    public void addStudent(Student student){
        if (studentsArray.length==studentsIndex){
            Student newStudentArray[]=new Student[studentsArray.length*2];
            for (int i=0; i<studentsArray.length;i++){
                newStudentArray[i]=studentsArray[i];
            }
            studentsArray=newStudentArray;
        }
        studentsArray[studentsIndex++]=student;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public int getSemester() {
        return semester;
    }
}
