
package clockapp;
import java.util.ArrayList;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
        

/**
 *
 * @author Clock Team 4
 */
public class Clock {
    
    /**
     * Constructs a Clock object with initial integral fields set to zero
     * and this.listeners set to an empty array
     */
    public Clock() {
        hours = 0;
        minutes = 0;
        seconds = 0;
        hoursHuh = false; // increment minutes first
    }
    
   
    /**
     * Mutator method for hours
     * @param h int for setting hours of a given Clock object
     * @precondition 0<=h<24
     * @postcondition hours get h
     */
    protected void setHours(int h) {
        hours = h;
    }
    
    /**
     * Mutator method for minutes
     * @param m int for setting minutes of a given Clock object
     * @precondition 0<=m<60
     * @postcondition: minutes get m
     */
    protected void setMinutes(int m) {
        minutes = m;
    }
    
    /**
     * @precondition: there is a clock object with a seconds field
     * Mutator method for seconds
     * @postcondition: seconds are set to zero (ie resets seconds)
     */
    protected void setSeconds() {
        seconds = 0;
    }
    
    
 
    
    /**
     * @Precondition: there is a clock object with the correct fields
     * "Ticks" the clock, ie increments time by 1
     * @postcondition: some of the fields of the clock, such as hours,
     * seconds or minutes have changed
     */
    public void tick() {
        this.seconds++;
        if (this.seconds==60) {
            this.seconds = 0;
            this.minutes++;
            if (this.minutes==60) {
                this.minutes = 0;
                this.hours++;
                if (this.hours==24) 
                    this.hours = 0;
            }
        }
    }
    
    /**
     * @Precondition: there is a clock object with the correct fields
     * @postcondition: a field of clock, such as hours or minutes,
     *                 is incremented by +1
     */
    public void tickUp(){
        if (!hoursHuh) {
        this.minutes++;
        if(this.minutes==60){
            this.minutes = 0;
            this.hours++;
            if(this.hours==24){
                this.hours = 0;
            }
        }
        }
        else {
            this.hours++;
            if(this.hours==24){
                this.hours = 0;
            }
        }
    }
    
    
    /**
     * @Precondition: there is a clock object with the correct fields
     * @postcondition: a field of clock, such as minutes or hours,
     *                 is incremented by -1
     */
    public void tickDown(){
        if (!hoursHuh) {
        this.minutes--;
        if(this.minutes==-1){
            this.minutes = 59;
            this.hours--;
            if(this.hours==-1){
                this.hours = 23;
            }
        }
        }
        else {
            this.hours--;
            if(this.hours==-1){
                this.hours = 23;
            }
        }
    }
    
    
    
    

    
    /**
    Method for displaying a Clock object as a String
    */
    public String toString() {
        Integer h = (Integer) hours; //cast each hours, minutes, seconds
        Integer m = (Integer) minutes; //to Integer wrapper in order to use
        Integer s = (Integer) seconds; //toString() method
        String hourString = h < 10 ? 
                "0" + h.toString() : h.toString();
        String minuteString = minutes < 10 ? 
                "0" + m.toString() : m.toString();
        String secondString = seconds < 10 ? 
                "0" + s.toString() : s.toString();
        return hourString + ":" + minuteString + ":" + secondString;
    }
    
    /**
    * Tests to see if another Clock object is equal to this Clock object
    * @param other the other Clock to be tested
    *
    */
    public boolean equals(Clock other) {
        return hours == other.hours 
                && minutes == other.minutes
                && seconds == other.seconds;
    }
    
    
    private Integer hours;
    private Integer minutes;
    private Integer seconds;
    protected boolean hoursHuh; // hoursHuh = true be hours, else minutes
}
