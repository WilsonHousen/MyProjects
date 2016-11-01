
package bankingapp;

import java.util.Comparator;

/**
 *
 * @author wihousen
 */
public class BankAccount {

    private int balance;
    private String name;

    public BankAccount(String name, int balance) {

        this.name = name;
        this.balance = balance;

    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
    
    public static Comparator<BankAccount> createComparatorByName(final boolean increasing) {
       
       return new 
                   
           Comparator<BankAccount>() {
               
               public int compare(BankAccount bankacc1, BankAccount bankacc2) {
                   
                   if(increasing == true) {
                       
                       return bankacc1.getName().compareTo(bankacc2.getName());
                  
                   } else {
                       
                       return (-1 * bankacc1.getName().compareTo(bankacc2.getName()));
                     
                   }
               }
               
           };
       
   }
    
   public static Comparator<BankAccount> createComparatorByBalance(final boolean increasing) {
       
       return new 
                   
           Comparator<BankAccount>() {
              
               public int compare(BankAccount bankacc1, BankAccount bankacc2) {
                   
                   if(increasing == true) {
                       
                       return java.lang.Double.compare(bankacc1.getBalance(), bankacc2.getBalance());
                  
                   } else {
                       
                       return (-1 * java.lang.Double.compare(bankacc1.getBalance(), bankacc2.getBalance()));
                     
                   }
               }
               
           };
       
   } 

}
