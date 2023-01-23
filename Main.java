package Assignment;

import java.util.Scanner;
public class Main {

	public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        Account current=new Currentaccount();
        Account savings=new Savingsaccount();
        int choice,choice1,choice2,choice3,choice4;
        int savingsAccount=0;
        int currentAccount=0;
        do
        {
        	
            System.out.println ("1.Add new account");
            System.out.println ("2.Deposit");
            System.out.println ("3.withdraw");
            System.out.println ("4.Transfer");
            System.out.println ("5.Change Savings interest rate");
            System.out.println ("6.exit");
            System.out.print("Please Enter Number to Select :");
           
            choice=scanner.nextInt();
            
            switch (choice) {
                
                case 1:
                do{
                   
                System.out.println("Select an option:");
                System.out.println("1.Add Savings Account");
                System.out.println("2.Add current Account");
                System.out.println("3.Back");
                choice1=scanner.nextInt();
                switch(choice1){
                    case 1:

                    System.out.println("Enter name:");
                    String savingName=sc.nextLine();
                    savings.setName(savingName);

                    System.out.println("Enter account number:");
                    int savingNum=scanner.nextInt();
                    savings.setAccountNumber(savingNum);
                    savingsAccount=1;
                    break;

                    case 2:
                    
                    System.out.println("Enter name:");
                    String currentName=sc.nextLine();
                    current.setName(currentName);

                    System.out.println("Enter account number:");
                    int currentNum=scanner.nextInt();
                    current.setAccountNumber(currentNum);
                    currentAccount=1;
                    break;
                    
                  
                       
                }
            }
            while (choice1!=3);
                    break;
            
                case 2:
                do{
                    System.out.println("Select an option:");
                    System.out.println("1.Deposit amount to savings account");
                    System.out.println("2.Deposit amount to current account");
                    System.out.println("3.Back");
                    
                    choice2=scanner.nextInt();
                    switch(choice2){
                        case 1:
                        if(savingsAccount==1){
                        System.out.println("insert deposit amount for savings account:");
                        Double savingAmount=scanner.nextDouble();
                        savings.deposit(savingAmount);}
                        else{
                            System.out.println("There in no savings account");
                        }
                        break;

                        case 2:
                        if(currentAccount==1){
                        System.out.println("insert deposit amount for current account:");
                        Double currentAmount=scanner.nextDouble();
                        current.deposit(currentAmount);}
                        else{
                            System.out.println("There is no current account");
                        }
                        break;
                         
                    }
                }
                while (choice2!=3);
                
                    break;
                
                    case 3:
                do{
                    System.out.println("Select an option:");
                    System.out.println("1.Withdraw from savings account");
                    System.out.println("2.Withdraw from current account");
                    System.out.println("3.Back");
                    
                    choice3=scanner.nextInt();
                    switch(choice3){
                        case 1:
                        if(savingsAccount==1){
                        System.out.println("insert withdraw amount:");
                        Double savingWithdraw=scanner.nextDouble();
                        savings.withdraw(savingWithdraw);}
                        else{
                            System.out.println("There in no savings account");
                        }
                        break;

                        case 2:
                        if(currentAccount==1){
                        System.out.println("insert withdraw amount:");
                        Double currentWithdrawAmount=scanner.nextDouble();
                        current.withdraw(currentWithdrawAmount);}
                        else{
                            System.out.println("There is no current account");
                        }
                        break;
                           
                    }
                }
                while (choice3!=3);
                    break;
                
                   case 4:
                do{
                    System.out.println("1.Transfer from savings account to current account");
                    System.out.println("2.Transfer from current account to savings account");
                    System.out.println("3.back");
                    choice4=scanner.nextInt();
                    
                    switch(choice4){
                        case 1:
                        if(savingsAccount==1 && currentAccount==1){
                        System.out.println("Enter amount you want to transfer to current account");
                        Double am=scanner.nextDouble();
                        current.transfer(savings,am);
                        }
                        else{
                            System.out.println("Either current or savings or both accounts are not created"); 
                        }
                        break;

                        case 2:
                        if(savingsAccount==1 && currentAccount==1){
                            System.out.println("Enter amount you want to transfer to savings account");
                            Double bm=scanner.nextDouble();
                            savings.transfer(current,bm);
                            }
                            else{
                                System.out.println("Either current or savings or both accounts are not created"); 
                            }
                        break;
                         
                    }
                }
                while(choice4!=3);
                  break;

                    case 5:
                    if(savingsAccount==1){
                    System.out.println("Enter interest rate for savings account");
                    Double rate=scanner.nextDouble();
                    savings.addInterest(rate);}
                    else{
                        System.out.println("No savings account created");
                    }
                    
                    break;
                
                    case 6:
                    System.out.println("Exit");
                    break;
                        
            }
        }
        while(choice!=6);

    }
}



