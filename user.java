public class user {
    public static void main(String[] args) {
        BankAcount b=new BankAcount("Ruthika", 123456789, 1000);
        b.displayDetails();
        b.withdraw( 1000);
        b.getbalance();
        b.deposit( 100000);
        b.getbalance();
    }
    



    
}
