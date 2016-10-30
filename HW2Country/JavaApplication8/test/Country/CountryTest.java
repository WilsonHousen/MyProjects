/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Country;

import java.util.Comparator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wihousen
 */
public class CountryTest {
    
    public CountryTest() {
    }
    
    

    /**
     * Test of createComparatorByName method, of class Country.
     */
    @Test
    public void testCreateComparatorByName() {
        System.out.println("createComparatorByName");
        boolean increasing = true;
        Country country1 = new Country("ACountry1", 2);
        Country country2 = new Country("country2", 1);
        
        assertTrue(0 > Country.createComparatorByName(increasing).compare(country1, country2));
        assertTrue(0 < Country.createComparatorByName(false).compare(country1, country2));
        
    }

    /**
     * Test of createComparatorByArea method, of class Country.
     */
    @Test
    public void testCreateComparatorByArea() {
        System.out.println("createComparatorByArea");
        boolean increasing = true;
        Country country1 = new Country("country1", 2);
        Country country2 = new Country("country2", 1);
        
        assertTrue(0 < Country.createComparatorByArea(increasing).compare(country1, country2));
        assertTrue(0 > Country.createComparatorByArea(false).compare(country1, country2));
        
    }
    
}
