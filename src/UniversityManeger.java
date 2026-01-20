import javax.print.DocFlavor;
import java.time.LocalDate;
import java.util.Date;
import java.util.Stack;

public class UniversityManeger {

    private String universityname;
    private  int Id=1;

    // Subject
    private Subject [] subjectArray=new Subject[10];
        private int subjectIndex=0;

    // Dean
    private Dean[] deansArray =new Dean[10];
        private int deanIndex=0;

    // Security
    private  Security[] securitieArray=new Security[10];
        private  int securitieIndex=0;

    // Professor
    private Professor[] professorArray=new Professor[10];
        private int professorIndex=0;

    // Student
    private Student[] studentsArray=new Student[10];
        private int studentsIndex=0;

    //Exam
    private Exam[] examsArray=new Exam[10];
        private int examIndex=0;

    //Event
    private Event[] eventsArray=new Event[10];
        private int eventIndex=0;


    /*   University Manegr */
    public UniversityManeger(String universityname) {
        this.universityname = universityname;
    }
    public String getUniversityname() {
        return universityname;
    }


    /* Subject Manegr */
    public Subject createSubject(String name, int semester){
        Subject subject=new Subject();

        Subject exsist= getsubjectByName(name);
        if (exsist!=null ){
            System.out.println("Bu fan kiritilgan...");
            return null;
        }

        subject.setId(Id++);
        subject.setName(name);
        subject.setSemester(semester);

        if (!chekSubject(subject)) return null;

        if (subjectIndex == subjectArray.length){
            Subject [] newArr=new Subject[2*subjectArray.length];
            for (int i=0;i<subjectArray.length;i++){
                newArr[i]=subjectArray[i];
            }
            subjectArray=newArr;
        }

        subjectArray[subjectIndex++]=subject;
        return subject;
    }
    public Subject getsubjectByName(String name){
        for (Subject s:subjectArray){
            if (s!=null && s.getName().equals(name)) return s;
        }
        return null;
    }
    public Subject getSubjectById(Integer id){
        for (Subject s:subjectArray){
            if (s!=null && s.getId().equals(id)){
                return s;
            }
        }
        return null;
    }
    public boolean chekSubject(Subject subject){
        if (subject.getName()==null || subject.getName().length()<3){
            System.out.println("Fan xato !!!");
            return false;
        }
        if (subject.getSemester()<1){
            System.out.println("Semester xato !!!");
            return false;
        }

        return true;
    }


    /* Dekan Menager */
    public Dean creatDean(String name, String surname, Integer age, String birthDate, String faculty, Double salary){
        Dean dean=new Dean();

        Dean exists= getDeanByFaculty(dean.getFaculty());
        if (exists!=null) {
            System.out.println("Faculty da dekan mavjud...");
            return null;
        }
        dean.setId(Id++);
        dean.setName(name);
        dean.setSurname(surname);
        dean.setAge(age);
        dean.setFaculty(faculty);
        dean.setBirthDate(birthDate);
        dean.setSalary(salary);
        dean.setEmployeDate(LocalDate.now());

        if (deanIndex==deansArray.length){
            Dean newDeansArray[]=new Dean[2*deansArray.length];
            for (int i=0; i<deansArray.length;i++){
                newDeansArray[i]=deansArray[i];
            }
            deansArray=newDeansArray;
        }

        deansArray[deanIndex++]=dean;
        return dean;
    }
    public Dean getDeanByFaculty(String faculty){
        for (Dean d:deansArray){
            if (d!=null && d.getFaculty().equals(faculty)){
                return d;
            }
        }
        return null;
    }
    public Dean getDeanById(Integer id){
        for (Dean d:deansArray){
            if (d!=null && d.getId().equals(id)){
                return d;
            }
        }
    return null;
    }
    public LocalDate getDeanEmployedDateById(Integer id){
        for (Dean d:deansArray){
            if (d!=null && d.getId().equals(id)){
                return d.getEmployeDate();
            }
        }
        return null;
    }


