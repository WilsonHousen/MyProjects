
package finalbankingapp;

import java.util.Comparator;

/**
 *
 * @author wihousen
 */
public class Account {

    protected int balance;
    protected String name;
    protected boolean curr;

    public Account(String name, int balance) {

        this.name = name;
        this.balance = balance;
        this.curr = curr;

    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    
    public void setBalance(int num) {
        
        balance = num;
        
    }
    
    public void withdraw(int numb) {
        
        this.setBalance(balance - numb); 
        
    }
    
    public static Comparator<Account> createComparatorByName(final boolean increasing) {
       
       return new 
                   
           Comparator<Account>() {
               
               public int compare(Account bankacc1, Account bankacc2) {
                   
                   if(increasing == true) {
                       
                       return bankacc1.getName().compareTo(bankacc2.getName());
                  
                   } else {
                       
                       return (-1 * bankacc1.getName().compareTo(bankacc2.getName()));
                     
                   }
               }
               
           };
       
   }
    
   public static Comparator<Account> createComparatorByBalance(final boolean increasing) {
       
       return new 
                   
           Comparator<Account>() {
              
               public int compare(Account bankacc1, Account bankacc2) {
                   
                   if(increasing == true) {
                       
                       return java.lang.Double.compare(bankacc1.getBalance(), bankacc2.getBalance());
                  
                   } else {
                       
                       return (-1 * java.lang.Double.compare(bankacc1.getBalance(), bankacc2.getBalance()));
                     
                   }
               }
               
           };
       
   } 

}
