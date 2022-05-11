public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(500, "Kaneka");
        myAccount.deposit(100);
        System.out.println(myAccount);

        BankAccount larryAccount = new BankAccount(5000, "Larry");
        BankAccount maryAccount = new BankAccount(400, "Mary");

        larryAccount.withdrawal(100);
        maryAccount.deposit(100);

        System.out.println(larryAccount);
        System.out.println(maryAccount);
    }
}
