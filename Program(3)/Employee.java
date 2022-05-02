import java.util.Date;

public class Employee extends Person {

    private String office;
    private double salary;
    private Date date_hired;

    public Employee(String office, double salary){
        this.office = office;
        this.salary = salary;
        this.date_hired = new Date();
    }

    //---set methods---//
    public Employee setOffice(String office){
        this.office = office;
        return this;
    }

    public Employee setSalary(double salary){
        this.salary = salary;
        return this;
    }

    //---get methods---//
    public String getOffice(){
        return office;
    }

    public double getSalary(){
        return salary;
    }

    //---toString---//
    public String toString(){
        return "Employee" +
        "\nName : " + this.getName() +
        "\nAddress : " + this.getAddress() +
        "\nPhone : " + this.getPhoneNumber() +
        "\nEmail : " + this.getEmailAddress() +
        "\n" + super.toString() +
        "\nEmplyee{Office=" + office +
        " ,salary=" + salary +"}"+"\n";
    }
}
