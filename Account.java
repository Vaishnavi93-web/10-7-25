public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance. Cannot be negative.");
        }
    }

    public static void main(String[] args) {
        Account acc = new Account();

        acc.setBalance(5000.75);

        System.out.println("Account Balance: " + acc.getBalance());

        acc.setBalance(-1000);
    }
}
