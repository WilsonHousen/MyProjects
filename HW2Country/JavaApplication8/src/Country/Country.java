/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Country;

import java.util.Collections;
import java.util.*;

/**
 *
 * @author wihousen
 */


/**
   A country with a name and area.
*/
public class Country implements Comparable<Country>
{
   /**
      Constructs a country.
      @param aName the name of the country
      @param anArea the area of the country
   */
   public Country(String aName, double anArea)
   {
      name = aName;
      area = anArea;
   }

   /**
      Gets the name of the country.
      @return the name
   */
   public String getName()
   {
      return name;
   }

   /**
      Gets the area of the country.
      @return the area
   */
   public double getArea()
   {
      return area;
   }


   /**
      Compares two countries by area.
      @param other the other country
      @return a negative number if this country has a smaller
      area than otherCountry, 0 if the areas are the same,
      a positive number otherwise
   */
   public int compareTo(Country other)
   {
      if (area < other.area) return -1;
      if (area > other.area) return 1;
      return 0;
   }
   
   public static Comparator<Country> createComparatorByName(final boolean increasing) {
       
       return new 
                   
           Comparator<Country>() {
               
               public int compare(Country country1, Country country2) {
                   
                   if(increasing == true) {
                       
                       return country1.getName().compareTo(country2.getName());
                  
                   } else {
                       
                       return (-1 * country1.getName().compareTo(country2.getName()));
                     
                   }
               }
               
           };
       
   }
   
   public static Comparator<Country> createComparatorByArea(final boolean increasing) {
       
       return new 
                   
           Comparator<Country>() {
               
               public int compare(Country country1, Country country2) {
                   
                   if(increasing == true) {
                       
                       return java.lang.Double.compare(country1.getArea(), country2.getArea());
                  
                   } else {
                       
                       return (-1 * java.lang.Double.compare(country1.getArea(), country2.getArea()));
                     
                   }
               }
               
           };
       
   }

   private String name;
   private double area;
}
