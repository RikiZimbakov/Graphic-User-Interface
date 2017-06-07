import javax.swing.*;
/**
 * Write a description of class Doughnut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Doughnut extends SalesItem 
{
    public Doughnut()
    {   
        final double DONUT_PRICE = 0.99;
        final int BOX_CAPACITY = 6;
        final double BOX_PRICE = 5.00;
        int numDonuts;
        int numBoxes;
        numDonuts = Integer.parseInt( JOptionPane.showInputDialog( null, "Enter the number of Donuts:" ) );
        setNumber(numDonuts);
        if( numDonuts % 12 == 0)
        {
            numBoxes = numDonuts / BOX_CAPACITY;
            numDonuts = 0;
        }
        else
        {
            numBoxes = numDonuts / BOX_CAPACITY;
            numDonuts = numDonuts / BOX_CAPACITY;
        }
        setPrice(numDonuts * (DONUT_PRICE + numBoxes) * BOX_PRICE);
    }
}
