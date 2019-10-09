/**
 * Name: Randy Tran
 * Class ID: 1213034548
 * Assignment # 2
 * Description: An adding machine that adds and subtracts from or to the total
 * value. As well, to practice using git and commit it to a repository to share code with others.
 */

package cse360assign2;

public class AddingMachine {

    private int total;
    
    private String operation = "0";

    public AddingMachine () {
        
        total = 0;          		// not needed - included for clarity
        
    }
    
    /**
     * Returns the total after addition and or subtraction
     * @return this AddingMachine's total
     */
    public int getTotal () {
        
        return total;
        
    }
    
    /**
     * This method is to add the value to the total. As well, adding
     * the addition operator '+' and the value to the operation string to keep
     * the history of the vale when the method is called once or multiple of times.
     * @param value the value of the add method. 
     */
    public void add (int value) {
    	
    	operation += " + " + value;

        total += value;
        
    }
    
    /**
     * This method is to subtract the value from the total. Also, including
     * the subtraction operator '-' and the value to store into the operation string.
     * @param value the value of the subtract method.
     */
    public void subtract (int value) {
    	
        operation += " - " + value;

        total -= value;
        
    }

    /**
     * This is to print out the history of transactions that has been made by
     * using the operation string. 
     * Starts with the initial value of 0 to the last input. 
     * Returns the private string operation variable.
     */
    public String toString () {

        return operation;
 
    }
    
    /**
     * Clear method to clear the operation string(the history) and the total
     */
    public void clear() {
    	operation = "History of transactions is cleared";
    	total = 0;
    }
  
}
