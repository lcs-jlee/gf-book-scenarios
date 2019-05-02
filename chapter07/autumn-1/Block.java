import greenfoot.*;

/**
 * A block that bounces back and forth across the screen.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Block extends Actor
{
    private int delta = 2;
    
    /**
     * Move across the screen, bounce off edges. Turn leaves, if we touch any.
     */
    public void act() 
    {
        move();
        checkEdge();
        checkMouseClick();
    }
    
    /**
     * Move sideways, either left or right.
     */
    private void move()
    {
        setLocation(getX()+delta, getY());
    }
    
    /**
     * Check whether we are at the edge of the screen. If we are, turn around.
     */
    private void checkEdge()
    {
        if (isAtEdge()) 
        {
            delta = -delta;  // reverse direction
        }
    }
    
    /**
     * Check whether the mouse button was clicked. If it was, change all leaves.
     */
    private void checkMouseClick()
    {
        //When "null" is passed as an argument to mouseCliked, this method, mouseClicked
        //returns true any time the mouse is clicked
        //If you pass a specific object reference, this method returns true ONLY when that
        // Object is clicked
        if (Greenfoot.mouseClicked(this)) 
        {
            // do this when the mouse is clicked. currently: nothing.
            World myWorld = getWorld();
            
            //show some text on the screen
            myWorld.showText("clicked mouse", 200, 200);
        }
    }
    
}
