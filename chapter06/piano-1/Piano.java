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
    String[] whiteKeys = {"a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'", "\\"};
    String[] whiteNotes = {"3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f","4g"};
    String[] blackKeys = {"w","e","","t","y","u","","o","p","","]",""};
    String[] blackNotes = {"3c#","3d#","","3f#","3g#","3a#","","4c#","4d#","","4f#",""};
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
        int position = frames/60;
        if ((frames%60==0) && (position < whiteKeys.length))
        {
            //assemble the piano by creating each key one by one
            Key anotherKey = new Key(whiteKeys[position], whiteNotes[position],true);
            //this line actually adds the object to the world
            //       object      horizontal    vertical
            addObject(anotherKey, 54 + 63 * position, 140);
            //show message when we are in the bounds of the array
            showText("white Array index is: " + frames/60, 400, 250);
        }
        int position2 = (frames-660)/60 ;
        if ((frames%60==0) && (frames > 659) && ((frames-660)/60 < blackKeys.length) && (position2 !=2) && (position2 !=6) && (position2 !=9) && (position2 !=11))
        {
            //assemble the piano by creating each key one by one
            Key anotherKey = new Key(blackKeys[(frames-660)/60], blackNotes[(frames-660)/60],false);
            //this line actually adds the object to the world
            //       object      horizontal    vertical
            addObject(anotherKey, 85 + 63 * ((frames-660)/60), 80);
            //show message when we are in the bounds of the array
            showText("balck Array index is: " + frames/60, 100, 250);
        } 
        
        frames ++;
    
    }
}