    /* Security */
    public  Security createSecurity(String name, String surname, int age, String birthDate, Double salary, String militaryRank){
        Security security=new Security();
        security.setId(Id++);
        security.setName(name);
        security.setSurname(surname);
        security.setAge(age);
        security.setBirthDate(birthDate);
        security.setSalary(salary);
        security.setBirthDate(birthDate);
        security.setMilitaryRank(militaryRank);

        if (securitieArray.length==securitieIndex){
            Security [] newsecuritiesArray=new Security[2*securitieArray.length];
            for(int i=0;i<securitieArray.length;i++){
                newsecuritiesArray[i]=securitieArray[i];
            }
            securitieArray=newsecuritiesArray;
        }
        securitieArray[securitieIndex++]=security;

        return security;
    }
    public Security[] getSecurityListByMilitaryRank(String militaryRank){
        Security[] temp=new Security[securitieIndex];
        int index=0;
        for (Security security:securitieArray){
            if (security!=null && security.getMilitaryRank().contains(militaryRank)){
                temp[index]=security;
            }
        }
    return temp;
    }


    /* Professor */
    public Professor createProfessor(String name,String surname,String birthDate,Integer subjectId, int age,Double salary){
        Subject subject1=getSubjectById(subjectId);
        if (subject1==null){
            System.out.println("Subject not found");
            return  null;
        }

        Professor professor=new Professor();
        professor.setId(Id++);
        professor.setName(name);
        professor.setSurname(surname);
        professor.setAge(age);
        professor.setBirthDate(birthDate);
        professor.setSubject(subject1);
        professor.setSalary(salary);

        if (professorArray.length==professorIndex){
            Professor[] newprofessorArray=new Professor[professorArray.length*2];
            for (int i=0;i<professorArray.length; i++){
                newprofessorArray[i]=professorArray[i];
            }
            professorArray=newprofessorArray;
        }

        professorArray[professorIndex++]=professor;
        return professor;
    }
    public Professor getProfessorById(Integer id){
        for (Professor p:professorArray){
            if (p!=null && p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }
    public Professor getProfessorByNameAndBySurname(String name, String surname){
        for (Professor professor:professorArray){
            if (professor!=null && professor.getName().equals(name) && professor.getSurname().equals(surname)){
                return professor;
            }
        }
        return null;
    }
    public Professor[] getProfessorListBySubjectId(Integer subjectId){
        Professor [] localprofessorsArray=new Professor[professorIndex];
        int exesprofessorIndex=0;
        for (Professor professor:professorArray){
            if (professor!=null && professor.getSubject().getId().equals(subjectId)){
                localprofessorsArray[exesprofessorIndex++]=professor;

            }
        }
        return localprofessorsArray;
    }


    /* Student */
    public Student createStudent(String name,String surname,int age,String birthDate,Integer level){
        Student student=new Student();
        student.setId(Id++);
        student.setName(name);
        student.setSurname(surname);
        student.setAge(age);
        student.setBirthDate(birthDate);
        student.setLevel(level);
        if (studentsArray.length==studentsIndex){
            Student newStudentsArry[]=new Student[studentsArray.length*2];
            for (int i=0;i<studentsArray.length;i++){
                newStudentsArry[i]=studentsArray[i];
            }
            studentsArray=newStudentsArry;
        }
        studentsArray[studentsIndex++]=student;
        return student;
    }
    public Student addSubjectToStudent(Integer studentId,Integer subjectId){
        Student student=getStudentById(studentId);
        if (student==null){
            System.out.println("Student not found");
            return null;
        }
        Subject subject=getSubjectById(subjectId);
        if (subject==null){
            System.out.println("Subject not found");
            return null;
        }
        student.addSubject(subject);
        subject.addStudent(student);
        return student;
    }
    public Student getStudentById(Integer id){
        for (Student student:studentsArray){
            if (student!=null && student.getId().equals(id)){
                return student;
            }
        }
        return  null;
    }
    public Student[] getStudentListByLevel(Integer level){
        Student levelStudent[]=new Student[studentsIndex];
        int tempStudenIndex=0;
        for (Student student:studentsArray){
            if (student!=null && student.getLevel().equals(level)){
                levelStudent[tempStudenIndex++]=student;
            }
        }
        return levelStudent;
    }
    public Student[] getStudentListBySubjectId(Integer subjectId){
        Subject subject=getSubjectById(subjectId);
        if (subject==null){
            System.out.println("subject not found");
            return null;
        }
        return subject.getStudentsArray();
    }

    /* Exam */
    public Exam createExam(Integer student, Integer subject, Integer grade){
       Student student1=getStudentById(student);
        if (student1==null){
            System.out.println("Student not found");
            return null;
        }
        Subject subject1=getSubjectById(subject);
        if (subject1==null){
            System.out.println("Subject not found");
            return null;
        }
        Exam exam=new Exam();
        exam.setId(Id++);
        exam.setStudent(student1);
        exam.setSubject(subject1);
        exam.setGrade(grade);

        if (examsArray.length==examIndex){
            Exam newExamArry[]=new Exam[examsArray.length*2];
            for (int i=0;i<examsArray.length;i++){
                newExamArry[i]=examsArray[i];
            }
            examsArray=newExamArry;
        }
        examsArray[examIndex++]=exam;
        return exam ;
    }
    public Exam[] getStudentExamList(Integer Studentid){
        Exam[] tempexam=new Exam[examIndex];
        int tempindex=0;
        for (Exam exam:examsArray){
            if (exam!=null && exam.getStudentId().equals(Studentid)){
                tempexam[tempindex++]=exam;
            }
        }
        return tempexam;
    }
    public Exam[] getStudentListByExamSubjectId(Integer subjectId){
        Exam[] temStudent=new Exam[studentsIndex];
        int tempIndex=0;
        for (Exam exam:examsArray){
            if (exam!=null && exam.getSubjectId().equals(subjectId)){
                temStudent[tempIndex++]=exam;
            }
        }
        return temStudent;
    }
    public Exam[] getStudentListByExamGrate(Integer subjectId, Integer grade){
        Exam[] tempExam=new Exam[studentsIndex];
        int tepmExamIndex=0;
        for (Exam exam:examsArray){
            if (exam!=null && exam.getSubjectId().equals(subjectId) && exam.getGrade().equals(grade)){
                tempExam[tepmExamIndex++]=exam;
            }
        }
    return tempExam;
    }

    //Event
    public Event createEvent(String name,Integer professorid){
        Professor professor=getProfessorById(professorid);
        if (professor==null){
            System.out.println("Professor not found");
            return null;
        }
        Event event=new Event();
        event.setId(Id++);
        event.setName(name);
        event.setProfessor(professor);
        event.setCreatData(new Date());

        if (eventsArray.length==eventIndex){
            Event newEventArry[]=new Event[eventsArray.length*2];
            for (int i=0;i<eventsArray.length;i++){
                newEventArry[i]=eventsArray[i];
            }
            eventsArray=newEventArry;
        }

        eventsArray[eventIndex++]=event;
        return event;
    }
    public Event[] getEventListByProfessorId(Integer professorId){
        Event [] tempEventsArray=new Event[examIndex];
        int tempindex=0;
        for (Event event:eventsArray){
            if (event!=null && event.getProfessorId().equals(professorId)){
                tempEventsArray[tempindex]=event;
            }
        }
        return tempEventsArray;
    }



    public Object[] getAllEmployeeList(){
        Object[] obj=new Object[professorIndex+subjectIndex+deanIndex];
        int tempIndex=0;
        for (Professor professor:professorArray){
            if (professor!=null){
                obj[tempIndex++]=professor;
            }
        }
        for (Dean dean:deansArray){
            if (dean!=null){
                obj[tempIndex++]=dean;
            }
        }
        for (Security security:securitieArray){
            if (security!=null){
                obj[tempIndex++]=security;
            }
        }
        return obj;
    }
    public Double getAllEmployeeListSalary(){
        Double totoleSalary=0.0;
        for (Professor professor:professorArray){
            if (professor!=null){
                totoleSalary=totoleSalary+professor.getSalary();
            }
        }
        for (Dean dean:deansArray){
            if (dean!=null){
                totoleSalary=totoleSalary+dean.getSalary();
            }
        }
        for (Security security:securitieArray){
            if (security!=null){
                totoleSalary=totoleSalary+security.getSalary();
            }
        }
        return totoleSalary;
    }
}

