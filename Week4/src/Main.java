import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("You entered an invalid number.");
        }

        Worker worker1 = new Worker();
        worker1.setName("John");
        worker1.setSalary(1000);
        System.out.println(worker1);

        Worker worker2 = new Worker();
        worker2.setName("Mary");
        worker2.setSalary(-1000);
        System.out.println(worker2);

        Worker worker3 = new Worker();
        worker3.setName("Peter");
        worker3.setSalary(2000);
        System.out.println(worker3);

        System.out.println("Number of workers: " + Worker.counter);
    }
}
