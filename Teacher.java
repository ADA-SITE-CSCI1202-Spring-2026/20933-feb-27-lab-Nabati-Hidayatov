public class Teacher extends Person {
    private String department;
    private String courses;
    public Teacher(String firstName, String lastName, String gender,
                   String department, String courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }
    public String getDepartment() {
        return department;
    }
    public String getCourses() {
        return courses;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setCourses(String courses) {
        this.courses = courses;
    }
    @Override
    public String toString() {
        return "Teacher{" +
               "firstName='" + getFirstName() + '\'' +
               ", lastName='" + getLastName() + '\'' +
               ", gender='" + getGender() + '\'' +
               ", department='" + department + '\'' +
               ", courses='" + courses + '\'' +
               '}';
    }
    public boolean equals(Teacher t) {
        if (t == null) return false;
        return super.equals(t)
            && safeEquals(this.department, t.department)
            && safeEquals(this.courses, t.courses);
    }
    private boolean safeEquals(String a, String b) {
        if (a == null) return b == null;
        return a.equals(b);
    }
}