public class Faculty extends Employee {

    private String officeHours;
    private int rank;

    public Faculty(String officeHours, int rank) {
        super("Revange industry", 90000.00);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    //---set methods---//
    public Faculty setOfficeHours(String officeHours){
        this.officeHours = officeHours;
        return this;
    }

    public Faculty setRank(int rank){
        this.rank = rank;
        return this;
    }

    //---get methods---//
    public String getOfficeHours(){
        return officeHours;
    }

    public int getRank(){
        return rank;
    }

    //---toString---//
    public String toString(){
        return super.toString() + 
                "Faculty{office hours=" + officeHours +
                ", rank=" + rank + "}";
    }
}
