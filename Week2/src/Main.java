import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.name = "John";
        worker.socialSecurityNumber = 123456789;
        worker.wage = 10.0f;
        worker.workingHours = 40;
        worker.displayInfo();
        worker.displaySalary();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        worker.name = scanner.nextLine();
        System.out.print("Enter social security number: ");
        worker.socialSecurityNumber = scanner.nextInt();
        System.out.print("Enter wage: ");
        worker.wage = scanner.nextFloat();
        System.out.print("Enter working hours: ");
        worker.workingHours = scanner.nextInt();
        worker.displayInfo();
        worker.displaySalary();
    }
}
