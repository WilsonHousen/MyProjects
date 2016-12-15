/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockapp;

import javax.swing.event.ChangeListener;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Iterator;

/**
 *
 * @author almay
 */
public class ClockTest {
    
    public ClockTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of tick method, of class Clock.
     */
    @Test
    public void testTick() {
        System.out.println("tick");
        Clock instance = new Clock();
        for (int i = 0; i < 60; i++) {
             instance.tick();
        }
        Clock other = new Clock();
        other.setMinutes(1);
        assertTrue(instance.equals(other));
    }

    /**
     * Test of toString method, of class Clock.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Clock instance = new Clock();
        String expResult = "00:00:00";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Clock.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Clock other = new Clock();
        Clock instance = new Clock();
        other.setHours(0);
        other.setMinutes(0);
        other.setSeconds();
        instance.setHours(0);
        instance.setMinutes(0);
        instance.setSeconds();
        assertTrue(instance.equals(other));
    }

    /**
     * Test of setHours method, of class Clock.
     */
    @Test
    public void testSetHours() {
        System.out.println("setHours");
        int h = 1;
        Clock instance = new Clock();
        instance.setHours(h);
        assertEquals("01:00:00", instance.toString());
    }

    /**
     * Test of setMinutes method, of class Clock.
     */
    @Test
    public void testSetMinutes() {
        System.out.println("setMinutes");
        int m = 1;
        Clock instance = new Clock();
        instance.setMinutes(m);
        assertEquals("00:01:00", instance.toString());
    }

    /**
     * Test of setSeconds method, of class Clock.
     */
    @Test
    public void testSetSeconds() {
        System.out.println("setSeconds");
        Clock instance = new Clock();
        instance.setSeconds();
        assertEquals("00:00:00", instance.toString());
    }

    /**
     * Test of tickUp method, of class Clock.
     */
    @Test
    public void testTickUp() {
        System.out.println("tickUp");
        Clock instance = new Clock();
        instance.tickUp();
        assertEquals("00:01:00", instance.toString());
    }

    /**
     * Test of tickDown method, of class Clock.
     */
    @Test
    public void testTickDown() {
        System.out.println("tickDown");
        Clock instance = new Clock();
        instance.tickDown();
        assertEquals("23:59:00", instance.toString());
    }
    
}
