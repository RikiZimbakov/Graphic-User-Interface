import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Name: (Risto Zimbakov)
 * Teacher: Mr. Hardman
 * Assignment GUI
 * Date Last Modified: 5/19/2017
 */
public class UIMainWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public UIMainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        testActors();
        prepare();
    }

    /**
     * testActors adds a button, label, textbox, and Menu to world location of the 
     * users choosing.
     * 
     * @param There are no Parameters
     * @return Nothing is returned
     */
    private void testActors()
    {
        addObject( new Button(15,"button-green.png", "button-blue.png", "Click Me ;)" ),300, 160);
        addObject( new Menu("File","New\nOpen\nSave\nClose\nExit",24, Color.BLACK, Color.RED, Color.BLUE, Color.YELLOW, new FileCommands()),550, 20);
        addObject( new TextBox("^^Hot Singles In Your Area^^",45, false, Color.WHITE, Color.RED),300, 250);
        addObject( new Label("Looking For a good Time?",40),300,100);        
    } 

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
