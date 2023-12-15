public class StudentApp {
    public static void main(String[] args) {
        BachelorStudent student1 = new BachelorStudent(1, 69, 91);
        MasterStudent student2 = new MasterStudent(2, 71, 68, 4);
        PhDStudent student3 = new PhDStudent(3, 80, 90, 70);

        printStudentTotalScore(student1);
        printStudentTotalScore(student2);
        printStudentTotalScore(student3);
    }

    public static void printStudentTotalScore(Student student) {
        System.out.println(student.computeTotalScore());
    }
}
