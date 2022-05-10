package Lesson4;

public class BankAccount {
    int id;
    String name;
    double balance;

    void popolnenieScheta(double plus){
        balance += plus;
    }

    void snyatieSoScheta(double minus){
        balance -= minus;
    }
}

class BankAccountTest{
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();

        myAccount.id = 1;
        myAccount.name = "Zaur";
        myAccount.balance = 12.35;

        yourAccount.id = 2;
        yourAccount.name ="Mike";
        yourAccount.balance = 2.00;

        hisAccount.id = 3;
        hisAccount.name = "Ivan";
        hisAccount.balance = 124.12;

        System.out.println("Тукущее состояние счета: " + myAccount.balance);
        myAccount.popolnenieScheta(156.00);
        System.out.println("Произошло пополнение счета на 156.00. Теперь баланс счета: " + myAccount.balance);
        myAccount.snyatieSoScheta(50.00);
        System.out.println("Произошло списание со счета в размере 50.00. Теперь баланс счета: " + myAccount.balance);
    }
}