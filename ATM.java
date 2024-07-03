// Custom Exception 
public class BalanceException extends Exception{
    String message;
    public BalanceException(String message){
        super(message);
        this.message=message;
    }
}


// For withdrawals it should be below account balance and it will not allow to withdraw amount is less than or equal to 1000

public class ATM {
    Integer accountBalance;
    void withdraw(int amt) throws BalanceException{


        if(accountBalance<=1000){
            throw new BalanceException("Insufficient Balance");
}
        else if (accountBalance<amt) {
            throw new BalanceException("Insufficient Balance");
        }
        
            else {
                accountBalance-=amt;
                System.out.println(amt + " withdrawn");
            
            }
        }

        
        public static void main(String args[]){
        ATM acc=new ATM();
        acc.accountBalance=100000;
        try{
            acc.withdraw(30000);
        }catch (BalanceException e){
            System.out.println(e);
        }
        finally {
            System.out.println("your Account Balance is " +acc.accountBalance);
        }

        }

    }
