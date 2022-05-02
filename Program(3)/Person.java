public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person(){

    }

    public Person(String name, String address, String phoneNumber, String emailAddress){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    //---set methods---//
    public Person setName(String name){
        this.name = name;
        return this;
    }

    public Person setAddress(String address){
        this.address = address;
        return this;
    }

    public Person setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Person setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
        return this;
    }

    //---get methods---//
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    //---toString---//
    public String toString(){
        return "Person" + "{" +
                "Name=" + name +
                ", Address=" + address +
                ", \nPhoneNumber=" + phoneNumber +
                ", email=" + emailAddress + "}";
    }
}
