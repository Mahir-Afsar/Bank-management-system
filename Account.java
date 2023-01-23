package Assignment;

public class Account {
	
	protected String name;
	protected int accountNumber;
	protected double balance;
	protected double interestRate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void deposit(double amount){
		double addedBalance=0;
		if(amount>0){
			addedBalance=this.getBalance()+amount;
			this.setBalance(addedBalance);
			System.out.println("Account name: "+this.name);
			System.out.println("Deposit money: "+addedBalance);
			System.out.println("Balance: "+getBalance());
		}
	}
	public void transfer(Account a, double amount){
		
		if(this.balance>=amount){
			this.balance += amount;
			a.balance -= amount;
			System.out.println("Account of "+this.name+" becomes $ "+this.balance);
			System.out.println("Account of "+a.name+" becomes $ "+a.balance);
			
		}
		else {
			System.out.println("Transfer fails");
		}
		}
	
	public void addInterest(double rate){
		System.out.println("Interest rate is:" +rate+"%");
		double interest=balance*(rate/100);
	    System.out.println("Interest amount is:"+interest);    
	    }

	 public void withdraw(double withDamount) {}
	
}
