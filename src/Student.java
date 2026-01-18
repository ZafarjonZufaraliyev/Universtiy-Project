public class Student extends Person {

    private Integer level;

    private Subject[] subjectArray=new Subject[10];
    private int subjectIndex=0;

    public void addSubject(Subject subject){
        if (subjectArray.length==subjectIndex){
            Subject newSubjectArray[]=new Subject[subjectArray.length*2];
            for (int i=0; i<subjectArray.length;i++){
                newSubjectArray[i]=subjectArray[i];
            }
            subjectArray=newSubjectArray;
        }

        subjectArray[subjectIndex++]=subject;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Subject[] getSubjectArray(){
        return subjectArray;
    }
    @Override
    public String toString() {
        return "Student{" +
                "birthDate='" + birthDate + '\'' +
                ", age=" + age +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", level=" + level +
                '}';
    }
}
