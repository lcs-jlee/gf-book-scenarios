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
    String[] whitekeys = {"a", "s", "d", "f", "g", "h", "i", "j", "k", "l", ";", "'", "\\"};
    String[] whitenotes = {"3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f"};
    
    public Piano() 
    {
        super(800, 340, 1);
        
        // Start tracking frames
        
        
    }

    /**
     * act - called repeatedly to create animation
     */
    
    public void act()
    {
        //this bock of code runs once per second untill the end of the whitekeys array
        //NOTE: whitekeys.length automatically returns the correct number
        if ((frames%60==0) && (frames/60 < whitekeys.length))
        {
            
        }
    
    }
}
/**
 * //Every secind, say hello to the nex person in the list
        if ((frames % 60 == 0) && (frames/60 < 10)) 
        //boolean and -> statements in the conditional run only when both are true.
        {
             showText("Hello " + studentNames[frames / 60], 400, 170);
        }
        //Keep track of the frames
        frames ++;
        showText("" + frames,100, 100);
        
 */