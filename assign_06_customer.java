
//Abdelrahman Ahmed Owies
//20216687
package BankSystem;

public class Customer extends Human{
    private String SSN;
    private String Address;
    private BankAccount bankAccount;
    public Customer(String name, int age, String gender, String SSN, String Address, BankAccount bankAccount) {
        super(name, age, gender);
        this.SSN = SSN;
        this.Address = Address;
        this.bankAccount = bankAccount;
    }

    @Override
    public void PrintData() {
        super.PrintData();
        System.out.println("SSN: " + SSN);
        System.out.println("Address: " + Address);
        System.out.println("Bank Balance: " + bankAccount.getBalance() + " $.");
    }
}
