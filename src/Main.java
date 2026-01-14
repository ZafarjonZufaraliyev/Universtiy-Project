
public class Main {
    public static void main(String[] args) {

        UniversityManeger university=new UniversityManeger("TATU");

        Subject subjectJava=university.createSubject("Java",5);
        Subject subjectMath=university.createSubject("Math",2);
        Subject subjectPython=university.createSubject("Python",6);
        Subject subjectCpp=university.createSubject("C++",4);
        Subject subject=university.getsubjectByName("Java");

        /* DEAN */
        Dean dean=university.creatDean("ali","aliyev",12,"27.07.2005","Math",12d);

        System.out.println(university.getDeanEmployedDateById(dean.getId()));
        System.out.println(dean);

        /* Security*/

        Security security=university.createSecurity("Zafar","Zufarov",38,"2003-12-12",12d,"Geniral");
        Security security1=university.createSecurity("Umar","Zufarov",23,"1999-12-12",12d,"Serjant");

        Security[] securitiesArray=university.getSecurityListByMilitaryRank("Geniral");
        for (Security security2:securitiesArray){
            if(security2!=null){
                System.out.println(security2);

            }
        }
    }
}