package Workshop3;
class BankAccount2 {
    int accountNumber;
    double balance;
    String name;

    BankAccount2(int accNo, double bal, String n) {
        accountNumber = accNo;
        balance = bal;
        name = n;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Name: " + name);
    }
}

public class Question7 {
	public static void main(String[] args) {

        BankAccount2 b = new BankAccount2(240409, 1000, "Hari");

        b.display();
    }

}
