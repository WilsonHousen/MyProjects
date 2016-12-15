
package finalbankingapp;

import java.util.*;

/**
 *
 * @author wihousen
 */

public class ListOfAccounts {
    
    

    
        public ListOfAccounts() {
            
            this.AccountList =  new ArrayList<Account>();
            
        }
        
        private ArrayList<Account> AccountList;
        
        public void addAcc(Account acc) {
            
            AccountList.add(acc);
        }
        
        public ArrayList getAccountList() {
            
            return AccountList;
            
        }
        
        
        /**
         * @precond: no Account object has the same name field
         * @param aName
         * @return b, where b.name equals aName
         */
        public Account getAccount(String aName) {
            
            Account bName = null;
            
            for(Account b : AccountList) {
                
                if(aName.equals(b.getName())) {
                    
                    bName = b;
                    
                }
                
            }
            
            return bName;
            
        }
        
        /*
        public Account getCurr() {
            
            Account bName = null;
            
            for(Account b : AccountList) {
                
                if(b.curr = true) {
                    
                    bName = b;
                    
                }
                
            }
            
            return bName;
            
        }
        

        public Account setCurr(Account acc) {
   
            
            for(Account b : AccountList) {
                
                if(b.curr = true) {
                    
                    b.curr = false;
                    
                }
                
                if(acc.name.equals(b.getName())) {
                    
                    acc.curr = true;
                    
                }
                
            }
            
            return acc;
            
        }
        */
        
        public void printOut() {
            
            for(Account b : AccountList) {
                
                System.out.println(b.getBalance() + ", " + b.getName());
                
            }
            
        }
        
        public ArrayList getCheckings() {
            
            ArrayList ChArray = new ArrayList();
            
            for(Account b : AccountList) {
                
                if (b instanceof CheckingAccount) {
                    
                  ChArray.add(b);  
                    
                }
           
                }
            
            return ChArray;
            
        }
        
        public ArrayList getSavings() {
            
            ArrayList SavArray = new ArrayList();
            
            for(Account b : AccountList) {
                
                if (b instanceof SavingsAccount) {
                    
                  SavArray.add(b);  
                    
                }
           
                }
            
            return SavArray;
            
        }
        
       public ArrayList arrayToString(ArrayList<Account> list) {

        ArrayList<String> StArray = new ArrayList();
        String nam = null;
        String bal = null;

        for (Account b : list) {
            
            nam = b.name;
            bal = Integer.toString(b.balance);
            
            StArray.add(bal);
            StArray.add(nam);

        }
        
        return StArray;
        
    }

        
        
        public void sortByBalance() {
            
            Collections.sort(AccountList, Account.createComparatorByBalance(true));
            
        }
        
        public void sortByName() {
            
            Collections.sort(AccountList, Account.createComparatorByName(true));
            
        }
        

    }

