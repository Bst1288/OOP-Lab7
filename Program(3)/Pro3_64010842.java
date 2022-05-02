public class Pro3_64010842 {
    public static void main(String[] args){
        //------------------------Person------------------------//
        Person person = new Person();
		person.setName("Somsak");
        person.setAddress("1 Chalongkrung Road, Ladkrabang, BKK, 10520");
        person.setPhoneNumber("012-345-6789");
        person.setEmailAddress("somsak@mymail.com");
        //------------------------Student------------------------//
		Student student = new Student(Student.SENIOR);
		student.setName("Yuji Itadori");
        student.setAddress("Iroha-zaka Winding Roads , Japan, 1122");
        student.setPhoneNumber("023-242-7789");
        student.setEmailAddress("Yujiiii@mymail.com");
        //------------------------Employee------------------------//
		Employee employee = new Employee("Jujutsu company", 45500.00);
		employee.setName("Gojo Satoru");
        employee.setAddress("Norikuya Skyline Road , Japan, 1339");
        employee.setPhoneNumber("099-999-9999");
        employee.setEmailAddress("Gojoooo@mymail.com");
        //------------------------Faculty------------------------//
		Faculty faculty = new Faculty("9 hours", 5);
		faculty.setName("Takemichi Hanagaki");
        faculty.setAddress("Bandai Azuma Roadway , Japan, 0000");
        faculty.setPhoneNumber("077-777-777");
        faculty.setEmailAddress("Hanagaki@mymail.com");
        //------------------------Staff------------------------//
		Staff staff = new Staff("Tokyo industry", 75000.00, "CEO");
		staff.setName("Manjiro Sano");
        staff.setAddress("Bandai Azuma Roadway , Japan, 0000");
        staff.setPhoneNumber("033-333-333");
        staff.setEmailAddress("Mikeyyy_z@mymail.com");

        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------");
		System.out.println(person.toString());
        System.out.println("-------------------------------------------------------------------------------");
		System.out.println(student.toString());
        System.out.println("-------------------------------------------------------------------------------");
		System.out.println(employee.toString());
        System.out.println("-------------------------------------------------------------------------------");
		System.out.println(faculty.toString());
        System.out.println("-------------------------------------------------------------------------------");
		System.out.println(staff.toString());
        System.out.println("-------------------------------------------------------------------------------");
    }
}
