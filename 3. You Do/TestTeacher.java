public class TestTeacher {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mr.", "Guzauckas", "Computer Science", 9, 12);

        System.out.println(teacher1.getTitle());
        System.out.println(teacher1.getLastName());
        System.out.println(teacher1.getSubject());
        System.out.println(teacher1.getMinGradeLevel());
        System.out.println(teacher1.getMaxGradeLevel());
        System.out.println();

        teacher1.setTitle("Dr.");
        teacher1.setLastName("G");
        teacher1.setSubject("Math and Computer Science");
        teacher1.setMinGradeLevel(10);
        teacher1.setMaxGradeLevel(11);

        System.out.println(teacher1.getTitle());
        System.out.println(teacher1.getLastName());
        System.out.println(teacher1.getSubject());
        System.out.println(teacher1.getMinGradeLevel());
        System.out.println(teacher1.getMaxGradeLevel());
        System.out.println();

        teacher1.setMinGradeLevel(0);
        teacher1.setMinGradeLevel(13);
        teacher1.setMaxGradeLevel(0);
        teacher1.setMaxGradeLevel(13);

        System.out.println(teacher1.getMinGradeLevel());
        System.out.println(teacher1.getMaxGradeLevel());
    }
}
