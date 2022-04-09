package Lesson5;

public class BankAccount {

    int id;
    String name;
    double balance;


    double rechargeAccount(double rechargeSum){
        balance-=rechargeSum;
        return balance;
    }


    double distractAccount(double distractSum){
        balance-=distractSum;
        return balance;
    }

}

class BankAccountTest {
    public static void main(String []args) {

        BankAccount myAccount = new BankAccount();
        myAccount.id = 12345;
        myAccount.name = "Valeria";
        myAccount.balance = 138773.00;

        BankAccount hisAccount = new BankAccount();
        hisAccount.id = 54321;
        hisAccount.name = "Aleksey";
        hisAccount.balance = 800765.00;

        BankAccount momsAccount = new BankAccount();
        momsAccount.id = 34567;
        momsAccount.name = "Tatiana";
        momsAccount.balance = 980567.00;

        System.out.println(momsAccount.rechargeAccount(0.23));
        System.out.println(myAccount.distractAccount(130000.00));

    }
}
