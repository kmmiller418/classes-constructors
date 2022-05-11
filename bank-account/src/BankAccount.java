public class BankAccount {
    private double balance;
    private String customerName;

    public BankAccount (double balance, String customerName) {
        this.balance = balance;
        this.customerName = customerName;
    }

    public void deposit (double amount) {
        balance += amount;
    }

    public void withdrawal (double amount) {
        balance -= amount;
    }

    public String getCustomerName(){
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return customerName +"'s account balance: " + balance;
    }
}
