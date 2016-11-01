/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapp;


import java.util.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wihousen
 */
public class BankingSystemTest {

    


    /**
     * Test of addAcc method, of class BankingSystem.
     */
    @Test
    public void testAddAcc() {
        System.out.println("addAcc");
        BankAccount acc = new BankAccount("a", 1);
        BankingSystem instance = new BankingSystem();
        instance.addAcc(acc);
        assertEquals(acc, instance.getAccounts().get(0));
        
    }



    @Test
    public void testSortByBalance() {
        System.out.println("sortByBalance");
        BankingSystem instance = new BankingSystem();
        BankAccount acc1 = new BankAccount("a", 1);
        BankAccount acc2 = new BankAccount("b", 2);
        instance.addAcc(acc1);
        instance.addAcc(acc2);
        instance.sortByBalance();
        assertEquals(acc1, instance.getAccounts().get(0));
        assertEquals(acc2, instance.getAccounts().get(1));
       
    }

    /**
     * Test of sortByName method, of class BankingSystem.
     */
    @Test
    public void testSortByName() {
        System.out.println("sortByName");
        BankingSystem instance = new BankingSystem();
        BankAccount acc1 = new BankAccount("a", 1);
        BankAccount acc2 = new BankAccount("b", 2);
        instance.addAcc(acc1);
        instance.addAcc(acc2);
        instance.sortByName();
        assertEquals(acc1, instance.getAccounts().get(0));
        assertEquals(acc2, instance.getAccounts().get(1));
       
    }
    
}
