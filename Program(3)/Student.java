public class Student extends Person {

    protected final String STATUS;
    public static final String FRESHMAN = "freshman";
    public static final String SOPHOMORE = "sophomore";
    public static final String JUNIOR = "junior";
    public static final String SENIOR = "senior";

    public Student(String STATUS) {
        this.STATUS = STATUS;
    }

    public Student(String name, String address, String phoneNumber, String emailAddress, String STATUS){
        super(name, address, phoneNumber, emailAddress);
        this.STATUS =STATUS;
    }

    //---toString---//
    public String toString(){
        return "Student" +
                "\nName : " + this.getName() +
                "\nAddress : " + this.getAddress() +
                "\nPhone : " + this.getPhoneNumber() +
                "\nEmail : " + this.getEmailAddress() +
                "\n" + super.toString() +
                "\nStudent{status=" + STATUS + "}";
    }
    
}
