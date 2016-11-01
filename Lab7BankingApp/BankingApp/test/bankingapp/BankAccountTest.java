/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapp;

import java.util.Comparator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wihousen
 */
public class BankAccountTest {

    


    /**
     * Test of getName method, of class BankAccount.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        BankAccount acc34 = new BankAccount("Bob", 3);
        assertEquals("Bob", acc34.getName());
    }

    /**
     * Test of getBalance method, of class BankAccount.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        BankAccount acc1 = new BankAccount("Bob", 3);
        assertEquals(3, acc1.getBalance(), 0.0);
    }

    /**
     * Test of createComparatorByName method, of class BankAccount.
     */
    @Test
    public void testCreateComparatorByName() {
        System.out.println("createComparatorByName");
        boolean increasing = true;
        BankAccount bankAcc1 = new BankAccount("bankAcc1", 2);
        BankAccount bankAcc2 = new BankAccount("bankAcc2", 1);
        
        assertTrue(0 > BankAccount.createComparatorByName(increasing).compare(bankAcc1, bankAcc2));
        assertTrue(0 < BankAccount.createComparatorByName(false).compare(bankAcc1, bankAcc2));
        
    }

    /**
     * Test of createComparatorByBalance method, of class BankAccount.
     */
    @Test
    public void testCreateComparatorByBalance() {
        System.out.println("createComparatorByBalance");
        boolean increasing = true;
        BankAccount bankAcc1 = new BankAccount("bankAcc1", 2);
        BankAccount bankAcc2 = new BankAccount("bankAcc2", 1);
        
        assertTrue(0 < BankAccount.createComparatorByBalance(increasing).compare(bankAcc1, bankAcc2));
        assertTrue(0 > BankAccount.createComparatorByBalance(false).compare(bankAcc1, bankAcc2));
        
        
    }
    
}
