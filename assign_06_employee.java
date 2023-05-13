
//Abdelrahman Ahmed Owies
//20216687
package BankSystem;

public class Employee extends Human{
    private Double salary;
    private String department;
    public Employee(String name, int age, String gender, Double salary, String department) {
        super(name, age, gender);
        this.salary = salary;
        this.department = department;
    }

    @Override
    public void PrintData() {
        super.PrintData();
        System.out.println("Salary: " + salary + " $");
        System.out.println("Department: " + department);
    }
    public Double getSalary(){
        return salary;
    }
    public String getDepartment(){
        return department;
    }
}
