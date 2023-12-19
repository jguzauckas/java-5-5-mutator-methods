public class NotesMutator2 {
    public static void main(String[] args) {
        Person person1 = new Person("Mr. G", 25);
        System.out.println(person1.getAge());

        person1.setAge(26);
        System.out.println(person1.getAge());

        person1.setAge(-5);
        System.out.println(person1.getAge());

        person1.setAge(130);
        System.out.println(person1.getAge());

        person1.setAge(25);
        System.out.println(person1.getAge());
    }
}
