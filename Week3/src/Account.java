import java.util.Scanner;

public class Account {
    private double balance;
    private String ownerName;

    public Account(String name, double initialBalance) {
        ownerName = name;
        balance = initialBalance;
    }

    public void add(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        int password = 1234;
        Scanner input = new Scanner(System.in);
        int tries = 0;
        while (tries < 3) {
            System.out.print("Enter your password: ");
            int userPassword = input.nextInt();
            if (userPassword == password) {
                balance -= amount;
                break;
            } else {
                System.out.println("Wrong password, try again.");
            }

            if (tries == 2) {
                System.out.println("You account has been blocked, please try again later.");
            }

            tries++;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
