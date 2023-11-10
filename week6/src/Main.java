public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1, "John", "Doe", 30);
        Person person2 = new Person("Jane", "Doe");
        Person person3 = new Person(3);
        Person person4 = new Person();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
    }
}
