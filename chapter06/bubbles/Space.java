import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A bit of empty space for bubbles to float in.
 * 
 * @author Michael Kölling
 * @version 1.0
 */
public class Space extends World
{
    /**
     * Create Space. Make it black.
     */
    public Space()
    {
        super(900, 600, 1);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        setUp();
    }
    public void act()
    {
        //setUp();
    }
    private void setUp()
    {
        int i =0;
        while (i <21)
        {
            addObject(new Bubble(), 450, 300);
            i++;
        }
    }
}
