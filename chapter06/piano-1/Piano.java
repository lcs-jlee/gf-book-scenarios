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
        //Every secind, say hello to the nex person in the list
        if (frames % 60==0)
        {
            if ( frames/60 <10)
            {
                showText("Hello " + studentNames[frames / 60], 400, 170);
            }
        }
        //Keep track of the frames
        frames ++;
        showText("" + frames,100, 100);
        
    }
}