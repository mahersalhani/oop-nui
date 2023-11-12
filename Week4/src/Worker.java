public class Worker {
    private String name;
    private int salary;

    static int counter = 0;


    public Worker() {
        counter++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        try {
            if (salary < 0)
                throw new IllegalArgumentException("Salary cannot be negative.");
            this.salary = salary;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
