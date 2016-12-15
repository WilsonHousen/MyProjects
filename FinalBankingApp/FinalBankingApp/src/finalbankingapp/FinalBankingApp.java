
package finalbankingapp;
import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author wihousen
 */
public class FinalBankingApp {

    public static void main(String[] args) throws InterruptedException {
        
        BankAppGUI gui = new BankAppGUI();
       
        Account bankAcc1 = new CheckingAccount("Frank Dude", 2345);
        Account bankAcc2 = new SavingsAccount("Esmeralda Esq.", 234000);
        Account bankAcc3 = new CheckingAccount("Robert Paulson", 0);
        Account bankAcc4 = new SavingsAccount("Wilson F. H., PHD, MD, DDH", 1234576);
        
        ListOfAccounts bankSystem = new ListOfAccounts(); 
        bankSystem.addAcc(bankAcc1);
        bankSystem.addAcc(bankAcc2);
        bankSystem.addAcc(bankAcc3);
        bankSystem.addAcc(bankAcc4);
       
        
        bankSystem.sortByName();
        /**System.out.println();
         */
        bankSystem.sortByBalance();
        /**System.out.println();
         *bankSystem.printOut();
         */
        
    }
    
}
    
