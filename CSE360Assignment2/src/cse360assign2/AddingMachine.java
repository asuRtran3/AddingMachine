/**
 * Name: Randy Tran
 * Class ID: 1213034548
 * Assignment # 2
 * Description: An adding machine that adds and subtracts from or to the total
 * value. As well using a git and commit it to a repository to share code with others.
 */

package cse360assign2;

public class AddingMachine {
    
    private int total;
    
    private String operation = "0"; // To keep the history of the adding/subtracting
    
    public AddingMachine () {
        
        total = 0;          		// not needed - included for clarity
        
    }
    
    public int getTotal () {
        
        return total;       		// simply returns the total
        
    }
    
    public void add (int value) {
    	
    	operation += " + " + value; // This is adding to the string to keep 
    								// each value when the method is called once 
    								// or multiple of times.

        total += value;    			// Adding the value to the total
        
    }
    
    public void subtract (int value) {
    	
        operation += " - " + value; 

        total -= value;    			// Subtracting the value from the total
        
        
    }
   
    
    public String toString () {
    	
        return operation;			// Returns the operation string
        
    }
    
    public void clear() {
    	
        
    }
    
    
}
