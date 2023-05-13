//Abdelrahman Ahmed Owies
//20216687
public class BankAccount {
    public double balance;
    public String username;
    public String bankname;
    public final String countryname = "Egypt";
    public static int NumOfUsers = 0;
    public static int NumOfcalls = 0;

    public BankAccount() {
        balance = 0;
        username = "";
        bankname = "";
        NumOfUsers++;
        System.out.println("Bank Account #" + NumOfUsers + ": created successfully !!!");
    }

    public BankAccount(double value) {
        balance = value;
        username = "";
        bankname = "";
        NumOfUsers++;
        System.out.println("Bank Account #" + NumOfUsers + ": created successfully !!!");
    }

    public void initialize() {
        balance = 0;
        username = "";
        bankname = "";
    }

    public void initialize(double x) {
        balance = x;
        username = "";
        bankname = "";
    }

    public void Deposite() {
        balance += 50.0;
        NumOfcalls++;
    }

    public void Withdraw() {
        balance -= 100.00;
        NumOfcalls++;
    }
}
