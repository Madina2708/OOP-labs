package lab_2.problem3;

public class Account {
    protected double balance;
    private int accNumber;

    public Account(int a) {
        this.accNumber = a;
        this.balance = 0.0;
    }

    public void deposit(double sum) {
        balance += sum;
    }

    public void withdraw(double sum) {
        if (sum <= balance) {
            balance -= sum;
        } else {
            System.out.println("No money");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accNumber;
    }

    public void transfer(double amount, Account acc) {
        if (balance >= amount) {
            this.withdraw(amount);
            acc.deposit(amount);
        }
    }
    @Override
    public String toString() {
        return "Account " + accNumber + ": balance = " + balance;
    }

    public final void print() {
        System.out.println(toString());
    }
}
