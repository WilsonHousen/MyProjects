
package bankingapp;

import java.util.*;

/**
 *
 * @author wihousen
 */

public class BankingSystem {
    
    

    
        public BankingSystem() {
            
            this.Accounts =  new ArrayList<BankAccount>();
            
        }
        
        private ArrayList<BankAccount> Accounts;
        
        public void addAcc(BankAccount acc) {
            
            Accounts.add(acc);
        }
        
        public ArrayList getAccounts() {
            
            return Accounts;
            
        }
        
        public void printOut() {
            
            for(BankAccount b : Accounts) {
                
                System.out.println(b.getBalance() + ", " + b.getName());
                
            }
            
        }
        
        public void sortByBalance() {
            
            Collections.sort(Accounts, BankAccount.createComparatorByBalance(true));
            
        }
        
        public void sortByName() {
            
            Collections.sort(Accounts, BankAccount.createComparatorByName(true));
            
        }
        

    }

