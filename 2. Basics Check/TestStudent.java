public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Guzauckas", 123456, 18);

        System.out.println(student1.getFirstName());
        System.out.println(student1.getLastName());
        System.out.println(student1.getIDNumber());
        System.out.println(student1.getGradeLevel());
        System.out.println();

        student1.setFirstName("Jack");
        student1.setLastName("G");
        student1.setIDNumber(654321);
        student1.setGradeLevel(12);

        System.out.println(student1.getFirstName());
        System.out.println(student1.getLastName());
        System.out.println(student1.getIDNumber());
        System.out.println(student1.getGradeLevel());
        System.out.println();

        student1.setGradeLevel(-5);
        student1.setGradeLevel(14);

        System.out.println(student1.getGradeLevel());
    }
}
