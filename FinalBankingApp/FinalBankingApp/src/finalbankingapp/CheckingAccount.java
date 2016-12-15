/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalbankingapp;

/**
 *
 * @author wihousen
 */
public class CheckingAccount extends Account {
    
    public CheckingAccount(String name, int balance) {
        
        super(name, balance);
        
    }
    
    public void withdraw(int numr) {
        
        int fee = (int) 0.10;
        
        super.withdraw(numr);
        
        balance = balance - fee;
        
    }
    
    
}
