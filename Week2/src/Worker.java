public class Worker {
    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours;

    public void displayInfo() {
        System.out.println(name + " " + socialSecurityNumber);
    }

    public void displaySalary() {
        System.out.println("salary= " + wage * workingHours);
    }
}
