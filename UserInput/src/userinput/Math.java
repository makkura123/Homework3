/**
 * Class for average, min and max calculation needed for the GUI
 * @author Neele
 */
package userinput;

import java.util.ArrayList;

public class Math {
    int smallest = Integer.MAX_VALUE;
    int largest = Integer.MIN_VALUE;
    
   ArrayList<Integer> collection = new ArrayList<Integer>();
   
    public Math(){};
    
    /**
     * Adds integer to ArrayList collection
     * @param number used for ArrayList
     */
    public void AddToColl(int number){
        collection.add(number);
    }
    
    /**
     * Calculates the average
     * @return average
     */
    
    public double average(){
         double sum = 0;
         for (int i = 0; i < collection.size(); i++){
           sum =+ sum + collection.get(i);
             }
         return sum/collection.size();
     }
    
    /**
     * Looks for the largest number in ArrayList
     * @return largest
     */
    public int largest(){
    for (int i = 0; i < collection.size(); i++){
          if (largest < collection.get(i))
              largest = collection.get(i);
        }
    return largest;
    }
    
    /**
     * Looks for the smallest number in ArrayList
     * @return smallest
     */
    public int smallest(){
        for (int i = 0; i < collection.size(); i++){
          if (smallest > collection.get(i))
              smallest = collection.get(i);
        }
        return smallest;
    }
    
    /**
     * @return size of ArrayList
     */
    public int size(){
        return collection.size();
    }
}
