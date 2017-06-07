/**
 * Write a description of class SalesItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SalesItem  
{
    private double salsPrice;
    private int numOfItem;

    /**
     * Constructor for objects of class SalesItem
     */
    public SalesItem()
    {
        salsPrice = 0;
        numOfItem = 0;
    }

    public SalesItem(int sp)
    {
        salsPrice = sp;
        numOfItem = 0;
    }

    /**
     * getNumOfItem returns the value of the number of Items
     * 
     * @return numOfItem is returned as integer 
     * @param There are No parameters
     */
    public int getNumOfItem()
    {
        return numOfItem;
    }

    /**
     * getFinalPrice returns the value of the final 
     * price of your items including taxes
     * 
     * @return getFinalPrice is returned as double
     * @param There are No parameters
     */
    public double getFinalPrice()
    {
        return (salsPrice * 1.13);
    }

    /**
     * setPrice takes in a value and sets salsPrice equal
     * to it
     * 
     * @return Nothing is returned 
     * @param There is a double newPrice that will be set like its name suggests
     * to a new price
     */
    protected void setPrice(double newPrice)
    {
        salsPrice = newPrice;
    }

    /**
     * setNumber takes in a value and sets numOfitem equal
     * to it
     * 
     * @return Nothing is returned 
     * @param There is a integer newNum that will be set to a ew Number
     */
    protected void setNumber(int newNum)
    {
        numOfItem = newNum;
    }

}
