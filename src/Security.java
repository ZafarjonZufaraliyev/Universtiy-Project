public class Security extends Employee{

    private String militaryRank;

    public String getMilitaryRank() {
        return militaryRank;
    }

    public void setMilitaryRank(String militaryRank) {
        this.militaryRank = militaryRank;
    }

    @Override
    public String toString() {
        return "Security{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", salary=" + salary +
                ", militaryRank='" + militaryRank + '\'' +
                '}';
    }
}
