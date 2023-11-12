public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(5.0);
        circles[1] = new Circle(10.0);
        circles[2] = new Circle(15.0);

        for (Circle circle : circles) {
            circle.computeArea();
        }

        System.out.println("+------------------+");

        Teacher[] teachers = new Teacher[4];
        teachers[0] = new Teacher(1, Branch.MATH);
        teachers[1] = new Teacher(2, Branch.PHYSICS);
        teachers[2] = new Teacher(3, Branch.CS);
        teachers[3] = new Teacher(4, Branch.ENG);

        for (Teacher teacher : teachers)
            System.out.println(teacher);
    }
}
