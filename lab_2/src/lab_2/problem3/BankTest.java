package lab_2.problem3;


public class BankTest {
    public static void main(String[] args) {
        Bank myBank = new Bank();

        SavingAccount sAcc = new SavingAccount(101, 5.0);

        CheckingAccount cAcc = new CheckingAccount(202);

        myBank.openAccount(sAcc);
        myBank.openAccount(cAcc);

        System.out.println("Работа с SavingsAccount");
        sAcc.deposit(1000.0);
        System.out.println("Баланс до: " + sAcc.getBalance());

        System.out.println("\nРабота с CheckingAccount");
        cAcc.deposit(500.0);
        cAcc.withdraw(50.0);
        cAcc.withdraw(20.0);
        cAcc.withdraw(10.0);
        cAcc.withdraw(5.0);
        cAcc.withdraw(2.0);
        cAcc.withdraw(1.0);

        System.out.println("Статус до обновления: ");
        myBank.showAccounts();

        System.out.println("\nОбновляем");
        myBank.update();

        // 4. Проверяем результат
        System.out.println("\nСтатус после: ");
        myBank.showAccounts();

        System.out.println("\nТест перевода");
        sAcc.transfer(100.0, cAcc);
        System.out.println("Saving после перевода: " + sAcc.getBalance());
        System.out.println("Checking после получения: " + cAcc.getBalance());
    }
}