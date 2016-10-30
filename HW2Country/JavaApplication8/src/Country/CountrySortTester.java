/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Country;

/**
 *
 * @author wihousen
 */
import java.util.*;

public class CountrySortTester
{
   public static void main(String[] args)
   {
      ArrayList<Country> countries = new ArrayList<Country>();
      countries.add(new Country("Uruguay", 176220));
      countries.add(new Country("Thailand", 514000));
      countries.add(new Country("Belgium", 30510));

      Collections.sort(countries, Country.createComparatorByName(true));
      // Now the array list is sorted by area
      for (Country c : countries)
         System.out.println(c.getName() + " " + c.getArea());
      System.out.println();
      
      Collections.sort(countries, Country.createComparatorByName(false));
      // Now the array list is sorted by area
      for (Country c : countries)
         System.out.println(c.getName() + " " + c.getArea());
      System.out.println();
      
      Collections.sort(countries, Country.createComparatorByArea(true));
      // Now the array list is sorted by area
      for (Country c : countries)
         System.out.println(c.getName() + " " + c.getArea());
      System.out.println();
      
      Collections.sort(countries, Country.createComparatorByArea(false));
      // Now the array list is sorted by area
      for (Country c : countries)
         System.out.println(c.getName() + " " + c.getArea());
      System.out.println();
   }
}