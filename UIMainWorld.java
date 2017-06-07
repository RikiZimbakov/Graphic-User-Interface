import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.List;
/**
 * Name: (Risto Zimbakov)
 * Teacher: Mr. Hardman
 * Assignment CoffeeShop
 * Date Last Modified: 6/6/2017
 */
public class UIMainWorld extends World
{
    private boolean onSales;
    private SalesItem[] salsItems;
    private int numItemsAdded; 
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public UIMainWorld()
    {    
        super(600, 400, 1);
        startScreen();
    }

    /**
     * startScreen makes sure your on sales screen is not showing and adjusts your other
     * variables accordingly by setting the amount of items added to 0 and also adding your menu
     * to the world
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void startScreen()
    {
        onSales = false;
        salsItems = new SalesItem[50];
        numItemsAdded = 0;
        Menu guiMenu = new Menu("File","New Sale…\nClose\nExit",50,Color.RED,Color.WHITE,Color.YELLOW,Color.BLACK,new FileCommands());
        clearScreen();
        addObject(guiMenu, 100, 20);
    }

    /**
     * salesScreen makes sure your on sales screen showing and adding your buttons to the world at
     * appropriate locations
     *      
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void salesScreen()
    {
        onSales = true;
        Button timbitAdded = new Button(15,"button-green.png", "button-blue.png", "Timbits" );
        Button doughnutAdd = new Button(15,"button-green.png", "button-blue.png", "Donuts" );
        Button coffeeAdd = new Button(15,"button-green.png", "button-blue.png", "Coffee" );

        addObject(timbitAdded, 100, 300);
        addObject(doughnutAdd, 300, 300);
        addObject(coffeeAdd, 500, 300);
    }

    /**
     * thankYou makes sure your salesScreen is not showing and also clears
     * the screen while displaying the text thanking the user for using your 
     * product, it also stops your program as well.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void thankYou()
    {
        onSales = false;
        clearScreen();
        showText("Thanks for Clicking", 300, 200);
        Greenfoot.stop();
    }

    public void act()
    {
        if( onSales == true )
        {
            calculateSale();
        }
    }
    
    /**
     * calculateSale performs all the math opporations in the correct order to make
     * sense so that the user has the same experience they would if they were at a
     * regular coffee shop. It also shows the user all the items they have ordered 
     * and their final price.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void calculateSale()
    {
        double totalCost = 0.0;
        int numTimbits = 0;
        int numDonuts = 0;
        int numS = 0;
        int numM = 0;
        int numL = 0;
        String showList;

        for( int i = 0; salsItems[i] != null && i < salsItems.length; i++)
        {

            if(salsItems[i] instanceof Timbit )
            {
                numTimbits += (salsItems[i].getNumOfItem() ); 
            }
            else if( salsItems[i] instanceof Doughnut )
            {
                numDonuts += (salsItems[i].getNumOfItem() );
            }
            else if( salsItems[i] instanceof Coffee )
            {

                if( salsItems[i].getNumOfItem() == 1 )
                {
                    numS ++;
                }
                else if( salsItems[i].getNumOfItem() == 2 )
                {
                    numM ++;
                }
                else if( salsItems[i].getNumOfItem() == 3 )
                {
                    numL ++;
                }
            }
            totalCost += salsItems[i].getFinalPrice();
        }
        showList = ("Timbits:" + numTimbits + 
            "\nDoughnuts: " + numDonuts + 
            "\nSmallCoffees" + numS + 
            "\nMediumCoffees" + numM+ "\nLargeCoffees" + numL); 
        showText(showList + String.format("\nTotal Price: $%5.2f", totalCost),300, 200);
    }
    
    /**
     * addItem adds tthe salsItem parameter to the salesItems array at the 
     * numItemsAdded index while also increasing the number of items added by 1
     * 
     * @param There is a SalesItem salsItem that is added to the correct index.
     * @return Nothing is returned
     */
    public void addItem(SalesItem salsItem)
    {
        salsItems[numItemsAdded] = salsItem;
        numItemsAdded ++;
    }
    /** 
     * clearScreen empties the sceen allowing the user to restart their experience 
     * again in case they change their mind.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void clearScreen()
    {
        showText("", 100, 100);
        List objects = getObjects(null);
        if( objects != null)
        {
            removeObjects(objects);
        }
    }
}
