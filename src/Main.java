
public class Main {
    public static void main(String[] args) {

        UniversityManeger university=new UniversityManeger("TATU");

        //Subject
        Subject subjectJava=university.createSubject("Java",5);
        Subject subjectMath=university.createSubject("Math",2);
        Subject subjectPython=university.createSubject("Python",6);
        Subject subjectCpp=university.createSubject("C++",4);

//        Subject subject=university.getsubjectByName("Java");
//        Subject subjectId=university.getSubjectById(subjectCpp.getId());

//        System.out.println(subjectId);
//        System.out.println(subjectId);
//
//
//        // DEAN
//        Dean dean=university.creatDean("ali","aliyev",12,"27.07.2005","Math",12d);
//
//        Dean dean1=university.getDeanById(dean.getId());
//        System.out.println(dean1);
//
//
//        /* Security*/
//        Security security=university.createSecurity("Zafar","Zufarov",38,"2003-12-12",12d,"Geniral");
//        Security security1=university.createSecurity("Umar","Zufarov",23,"1999-12-12",12d,"Serjant");
//
//        System.out.println(security1);
//        Security[] securitiesArray=university.getSecurityListByMilitaryRank("Geniral");
//        for (Security security2:securitiesArray){
//            if(security2!=null){
//                System.out.println(security2);
//            }
//        }

        /* Professor */

        Professor professor1=university.createProfessor("Sardor","Olimov","1988-12-12",subjectJava.getId(),23,400230d);
        Professor professor2=university.createProfessor("Anvar","Aliyev","1911-12-12",subjectJava.getId(),55,120000d);
        Professor professor3=university.createProfessor("Golib","Xojiyev","2000-07-12",subjectCpp.getId(),45,34000d);

        Professor[] tempProfessor=university.getProfessorListBySubjectId(subjectJava.getId());
        for (Professor professor:tempProfessor){
            if (professor!=null){
                System.out.println(professor);
            }
        }
        System.out.println();
//        System.out.println(professor1);
//        System.out.println(professor2);
//        System.out.println(professor3);
//        Professor tempProfessor=university.getProfessorById(professor1.getId());
//        System.out.println(university.getProfessorByNameAndBySurname("Sardor","Olimov"));
//        System.out.println(tempProfessor);

    }
}