
public class Main {
    public static void main(String[] args) {

        UniversityManeger university=new UniversityManeger("TATU");

        Subject subjectJava=university.createSubject("aza",1);
        Subject subjectaa=university.createSubject("aza",2);

//        Subject subject= university.getSubjectById(subjectJava.getId());
//        System.out.println(subject.getName());

    }
}