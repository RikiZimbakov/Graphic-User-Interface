import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    private long startTime;
    private GreenfootSound soundFile = new GreenfootSound("It's Peanut Butter Jelly Time!!!.mp3");
    private static GreenfootImage[] images = new GreenfootImage[8];
    private int slowness = 5;
    private int gifSpeedCounter = 0;
    private int actCycle = 0;

    public MyWorld()
    {    
        super(370, 365, 1); 
        for( int i = 0; i < images.length; i++ )
        {                
            images[i] = new GreenfootImage( "frame_" + i + "_delay-0.1s.gif" );
        }
        setBackground(images[0]);
    }

    /**
     * started sets startTime equal to systemcurrentMillis and makes sure 
     * peanutbutter jelly is infinite
     * @param There are no parameters
     * @return nothing is returned
     */
    public void started()
    {
        startTime = System.currentTimeMillis();
        soundFile.playLoop();
    }

    /**
     * stopped ends the song when you pause the program
     * @param There are no parameters
     * @return nothing is returned
     */
    public void stopped()
    {
        soundFile.stop();
    }

    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setBackground( images [actCycle % images.length]);
        if( gifSpeedCounter == slowness)
        {
            actCycle++;
            gifSpeedCounter = 0;
        }
        else
        {
            gifSpeedCounter ++;
        }
    }

    /**
     * setSlowness sets a how slow our song will play
     * @param int h helps represent how slow our gif will play
     * @return Nothing is returned
     */
    public void setSlowness(int h)
    {
        slowness = h;
    }

}
