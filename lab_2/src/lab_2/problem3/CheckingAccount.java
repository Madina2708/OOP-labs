package lab_2.problem3;

public class CheckingAccount extends Account {
    private int counter;
    private static final int LIMIT = 5; //FREE TRANSACTIONS
    private static final double TAX = 0.02;

    public CheckingAccount(int a) {
        super(a);
        this.counter = 0;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        counter++;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        counter++;
    }

    public void deductFee() {
        if (counter > LIMIT) {
            int payableTrans = counter - LIMIT;
            double charge = payableTrans * TAX;
            balance -= charge;
        }
        counter = 0;
    }

    @Override
    public String toString() {
        return super.toString() + " | Ops done: " + counter;
    }
}