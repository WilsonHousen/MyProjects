
package bankingapp;
import java.util.*;

/**
 *
 * @author wihousen
 */
public class BankingApp {


    public static void main(String[] args) {
       
        BankAccount bankAcc1 = new BankAccount("Frank Dude", 2345);
        BankAccount bankAcc2 = new BankAccount("Esmeralda Esq.", 234000);
        BankAccount bankAcc3 = new BankAccount("Robert Paulson", 0);
        BankAccount bankAcc4 = new BankAccount("Wilson F. H., PHD, MD, DDH", 1234576);
        
        BankingSystem bankSys = new BankingSystem(); 
        bankSys.addAcc(bankAcc1);
        bankSys.addAcc(bankAcc2);
        bankSys.addAcc(bankAcc3);
        bankSys.addAcc(bankAcc4);
       
        bankSys.printOut();
        System.out.println();
        bankSys.sortByBalance();
        System.out.println();
        bankSys.printOut();
        
    }
    
}
