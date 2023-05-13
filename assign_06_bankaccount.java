
//Abdelrahman Ahmed Owies
//20216687
package BankSystem;

public final class BankAccount {
    private Double balance;
    public BankAccount(){
        balance = 0.0;
    }
    public BankAccount(Double balance){
        this.balance = balance;
    }
    public BankAccount(BankAccount account){
        this.balance = account.balance;
    }
    public Double getBalance(){
        return balance;
    }
    public void setBalance(Double value){
        if (value >=0 && value <=1000000){
            this.balance += value;
        }
    }
    public void setBalance(Double value, Double tax){
        if (value >=0.0 && value <=1000000.0){
            this.balance += balance - (balance * (tax/100.0));
        }
    }
}
