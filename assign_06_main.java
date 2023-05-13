//Abdelrahman Ahmed Owies
//20216687
import BankSystem.*;
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Abdelrahman", 23, "Male", 5000.0, "Accounting");
        BankAccount bankAccount = new BankAccount(50000.0);
        Customer customer = new Customer("Ahmed", 50, "Male", "123456789", "Masaken El-Dobbat, El-Remaya", bankAccount);

        employee.getSalary();
        employee.getDepartment();
        employee.PrintData();

        System.out.println("====================================================");

        bankAccount.setBalance(5000.0);
        System.out.println("Balance is " + bankAccount.getBalance() + " $.");
        bankAccount.setBalance(10000.0, 10.0);
        System.out.println("Balance is " + bankAccount.getBalance() + " $.");

        System.out.println("====================================================");

        customer.Greet();
        customer.PrintData();
    }
}
