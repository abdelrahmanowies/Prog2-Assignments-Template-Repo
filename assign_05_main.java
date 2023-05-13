//Abdelrahman Ahmed Owies
//20216687
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        account1.initialize();

        Scanner sc = new Scanner(System.in);
        Double x = sc.nextDouble();

        account2.initialize(x);
        account2.Deposite();
        account2.Withdraw();

        System.out.println("Current balance is " + account2.balance + " $.");
        System.out.println("====================================================");
        System.out.println("Current number of users is " + BankAccount.NumOfUsers + (BankAccount.NumOfUsers == 1? " user." : " users."));
        System.out.println("Current number of calls is " + BankAccount.NumOfcalls + (BankAccount.NumOfcalls == 1? " call." : " calls."));
    }
}
