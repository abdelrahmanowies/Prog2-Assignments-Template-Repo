
//Abdelrahman Ahmed Owies
//20216687
package BankSystem;

class Human {
    protected String Name;
    protected int Age;
    protected String Gender;
    public Human(String name, int age, String gender){
        this.Name = name;
        this.Age  = age;
        this.Gender = gender;
    }
    public void PrintData(){
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Gender: " + Gender);
    }
    public final void Greet(){
        System.out.println("Good Morning");
    }
}
