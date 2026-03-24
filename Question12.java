package Workshop3;
//BankAccount class
class BankAccount5 {
 private double balance;

 // parameterized constructor
 public BankAccount5(double balance) {
     this.balance = balance;
 }

 // getter
 public double getBalance() {
     return balance;
 }

 // setter
 public void setBalance(double balance) {
     this.balance = balance;
 }
}

//Customer class
class Customer {
 private int customerId;
 private String name;
 private BankAccount5 account;

 // parameterized constructor
 public Customer(int customerId, String name, BankAccount5 account) {
     this.customerId = customerId;
     this.name = name;
     this.account = account;
 }

 // getters
 public int getCustomerId() {
     return customerId;
 }

 public String getName() {
     return name;
 }

 public BankAccount5 getAccount() {
     return account;
 }

 // setters
 public void setCustomerId(int customerId) {
     this.customerId = customerId;
 }

 public void setName(String name) {
     this.name = name;
 }

 public void setAccount(BankAccount5 account) {
     this.account = account;
 }
}
public class Question12 {
	public static void main(String[] args) {

		  
        BankAccount5 acc1 = new BankAccount5(10111);
        BankAccount5 acc2 = new BankAccount5(200324);

        
        Customer c1 = new Customer(1, "Hareram", acc1);
        Customer c2 = new Customer(2, "Krishna", acc2);


        System.out.println("Customer 1 ID: " + c1.getCustomerId());
        System.out.println("Customer 1 Name: " + c1.getName());
        System.out.println("Customer 1 Balance: " + c1.getAccount().getBalance());

        System.out.println();

        System.out.println("Customer 2 ID: " + c2.getCustomerId());
        System.out.println("Customer 2 Name: " + c2.getName());
        System.out.println("Customer 2 Balance: " + c2.getAccount().getBalance());

        System.out.println();


        c1.setName("Hari");
        acc1.setBalance(15000);

        System.out.println("After Update:");
        System.out.println("Customer 1 Name: " + c1.getName());
        System.out.println("Customer 1 Balance: " + c1.getAccount().getBalance());
    }
	

}
