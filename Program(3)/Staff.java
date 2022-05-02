public class Staff extends Employee {

    private String title;

    public Staff(String office, double salary, String title){
        super(office, salary);
        this.title = title;
    }

    //---set methods---//
    public Staff setTitle(String title){
        this.title = title;
        return this;
    }

    //---get methods---//
    public String getTitle(){
        return title;
    }

    public String toString(){
        return super.toString() + 
        "Staff{office title=" + title + "}";
    }
}
