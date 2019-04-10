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
    //primitive data type
    int frames;
    //onject data type [] indicates array
    String[] studentNames = {"Sarah", "Chelsea", "Jack", "Maxwell", "Gavin", 
            "Minah", "Jeewoo", "Brandon", "Peter", "Justy"
        };
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        
        // Start tracking frames
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