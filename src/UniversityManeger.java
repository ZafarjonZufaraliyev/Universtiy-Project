import javax.print.DocFlavor;
import java.time.LocalDate;

public class UniversityManeger {

    private String universityname;
    private  int Id=1;

    //Subject
    private Subject [] subjectArray=new Subject[10];
        private int subjectIndex=0;

    //Dean
    private Dean[] deansArray =new Dean[10];
        private int deanIndex=0;


    /*
    University Manegr
     */
    public UniversityManeger(String universityname) {
        this.universityname = universityname;
    }

    public String getUniversityname() {
        return universityname;
    }

    /*
    Subject Manegr
     */
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

    public  Subject getSubjectById(int Id){
        for (Subject s:subjectArray){
            if (s!=null && s.getId().equals(s.getId())){
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

    /*
    Dekan Menager
     */
    public  Dean creatDean(String name, String surname, Integer age, String birthDate, String faculty, Double salary, LocalDate employeDate){
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
}
