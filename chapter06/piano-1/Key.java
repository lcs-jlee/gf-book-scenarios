import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    //tracks whether is "piano key down" image has already been set or not.
    private boolean isDown;
    /**
     * Create a new key.
     * Constructor
     */
    public Key()
    {
        //Key begins in the "up" position
        isDown = false;
        
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        //when the key image is not already showing "down"
        //AND
        //the "g"key on the keyboard has been pressed
        if (!isDown && Greenfoot.isKeyDown("g"))
        {
            setImage("white-key-down.png");
            play();
            isDown = true;
        }
        if (isDown == true && !Greenfoot.isKeyDown("g"))
        {
            setImage("white-key.png");
            isDown = false;
        }
    }
    /**
     * Play the note of this key
     */
    public void play()
    {
        Greenfoot.playSound("3a.wav");
        
    }
}

