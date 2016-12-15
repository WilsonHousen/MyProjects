
package finalbankingapp;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author wihousen
 */
public class BankAppGUI extends JFrame {
    
    private final JPanel bankPanel = new JPanel();
    private final JButton withdraw = new JButton("Withdraw");
    private final JButton deposit = new JButton("Deposit");
    private final JButton makeAccount = new JButton("Make Account");
    private final JButton viewAccount = new JButton("View Account");
    private final JButton viewChecking = new JButton("View Checking");
    private final JButton viewSavings = new JButton("View Savings");
    private final JButton viewAll = new JButton("View All Accounts");
    private final JTextArea textSpace = new JTextArea(20, 40);
    private Account current = null;
    
    public BankAppGUI() throws InterruptedException{
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Bank Application");
        this.setLocation(200, 200);
        
        this.setLayout(new BorderLayout());
        
        JPanel buttonPanel = new JPanel();
        new BoxLayout(buttonPanel, BoxLayout.Y_AXIS);
        
        Account bankAcc1 = new CheckingAccount("Frank Dude", 2345);
        Account bankAcc2 = new SavingsAccount("Esmeralda Esq.", 234000);
        Account bankAcc3 = new CheckingAccount("Robert Paulson", 0);
        Account bankAcc4 = new SavingsAccount("Wilson F. H., PHD, MD, DDH", 1234576);
        
        ListOfAccounts bankSystem = new ListOfAccounts(); 
        bankSystem.addAcc(bankAcc1);
        bankSystem.addAcc(bankAcc2);
        bankSystem.addAcc(bankAcc3);
        bankSystem.addAcc(bankAcc4);
        
        buttonPanel.add(withdraw);
        buttonPanel.add(deposit);
        buttonPanel.add(makeAccount);
        buttonPanel.add(viewChecking);
        buttonPanel.add(viewSavings);
        buttonPanel.add(viewAccount);
        buttonPanel.add(viewAll);
        
        this.add(bankPanel,BorderLayout.NORTH);
        this.add(buttonPanel,BorderLayout.SOUTH);
        this.add(textSpace, BorderLayout.CENTER);
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
        
        withPressed(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               
               int withnum = Integer.valueOf(JOptionPane.showInputDialog("How Much?"));
               
               current.withdraw(withnum);
               
               String accn = current.name;
               
               String baln = Integer.toString(current.balance);
               
               textSpace.setText("");
               
               textSpace.append(accn + "\n" + baln + "\n" );
               
               
               
               }
           
           });
        
        depPressed(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               
               int depnum = Integer.valueOf(JOptionPane.showInputDialog("How Much?"));
               
               int newbal = current.balance + depnum;
               
               current.setBalance(newbal);
               
               String accn = current.name;
               
               String baln = Integer.toString(current.balance);
               
               textSpace.setText("");
               
               textSpace.append(accn + "\n" + baln + "\n" );
               
               
               
               
               }
           
           });
        
        makeAccPressed(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               
               int starNum = Integer.valueOf(JOptionPane.showInputDialog("Starting Balance?"));
               
               String nam = JOptionPane.showInputDialog("Account Name?");
               
               String type = JOptionPane.showInputDialog("Type Of Account?");
               
               Account newAcc = null;
               
               if(type.equals("Checking")) {
                   
                   newAcc = new CheckingAccount(nam, starNum);
               
               } else {
                   
                   newAcc = new SavingsAccount(nam, starNum);
                   
               }
               
               bankSystem.addAcc(newAcc);
               
               current = newAcc;
               
               }
           
           });
        
        
        viewChPressed(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               
               ArrayList<String> aList = bankSystem.arrayToString(bankSystem.getCheckings());
               
               textSpace.setText("");
               
               for(String b : aList) {
                   
                   textSpace.append(b + " \n");
                   
               }
               
               }
           
           });
        
        viewSavPressed(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               
               ArrayList<String> aList = bankSystem.arrayToString(bankSystem.getSavings());
               
               textSpace.setText("");
               
               for(String b : aList) {
                   
                   textSpace.append(b + " \n");
                   
               }
               
               }
           
           });
        
        viewAccPressed(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               
               String nam = JOptionPane.showInputDialog("Account Name?");
               
               String accn = bankSystem.getAccount(nam).name;
               
               String baln = Integer.toString(bankSystem.getAccount(nam).balance);
               
               textSpace.setText("");
               
               textSpace.append(accn + "\n" + baln + "\n" );
               
               current = bankSystem.getAccount(nam);
               
               }
           
           });
        
        viewAllPressed(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               
               ArrayList<String> aList = bankSystem.arrayToString(bankSystem.getAccountList());
               
               textSpace.setText("");
               
               for(String b : aList) {
                   
                   textSpace.append(b + " \n");
                   
               }
               
               }
           
           });
        
    }
        
    public void withPressed(ActionListener withAction){
        
        withdraw.addActionListener(withAction);
    }
    
    public void depPressed(ActionListener depAction){
        
        deposit.addActionListener(depAction);
    }
    
    public void makeAccPressed(ActionListener makeAccAction){
        
        makeAccount.addActionListener(makeAccAction);
    }
    
    
    public void viewChPressed(ActionListener viewChAction){
        
        viewChecking.addActionListener(viewChAction);
    }
    
    public void viewSavPressed(ActionListener viewSavAction){
        
        viewSavings.addActionListener(viewSavAction);
    }
    
    public void viewAllPressed(ActionListener viewAllAction){
        
        viewAll.addActionListener(viewAllAction);
    }
    
    
    public void viewAccPressed(ActionListener viewAccAction){
        
        viewAccount.addActionListener(viewAccAction);
    }
}
