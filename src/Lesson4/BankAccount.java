package Lesson4;

public class BankAccount {
    int id;
    String name;
    double balance;
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

        System.out.println(myAccount.id);
        System.out.println(hisAccount.name);
    }
}