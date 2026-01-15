public class Security extends Person{

    private String militaryRank;

    public String getMilitaryRank() {
        return militaryRank;
    }

    public void setMilitaryRank(String militaryRank) {
        this.militaryRank = militaryRank;
    }

//    @Override
//    public String toString() {
//        return "Security{" +
//                "id=" + getId() +
//                ", name='" + getName() + '\'' +
//                ", surname='" + getSurname() + '\'' +
//                ", birthDate='" + getBirthDate() + '\'' +
//                ", salary=" + getSalary() +
//                ", militaryRank='" + militaryRank + '\'' +
//                '}';
//    }
}
