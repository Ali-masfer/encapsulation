public class Student {

    private String firstName;
    private String lastName;
    private int UID;
    
    public Student(String firstName, String lastName, int uID) {
        this.firstName = firstName;
        this.lastName = lastName;
        UID = uID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getUID() {
        return UID;
    }

    public void setUID(int uID) {
        UID = uID;
    }

}