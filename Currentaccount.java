package Assignment;

public class Currentaccount extends Account{
	  public void withdraw(double amount){
	        if(super.balance>=0 && amount<super.balance){
	            super.balance-=amount;
	            System.out.println("Account name: "+super.name);
	            System.out.println("Withdraw amount:"+amount);
	            System.out.println("Remaining balance:"+super.balance);

	        }
	        else{
	            System.out.println("invalid amount");
	        }
	        
	    }
	    
}
