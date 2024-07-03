public class Transactions {
    int accountId;
    int balance;

    public Transactions(int accountId,int balance) {
        super();
        this.accountId = accountId;
        this.balance = balance;
    }
        synchronized void withdraw(int amt){
            if(amt>balance){
                try{
                    wait();
                }catch (InterruptedException e){

                }
            }
                System.out.println("Amount withdrawn successfully" +amt);

        }
        synchronized void deposit(int amt){
            balance+=amt;
            System.out.println("Amount deposited"+balance);
            notify();
        }


}

//atm application
public class AtmApplication{

        public static void main(String []arg){
            Transactions transactions=new Transactions(12121212,20000);
            Thread tw=new Thread(){
                public void run(){
                    transactions.withdraw(40000);
                }
            };
            tw.start();
            Thread td=new Thread(){
                public void run(){
                    transactions.deposit(40000);
                }
            };td.start();
        }

    }


