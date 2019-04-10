import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    /**
     * Instance Variables (can be used anywhere below)
     */
    int frames;
    
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        
        // STtart tracking frames
        frames =0;
    }
    /**
     * act - called repeatedly to create animation
     */
    public void act()
    {
        //Keep track of the frames
        frames ++;
        
        showText("" + frames,100, 100);
    }
}