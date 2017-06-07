import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FileCommands here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FileCommands implements MenuCommands 
{
    /**
     * excute allows allows the user to click on any of the four buttons created
     * from Menu and through this a message will displayed depending on 
     * which button is pressed.
     * 
     * @param There is a integer named idx that allows interface to run smoothly
     * with the World w. World w acts as reference.
     * 
     * @return Nothing is returned
     */
    public void execute(int idx, World w)
    {
        UIMainWorld guiWorld = (UIMainWorld)w;
        if( idx == 0)
        {
            guiWorld.salesScreen();
        }
        else if( idx == 1)
        {
            guiWorld.startScreen();
        }
        else if( idx == 2)
        {
            guiWorld.thankYou();
        }
    }

    /**
     * Act - do whatever the FileCommands wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
