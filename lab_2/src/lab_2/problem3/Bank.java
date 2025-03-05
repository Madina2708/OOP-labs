package lab_2.problem3;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void openAccount(Account a) {
        accounts.add(a);
    }
    public void closeAccount(Account a) {
        accounts.remove(a);
    }
    public void update() {
        for (Account a : accounts) {
            if (a instanceof SavingAccount) {
                ((SavingAccount) a).addInterest();
            }
            else if (a instanceof CheckingAccount) {
                ((CheckingAccount) a).deductFee();
            }
        }
    }

    public void showAccounts() {
        System.out.println("Bank Accounts");
        for (Account a : accounts) {
            System.out.println(a.toString());
        }
    }
}
