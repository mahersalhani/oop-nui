public class Person {
//    initialize variables
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private static int counter = 0;

    public Person(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName) {
        this(++counter, firstName, lastName, 0);
    }

    public Person(int id) {
        this(id, "", "", 0);
    }

    public Person() {
        this(++counter, "", "", 0);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
