public class  BankAcount
{
    String accname;
    long accno;
    double balance;
    public BankAcount( String accname, long accno, double bal)
    {
        this.accname = accname;
        this.accno = accno;
        this.balance = balance;

    }
    void withdraw(double amount){
        if(balance>=amount){
            balance=balance-amount;
            System.out.println("Insufficient balance");
        }
    }
    void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("Amount has been deposited successfully");
        }
        else{
            System.out.println("Deposit amount is less than 100");
        }
    }
    void getbalance(){
        System.out.println("Balance in my account is " +balance);
    }
    void displayDetails(){
        System.out.println("Account holder name is " +accname);
        System.out.println("Account number is " +accno);
        System.out.println("Balance is " +balance);
    }

        }
    
    

    



