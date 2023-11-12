public class Main {
    public static void main(String[] args) {
        Account account = new Account("John Doe", 1000);
        System.out.println(account);
        account.add(500);
        System.out.println(account);
        account.withdraw(200);
        System.out.println(account);
    }
}
