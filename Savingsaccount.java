package Assignment;

public class Savingsaccount extends Account{
	 public void interestRate(Double interest){
	        System.out.println("Interest rate is:"+interest);
	        Double interestAmount=super.balance*(interest/100);
	        System.out.println("Interest amount:"+interestAmount);
	    }
	 
	 public void withdraw(double amount){
	        if(super.balance>100 && amount<super.balance){
	            super.balance-=amount;
	            System.out.println("Account name: "+super.name);
	            System.out.println("Withdraw amount:"+amount);
	            System.out.println("Remaining amount:"+super.balance);

	        }
	        else{
	            System.out.println("You don't have sufficient amount");
	        }
	 }
}
