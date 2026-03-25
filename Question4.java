package Workshop3;

public class Question4 {
	public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.setAccountNumber(404043);
        acc.setBalance(40404);
        acc.setAccountHolderName("Ekraj Wasti");
        acc.setAccountHolderAddress("Chitwan");

        System.out.println("accountnumber "+acc.getAccountNumber());
        System.out.println("accountbalance "+acc.getBalance());
        System.out.println("accountholder "+acc.getAccountHolderName());
        System.out.println("accountholderaddress "+acc.getAccountHolderAddress());
    }
    

}
