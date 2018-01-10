package finalbankingapp;

/**
 *
 * @author wihousen
 */
public class CheckingAccount extends Account {
    
    public CheckingAccount(String name, int balance) {
        
        super(name, balance);
        
    }
    
    /*withdrawing on a checkings acc comes with a 10 cent fee*/
    @Override
    public void withdraw(int numr) {
        
        int fee = (int) 0.10;
        
        super.withdraw(numr);
        
        balance = balance - fee;
        
    }
    
    
}
