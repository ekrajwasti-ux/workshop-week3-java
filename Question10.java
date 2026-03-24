package Workshop3;
class BankAccount3 {
    
    private double balance;

    public BankAccount3(double balance) {
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }
}

public class Question10 {
	public static void main(String[] args) {

        BankAccount3 account = new BankAccount3(5000.0);


        System.out.println("Balance: " + account.getBalance());
    }

}
