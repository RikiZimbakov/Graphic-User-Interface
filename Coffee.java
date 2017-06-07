import javax.swing.*;
/**
 * Write a description of class Doughnut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coffee extends SalesItem 
{
    public Coffee()
    {   
        final double SMALL_COFFEE_PRICE = 1.33;
        final double MEDIUM_COFFEE_PRICE = 1.59;
        final double LARGE_COFFEE_PRICE = 1.86;
        String size;
        size= ( JOptionPane.showInputDialog( null, "Enter the the Size of Coffee:" ) );
        if( size.equalsIgnoreCase("s") == true)
        {
            setNumber(1);
            setPrice(SMALL_COFFEE_PRICE);
        }
        else if( size.equalsIgnoreCase("m") == true)
        {
            setNumber(2);
            setPrice(MEDIUM_COFFEE_PRICE);
        }
        else if( size.equalsIgnoreCase("l") == true)
        {
            setNumber(3);
            setPrice(LARGE_COFFEE_PRICE);
        }
        
    }
}
