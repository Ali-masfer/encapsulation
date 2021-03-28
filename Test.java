public class Test {
    
    public static void main(String[] args) {
        
        Student student = new Student("Shahid", "Ali", 123);

        String firstName = student.getFirstName();
        String lastName = student.getLastName();

        System.out.println(firstName + " " + lastName);

        student.setLastName("Almalfai");

        System.out.println("The current last name is " + student.getLastName());
    }
}
