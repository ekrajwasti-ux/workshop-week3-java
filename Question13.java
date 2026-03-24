package Workshop3;
class BankAccount6 {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount6() {
        this.accountNumber = 0;
        this.accountHolder = "Unknown";
        this.balance = 0.0;
    }

    public BankAccount6(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public BankAccount6(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
}

public class Question13 {
	public static void main(String[] args) {

	      
        BankAccount6 acc1 = new BankAccount6();


        BankAccount6 acc2 = new BankAccount6(11221, "Sandy");
        
        BankAccount6 acc3 = new BankAccount6(10112, "Shyam", 5012);

        System.out.println("Account 1: " + acc1.getAccountNumber() + ", " 
                           + acc1.getAccountHolder() + ", Balance: " + acc1.getBalance());

        System.out.println("Account 2: " + acc2.getAccountNumber() + ", " 
                           + acc2.getAccountHolder() + ", Balance: " + acc2.getBalance());

        System.out.println("Account 3: " + acc3.getAccountNumber() + ", " 
                           + acc3.getAccountHolder() + ", Balance: " + acc3.getBalance());
    }

}
