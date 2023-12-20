public class Teacher {
    private String title;
    private String lastName;
    private String subject;
    private int minGradeLevel;
    private int maxGradeLevel;

    public Teacher() {
        title = "";
        lastName = "";
        subject = "";
        minGradeLevel = -1;
        maxGradeLevel = -1;
    }

    public Teacher(String t, String l, String s, int min, int max) {
        title = t;
        lastName = l;
        subject = s;
        minGradeLevel = min;
        maxGradeLevel = max;
    }

    public String getTitle() {
        return title;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public int getMinGradeLevel() {
        return minGradeLevel;
    }

    public int getMaxGradeLevel() {
        return maxGradeLevel;
    }
}
