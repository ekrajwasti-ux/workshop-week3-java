package Workshop3;
class BankAccount1 {
    private double balance;

    public void depositMoney(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    public void withdrawMoney(double amount) {
        if(amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Not enough balance!");
        }
        System.out.println("Current Balance: " + balance);
    }
}

public class Question5 {
	 public static void main(String[] args) {
	        BankAccount1 b = new BankAccount1();

	        b.depositMoney(10000);

	        b.withdrawMoney(9000);
	    }

}
