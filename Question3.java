package Workshop3;
class BankAccount {
    
    private int accountNumber;
    private double balance;
    private String accountHolderName;
    private String accountHolderAddress;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderAddress() {
        return accountHolderAddress;
    }

    public void setAccountHolderAddress(String accountHolderAddress) {
        this.accountHolderAddress = accountHolderAddress;
    }
}

public class Question3 {
	public static void main(String[] args) {
        
	       
        BankAccount acc = new BankAccount();

        acc.setAccountNumber(000949);
        acc.setBalance(50000);
        acc.setAccountHolderName("Ekraj Wasti");
        acc.setAccountHolderAddress("Biratnagar");

      
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Balance: " + acc.getBalance());
        System.out.println("Account Holder Name: " + acc.getAccountHolderName());
        System.out.println("Account Holder Address: " + acc.getAccountHolderAddress());
    }

}
