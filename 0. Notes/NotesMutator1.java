public class NotesMutator1 {
    public static void main(String[] args) {
        Person person1 = new Person("Mr. G", 25);
        System.out.println(person1.getName());

        person1.setName("John");
        System.out.println(person1.getName());

        person1.setName("Guzauckas");
        System.out.println(person1.getName());
    }
}
