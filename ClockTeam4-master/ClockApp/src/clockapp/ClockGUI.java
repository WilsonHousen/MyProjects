/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockapp;


import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author luserazo
 */
public class ClockGUI extends JFrame{
    private final JPanel clockPanel = new JPanel();
    private final JButton up = new JButton("Up");
    private final JButton min = new JButton("Minutes");
    private final JButton hrs = new JButton("Hours");
    private final JButton down = new JButton("Down");
    private final JButton lock = new JButton("Lock");
    protected boolean notLocked = true;
    private final JLabel time = new JLabel("00:00:00");
    
    /** ClockGUI constructor
    * @preconditions: none
    * @postcondition: a JPanel is made. It has five buttons: lock, hours,
    *                 minutes, up and down. It also displays a 6 digit
    *                 string, which is the set time. the time ticks up
    *                 one second per second. each button is given action
    *                 listeners and is added to the panel.
    */
    public ClockGUI() throws InterruptedException{
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock");
        this.setLocation(200, 200);
        
        this.setLayout(new BorderLayout());
        
        JPanel buttonPanel = new JPanel();
        new BoxLayout(buttonPanel, BoxLayout.Y_AXIS);
        
        buttonPanel.add(lock);
        buttonPanel.add(up);
        buttonPanel.add(down);
        buttonPanel.add(min);
        buttonPanel.add(hrs);
        buttonPanel.add(time);
        
        Clock clocky = new Clock();
        
        time.setFont(new Font("Comic Sans Serif",Font.PLAIN,24));
        clockPanel.add(time);
        
        this.add(clockPanel,BorderLayout.SOUTH);
        this.add(buttonPanel,BorderLayout.NORTH); 
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
        
        /**
        * @precond: none
        *@postcondition: either minutes or hours is ticked up 
        *                by one
        */
        upPressed(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               if (notLocked){
               clocky.tickUp();
               setTime(clocky.toString());
               }
           } 
        });
        
        /**
        *@postcondition: either minutes or hours is ticked down
        *                by one
        */
        downPressed(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (notLocked) {
                clocky.tickDown();
                setTime(clocky.toString());
                }
            }
            
        });
        
        /**
        * @precond: none
        *@postcondition: up and down effect minutes, not hours
        */
        minPressed(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (notLocked) {
                clocky.hoursHuh=false;
                }
            }
        });
        
        /**
        * @precond: none 
        *@postcondition: up and down effect hours, not minutes
        */
        hrsPressed(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (notLocked) {
              clocky.hoursHuh=true;
                }
            }
        });
        
        /**
        * @precond: none
        *@precondition: locks or unlocks the functions of the minutes,
        *               hours, up and down buttons. 
        */
        lockPressed(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
              setLockedBool();
            }
        });
        
            while(true){
                if (notLocked) {
            Thread.sleep(1000);
            clocky.tick();
            setTime(clocky.toString());        
        }}
    }
        
    /**
     * @precond: there is a JLabel object "time"
     * @param currentTime 
     * @postcond: time gets currentTime
     */     
    public void giveTime(String currentTime){
        time.setText(currentTime);
    }
    
    /**
     * @precond: there is a JLabel object "time"
     * @param currentTime 
     * @postcond: time gets currentTime
     */
    public void setTime(String currentTime){
        time.setText(currentTime);
    }
    
    /**
     * @precond: there is a notLocked boolean field
     * @postcond: notLocked is set to the opposite of whatever it was
     */
    public void setLockedBool(){
        notLocked = !notLocked;
    }
    
    public void upPressed(ActionListener upAction){
        
        if(notLocked)
        up.addActionListener(upAction);
    }
    
    public void downPressed(ActionListener downAction){
        if(notLocked)
        down.addActionListener(downAction);
    }
    
    public void lockPressed(ActionListener lockAction){
        lock.addActionListener(lockAction);
    }
    
    public void minPressed(ActionListener minAction){
        if(notLocked)
        min.addActionListener(minAction);
    }
    
    public void hrsPressed(ActionListener hrsAction){
        if(notLocked)
        hrs.addActionListener(hrsAction);
    }
}
