public class Person {
    private String firstName;
    private String lastName;
    private String gender;
    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getGender() {
        return gender;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Person{firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", gender='" + gender + '\'' +
               '}';
    }
    public boolean equals(Person p) {
        if (p == null) return false;
        return safeEquals(this.firstName, p.firstName)
            && safeEquals(this.lastName, p.lastName)
            && safeEquals(this.gender, p.gender);
    }
    private boolean safeEquals(String a, String b) {
        if (a == null) return b == null;
        return a.equals(b);
    }
}