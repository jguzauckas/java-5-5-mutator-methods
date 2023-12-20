public class Student {
    private String firstName;
    private String lastName;
    private int idNumber;
    private int gradeLevel;

    public Student() {
        firstName = "";
        lastName = "";
        idNumber = -1;
        gradeLevel = -1;
    }

    public Student(String f, String l, int i, int g) {
        firstName = f;
        lastName = l;
        idNumber = i;
        gradeLevel = g;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIDNumber() {
        return idNumber;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }
}
