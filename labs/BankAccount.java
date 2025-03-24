package window;

public class BankAccount {
	private String name;
	private double balance = 0;
	
	
	public BankAccount() {
		name = "Unknown user";
	}
	
	public BankAccount(String name, double balance) {
		this.name  = name;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	
	public void deposit(double amount) {
		balance+=amount;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public double getBalance() {
		return balance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount("C3PO", 1000);
		account1.deposit(5);
		account1.setName("Yoda");
		System.out.println(account2.getName() + " " + account2.getBalance());
		
	}

}
