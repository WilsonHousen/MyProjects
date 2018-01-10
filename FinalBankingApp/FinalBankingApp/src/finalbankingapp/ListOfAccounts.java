
package finalbankingapp;

import java.util.*;

/**
 *
 * @author wihousen
 */

public class ListOfAccounts {

    public ListOfAccounts() {

        this.AccountList = new ArrayList<>();

    }

    private final ArrayList<Account> AccountList;

    public void addAcc(Account acc) {

        AccountList.add(acc);
    }

    public ArrayList getAccountList() {

        return AccountList;

    }

    /**
     * @precond: no Account object has the same name field
     * @param aName
     * @return b, an acc, where b.name equals aName
     */
    public Account getAccount(String aName) {

        Account bName = null;

        for (Account b : AccountList) {

            if (aName.equals(b.getName())) {

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
    
    /*prints out each account in a list of accounts*/
    public void printOut() {

        for (Account b : AccountList) {

            System.out.println(b.getBalance() + ", " + b.getName());

        }

    }

    /*puts all of the accs with checking accs into an array, then returns it*/
    public ArrayList getCheckings() {

        ArrayList ChArray = new ArrayList();

        for (Account b : AccountList) {

            if (b instanceof CheckingAccount) {

                ChArray.add(b);

            }

        }

        return ChArray;

    }

    /*puts all of the accs with savings accs into an array, then returns it*/
    public ArrayList getSavings() {

        ArrayList SavArray = new ArrayList();

        for (Account b : AccountList) {

            if (b instanceof SavingsAccount) {

                SavArray.add(b);

            }

        }

        return SavArray;

    }

    /*puts all of the names of each acc into an array and returns the array*/
    public ArrayList arrayToStringNam(ArrayList<Account> list) {

        ArrayList<String> StArray = new ArrayList();
        String nam = null;

        for (Account b : list) {

            nam = b.name;

            StArray.add(nam);

        }

        return StArray;

    }

    /*converts all of the balances of each acc into a string and puts them in
     an array, returning the array*/
    public ArrayList arrayToStringBal(ArrayList<Account> list) {

        ArrayList<String> StArray = new ArrayList();
        String bal = null;

        for (Account b : list) {

            bal = Integer.toString(b.balance);

            StArray.add(bal);

        }

        return StArray;

    }

    /*sorts list by balance*/
    public void sortByBalance() {

        Collections.sort(AccountList, Account.createComparatorByBalance(true));

    }

    /*sorts list by name*/
    public void sortByName() {

        Collections.sort(AccountList, Account.createComparatorByName(true));

    }

}
